#크롤링에서 정규 표현식 사용하기
# a 태그 정보를 가져와서 json 파일로 만들기+ course 있는거만 만들기
import re

import requests
from bs4 import BeautifulSoup
import json

#TODO json 파일 쓰기
def write(name,result):
    with open(name,"w",encoding="utf-8") as f:
        json.dump(result,f,ensure_ascii=False,indent=2)



# 1) html 가져오기
url="https://www.simple-coding.com/"
response = requests.get(url)

# 2) html 정보 파싱(해석, 메모리에 올려둠)
soup = BeautifulSoup(response.text, "html.parser")

# TODO: 인터넷 주소, a태그 사이 값
# 3) a 태그만 모두 가져오기
results=soup.select("a")
# print(results)           # 잠깐 확인용

#TODO :여기서 부터 수정
# TODO: json 파일로 사용할 배열
data=[]
for i in results:
    if i.get("href")!=None:
         # TODO: 여기수정: 인터넷 주소에서 course 글자가 있는것만 배열에 추가
         if re.search(r"course",i.get("href")):
            data.append({
             "href":i.get("href").strip(),
             "text":i.text.strip(),
         })
write("../output/sample3.json",data)