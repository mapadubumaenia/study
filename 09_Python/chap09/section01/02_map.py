#
#map 함수 :배열의 끝까지 자동 반복문 실행, 자바 stream과 비슷

numbers=[1,2,3,4,5]

# 1씪 더하기
# TODO: list:결과를 배열로 바꾸는 함수
#  사용밥: map(lambda,배열)
#   설명: 배열의 끝까지 람다가 반복실행되면 새로운 배열이 생깁니다.
print(list(map(lambda x:x+1,numbers)))

# 제곱수 구하기
print(list(map(lambda x:x**2,numbers)))
