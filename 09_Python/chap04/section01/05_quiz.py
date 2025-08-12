#퀴즈
# § a 변수에 {“name”:“장길산”, “age”:30} 가 있습니다. 화면에 모두 표시하세요
# § a 변수의 age 값을 화면에 표시하세요
# 결과: 30
# § a 변수의 age 값을 35로 수정해서 화면에 표시하세요
# § 새로운 (키, 값)을 추가하세요
# (“job”, “영업사원”) § “job” 키를 삭제하고 a 변수를 화면에 표시하세요

a={"neme":"장길산","age":30}
print(a)

print(a["age"])

a["age"] = 35
print(a)

a["job"]="개발자"
print(a)

del a["job"]
print(a)