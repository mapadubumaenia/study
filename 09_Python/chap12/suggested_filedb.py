# suggested_filedb.py

# 라이브러리 import: pandas, sklearn(ai), 엘라스틱, datetime(시간)
# TODO: 엘라스틱 설치: pip install "elasticsearch>=8,<9"
import pandas as pd
from sklearn.neighbors import NearestNeighbors
from elasticsearch import Elasticsearch
from datetime import datetime

# TODO: 1) 엘라스틱서치 연결
es = Elasticsearch(
    ["http://localhost:9200"]
)
# TODO: 2) 엘라스틱에서 복제 filedb-likes 데이터 가져오기
#  => filedb-likes 의 필드("email", "file_title", "like_count") 데이터 가져옴
res = es.search(
    index="filedb-likes",
    body={
        "size": 10000,
        "_source": ["email", "file_title", "like_count"]
    }
)
# TODO: 3) filedb-likes 데이터 -> 배열 -> 판다스의 데이터프레임으로 넣기
data = []  # 빈배열(리스트)
# res['hits']['hits'] : 딕셔너리({}) : hits.hits 접근
for hit in res['hits']['hits']:
    src = hit['_source']
    data.append({
        'id': hit['_id'],                  # 기본키(문서id)
        'email': src['email'],             # email 필드
        'file_title': src['file_title'],   # file_title 필드
        'like_count': src['like_count']    # like_count 필드
    })
print(data)                                # 디버깅(배열)
df=pd.DataFrame(data)                      # 판다스 데이터프레임으로 넣기
print(df)                                  # 디버깅(판다스 df)

# TODO: 4) AI 진행: 피봇테이블로 변경: 행(email), 열(file_title), 실제값(like_count),기본값(0)
mx = df.pivot_table(index='email', columns='file_title', values='like_count', fill_value=0)

# TODO: 5) AI 학습: 현업필터링 코사인 유사도 모델(추천 모델): 좋아요/안좋아요 (딱 2개일경우 사용)
model = NearestNeighbors(metric='cosine', algorithm='brute')
model.fit(mx.values)

# TODO: 6) 추천 함수 제작 -> 나중에 함수를 통채로 반복문 실행
def rec_user(user_email, top_n=2):
    user_idx = mx.index.get_loc(user_email)             # 이메일에 해당하는 행번호(인덱스번호) 가져오기
    tfeature = mx.to_numpy()[user_idx].reshape(1, -1)   # 2차원 넘파이 배열로 변경
    print(tfeature)                                     # 디버깅: tfeature 확인 : [[1. 0.]]

# print(rec_user("forbob@naver.com"))                     # 테스트
#     TODO: 7) 비슷한 취향을 가진 사용자 찾기 :(자기자신포함)
#       사용법: 방향벡터, 인덱스번호= model.kneighbors(넘파이배열, n_neighbors=찾을숫자)
    dt, inx = model.kneighbors(tfeature, n_neighbors=2)



#     TODO: 8) 비슷한 취향을 가진 사용자의 인덱스번호 찾기 + 자기자신은 제외
#     print(inx)                                            # [[1 0]]
#     print(inx.flatten())                                  # [[1 0]] -> [1 0] : 2차원 -> 1차원
    similar_idx = [i for i in inx.flatten() if i != user_idx]  # 자기 자신 제외하고 배열 만들기(인덱스번호)
    similar_users = [mx.index[i] for i in similar_idx]           # 유사 사용자 이메일 가져오기



#  TODO: 9) 내가 좋아요 누른것을 찾기
    my_likes = df.loc[df['email'] == user_email, 'file_title'].tolist()


#  TODO: 10) 유사 사용자의 이메일중에서 내가 좋아요 누른것은 뺀 file_title 찾기
    rec_sum = (
        df[df['email'].isin(similar_users) & ~df['file_title'].isin(my_likes)]
          .groupby('file_title')['like_count'].sum()
    )

#  TODO: 11) 내림차순 정렬해서(좋아요 합이 제일 큰순) 첫번째가 가장 추천하는 아이템이 됨
    top_rec = rec_sum.sort_values(ascending=False).head(top_n)
    return top_rec.index.tolist()  # 추천 제목 리스트 반환



print(rec_user("forbob@naver.com"))                     # 테스트2


# TODO: 12) 최종: 엘라스틱 서치 db: filedv-likes-suggested 인덱스에 넣기
#     =>모든 사용자에 대해 추천 목록 저장
print(mx.index)    #유저목록
for user in mx.index:  # 모든 사용자 반복
    slist = rec_user(user, top_n=2)  # 추천 결과


#  TODO: 13) 엘라스틱 서치 DB 저장
    es.index(
        index="filedb-likes-suggested",  # 추천 결과 저장할 인덱스
        id=user,  # 사용자 이메일을 문서 ID로 사용
        document={
            "email": user,
            "suggested": slist,  # 추천 목록
            "update_time": datetime.now()  # 갱신 시간
        }
    )