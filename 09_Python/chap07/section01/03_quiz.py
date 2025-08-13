# 퀴즈) https://www.simple-coding.com/guest-book/ title 태그 정보만 화면에 표시
# requests, BeautifulSoup 사용

import requests
from bs4 import BeautifulSoup

uri="https://www.simple-coding.com/guest-book/"
response=requests.get(uri)
soup=BeautifulSoup(response.text,"html.parser")

result=soup.select_one("title")
print(result.text)