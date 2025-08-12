a,b,c=map(int,input().split())
d=int(input())

total=(a*3600)+(b*60)+c+d

total %=3600*24

a,rem=divmod(total,3600)
b,c=divmod(rem,60)
print(a,b,c)