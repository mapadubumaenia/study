#크롤링한 데이터를 파일로 쓰기
# 02_bs4_title.py
# 뷰티풀숩 사용법
# request 가져오기
import json

import requests
# TODO: 뷰티풀숩 가져오기
from bs4 import BeautifulSoup

# 1) html 가져오기
url="https://www.simple-coding.com/"
response = requests.get(url)

# TODO: 2) html 에서 필요한 정보만 뽑아내기 준비
#  response.text : html 내용
#  사용법: 결과 = BeautifulSoup(html내용.text, "html.parser")
soup = BeautifulSoup(response.text, "html.parser") # html 태그 정보 분석

# TODO: 3) title 태그 정보만 가져오기
#  사용법: 결과.select_one("태그") (이름이 같은 태그가 여러개 있으면 첫번째 태그만 가져옵니다.)
result=soup.select_one("title")        # title 태그(css선택자) 정보만 가져오기
# print(result)

#TODO json : 데이터를 저장하거나 주고받을 때 쓰는 텍스트 기반 데이터 형식
#TODO: json 파일로 만들기: 배열을 준비 (딕셔너리로 배열에 정보 넣기)
data=[]
data.append({
    "title":result.text.strip(),  #태그 사이의 글자(공백 제거)
})
#TODO: json.dump(배열,파일별명): json 파일에 글자쓰기 함수
#  옵션:ensure_ascii=False =>한글 깨짐 방지
with open("../output/sample.json","w",encoding="utf-8") as f:
    json.dump(data,f,ensure_ascii=False,indent=2)
