#03_bs4_a.py
#뷰티풀숩 사용법
#requests 가져오기
import requests
#TODO: 뷰티풀숩 가져오기
from bs4 import BeautifulSoup

#html 가져오기
uri="https://www.simple-coding.com/"
response=requests.get(uri)

#TODO: html 에서 필요한 정보만 뽑아내기
#  response.text : html 내용
#  사용법: 결과 = BeautifulSoup(html내용.text, "html.parser")
soup=BeautifulSoup(response.text,"html.parser")

#TODO: 3)title 태그 정보만 가져오기
# 사용법: 결과.select_one("태그")
result=soup.select_one("title")
print(result)