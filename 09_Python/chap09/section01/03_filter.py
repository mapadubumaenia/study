#필터
numbers = [1,2,3,4]
# 짝수만 배열로 만등기
# TODO: 사용법 filter(람다,배열)
#   설명:배열의 끝까지 반복실행,조건이 참인것만 새로운 배열을 만듬
a=list(filter(lambda x:x%2==0,numbers))
print(a)