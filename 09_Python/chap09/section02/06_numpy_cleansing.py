#배열 클렌징: 불필요 데이터 변경, 초기화(0,'')
#불필요 데이터==결측값
import numpy as np
#null==None
arr=np.array([1,2, None, 4],dtype=float)
print(arr)

#TODO:None->0변경
# 사용법: 넘파이.nan_to_num(넘파이배열,nan=바꿀값)
b=np.nan_to_num(arr,nan=0)
print(b)

#글자배열 생성
arr2=np.array(['a',None,'b'],dtype=object)
#TODO: None=>''변경
# 사용법:넘파이.where(넘파이배열==None,'바꿀값',넘파이배열)
print(arr2)
c=np.where(arr2==None,'',arr2)
print(c)