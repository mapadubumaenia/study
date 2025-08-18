# # 1)
# def myprint2():
# print("안녕")
# myprint2()
# # 2)
# def myhello2(x):
# print(x)
# myhello2("hello")
# # 3)
# def square2(x):
# return x**2
# print(square2(4))

#TODO 전부 람다로 바꿔라
#1
myprint2= lambda :print("안녕")
myprint2()

myhello2= lambda x:print(x)
myhello2("hello")

square2= lambda x:x**2
print(square2(4))