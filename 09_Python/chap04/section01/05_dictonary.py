# 시련은 흐르는 피로 끝이 난다.
# TODO: 딕셔너리 (자바의 Map과 유사), js 객체 유사(json)
#  사용법: 변수={"속성":값, "속성2":값2}
a={"name":"홍길동", "age":20}
print(a)

# 특정 속성(키) 값 표시
#  TODO: 사용법: 변수["속성"]
print(a["age"])

# 수정
#  TODO: 사용법: 변수["속성"]
a["age"]=25
print(a)

# 새속성과 값 추가
# TODO: 사용법: 변수["속성"]
a["job"]="개발자"
print(a)

#  속성(키)값 삭제하기
del a["job"]
print(a)


