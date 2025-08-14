# flask(플라스크) : 스프링의 컨트롤러 처럼 웹서비스할 수 있는 라이브러리
from flask import Flask, request, jsonify, Response
import json

# __name__ : 파이썬에 사용하는 예약어 : 파이썬 파일명
app = Flask(__name__)

# 전체조회 함수
# TODO: 사용법 : @플라스크변수.route("url", methods=["방식"])
@app.route("/books", methods=["GET"])
def getAll():
    # DB가 없으므로 가라데이터 return
    books = [
        {"id": 1, "title": "파이썬 입문"},
        {"id": 2, "title": "AI 기초"}
    ]
    # TODO: 한글 깨짐 방지 클래스
    # TODO: 사용법 :  Response(json.dumps(변수,ensure_ascii=False),
    #                         content_type='application/json; charset=utf-8')
    return Response(
        json.dumps(books,ensure_ascii=False),
        content_type='application/json; charset=utf-8'
    )

# 1개 조회: 상세조회
# 테스트 : 기본주소/books/one?id=20
@app.route("/books/one", methods=["GET"])
def get():
    # TODO: 사용법: 결과=request.args.get("url변수", type=int), 쿼리스트링 값 조회 함수
    id=request.args.get("id", type=int) # 쿼리스트링 값 가져오기
    # TODO: 사용법: jsonify(딕셔너리값),신호
    return jsonify({"id": id}),200      # 200(OK, 성공신호)

# TODO: jsp: 조회, 추가/수정/삭제(post방식)
#     : 리액트/뷰/파이썬: 조회(get),추가(post),수정(put),삭제(delete)
# TODO: 테스트 도구: POST, PUT, DELETE 방식으로 넘길 수 있게 하는 도구
#  ( 테스팅 도구 : POSTMAN 도구 등)
#  추가/수정/삭제
@app.route("/books/add", methods=["POST"])
def insert():
    data=request.json
    app.logger.info(data)    #디버깅 로깅
    return "추가",200



if __name__ == '__main__':
    # TODO: 톰캣과 비슷, 파이썬 내장 서버
    #  host='0.0.0.0' : 외부 접속 가능
    #  port=5000      : 포트번호 지정
    app.run(debug=True, host='0.0.0.0', port=5000)
