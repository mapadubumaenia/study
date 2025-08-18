#2차원 ->1차원 ->2차원 바꾸기
import numpy as np
x = np.array([1, 2, 3, 4])


#TODO 2차원: (2행, 2열) 변경
#   사용법: 넘파이 배열.reshape(바깥배열개수,안쪽배열개수,안안쪽 배열개수,...)
#   주의점: reshape(값,값2)=>    값*값2=배열의 총원소개수가 같아야 사용할수 있음
y=x.reshape(4,1)
print(y)


# n차원 -> 1차원 배열
# TODO: 사용법: 넘파이배열.flatten()
z=y.flatten()
print(z)
