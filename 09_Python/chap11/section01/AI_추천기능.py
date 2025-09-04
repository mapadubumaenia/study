# 좋아요/안좋아요 양자 택일 기반 추천: 코사인 유사도 추천
import pandas as pd
from sklearn.neighbors import NearestNeighbors
# 협업 필터링
# 샘플 데이터 생성(forbob4 제외)
data={
 'email': [
 'forbob@naver.com', 'forbob@naver.com',
 'forbob2@naver.com', 'forbob2@naver.com'
 ],
 'file_title': [
 '제목 1', '제목 2',
 '제목 2', '제목 3'
 ],
 'like_count': [1, 1, 1, 1] # 모두 1
}
# 0) 판다스딕셔너리 만들기
df=pd.DataFrame(data)
print(df)
print()
# 1) 사용자(행) -제목(컬럼),값(좋아요수)행렬 만들기
matrix=df.pivot_table(index=["email"],          #행: 이메일
                 columns=["file_title"],   #열(컬럼): 이미지제목
                 values="like_count",      #값    :좋아요수
                 fill_value=0,)            #없는값: 0
print(matrix)

# 2) KNN 모델 학습:제일 유사한(취향) 사람 찾기
# TODO 코사인 유사도 ai 모델,내부(brute:완전탐색 알고리즘)
model=NearestNeighbors(metric="cosine",algorithm="brute")
model.fit(matrix)                   #모델 학습(내 데이터)


# 3) 추천 대상 사용자 지정
tuser="forbob@naver.com"
# TODO 사용법: 변수.index.get_loc(행이름)=>결과:행번호
tuser_idx=matrix.index.get_loc(tuser)    #행 인덱스 번호 가져오기
print(tuser_idx)                         #1(행번호)
np=matrix.to_numpy()                    #판다스=>넘파이 배열로 변경
tfeature=np[tuser_idx].reshape(1,-1)     #1행 n열 배열로 변경
print(tfeature)

# 4) 비슷한 사용자 찾기 :1차원 배열 입력 널기
# TODO 사용법: model.kneighbors(1차원배열,n_neighbors=찾을개수(자신포함))
# 방향      : 1(비슷한사람),0(관계없음),-1(안비슷한사람)
# 인덱스번호: 비슷한 취향을 가진 이메일의 행번호가 리턴됨
dt, inx=model.kneighbors(tfeature,n_neighbors=2)
print(inx)             #[[1 0]] =>[1,0] (2차원 배열을 1차원으로 변경)

# 5)2차원->1차원(flatten())+자기자신제외
similar_idx=[i for i in inx.flatten() if i != tuser_idx]
print(similar_idx)                     #자기 자신 제외된 비슷한 취향을 가진 이메일의 행번호
# 행이름: 변수.index[인덱스번호] =>행이름(이메일)
semeil=[matrix.index[i] for i in similar_idx]              #비슷한 취향을 가진 사람의 이메일 뽑기
print(semeil)                                             #['forbob2@naver.com']


##['forbob2@naver.com'](같은 취향을 가진 사람)
# 위사람의 타이틀중에 forbob은 제외하고 타이틀 뽑기
#select file_title,sum(like_count)
# from tb_file_db(email.있음)
# where email in#['forbob2@naver.com']
# and file_title not in #['forbob2@naver.com'] 이 좋아한 타이틀
# group by file_title
# order by like_count desc

# TODO: forbob2@naver.com 이 좋아요 누른 타이틀 추천
#  1)forbob@naver.com 이 좋아한 타이틀
my_like=df.loc[df["email"]==tuser,"file_title"]
print(my_like)                                      #forbob이 좋아한 타이틀 뽑기 성공

# TODO 2) 위의 전체쿼리를 판다스로 조회하기
rec_sum=(
    df.loc[(df["email"].isin(semeil)) & ~(df["file_title"].isin(my_like))]
    .groupby(["file_title"])["like_count"].sum()
)
top_N=rec_sum.sort_values(ascending=False).head(2)
print(top_N)      #타이틀 제목(추천),좋아요 개수합
print(top_N.index[0])    #타이틀제목(추천)