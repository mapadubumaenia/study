# json 파일로 만들기: js 객체 배열로 저장된 파일
import json

import requests
from bs4 import BeautifulSoup

# 1) 사이트 접근해서 정보가져오기
url="https://www.simple-coding.com/guest-book/"
response = requests.get(url)

# 2) 결과 파싱
soup = BeautifulSoup(response.text, "html.parser")

# 3) title (태그, css선택자)
result=soup.select_one("title") # title 결과만 가져오기
# print(result)

data=[]
data.append({
    "title":result.text.strip(),
})

# TODO: json 파일로 만드세요: output/quiz.json
with open("../output/quiz.json","w",encoding="utf-8") as f:
    json.dump(data,f,ensure_ascii=False,indent=2)