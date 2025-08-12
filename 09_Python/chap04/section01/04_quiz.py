# § a 변수에 {“a”,“a”,“b”} 가 있습니다. 화면에 모두 표시하세요
# § a 변수의 끝에 “c” 값을 추가하세요 § “c” 값을 삭제하고 a변수의 값을 화면에 표시하세요

a={"a","a","b"}
a=sorted(a)
print(a)

a.append("c")
print(a)

a.remove("c")
print(a)

