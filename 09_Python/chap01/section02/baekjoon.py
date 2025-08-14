

a=list(map(int,input().split()))
b=list(map(int,input().split()))

def sum_array(a):
    return sum(a)


if sum_array(a) > sum_array(b):
    print(sum(a))

elif sum_array(a) < sum_array(b):
    print(sum(b))
else:
    print(sum(a))




