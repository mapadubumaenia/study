#TODO: 배열(list) , 추가, 수정 , 삭제
a=["a","b","c","d"]
print(a)

# 1번째 값 표시
print(a[0])

# TODO:리스트에 값 추가
# 사용법: 배열.append(값)
a.append("e")
print(a)

# TODO: 리스트에 값 수정
# 사용법: 배열[인덱스]=수정값
a[0]="aa"
print(a)

# TODO: 리스트에 값 삭제
#  사용법: 배열.remove(값)
a.remove("e")
print(a)

# (참고) 배열의 크기(개수)
# len(배열)
print(len(a))