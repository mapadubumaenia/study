#퀴즈 json 파일로 넣기
import requests
from bs4 import BeautifulSoup
import json

def write(name,result):
    with open(name,"w",encoding="utf-8") as f:
        json.dump(result,f,ensure_ascii=False,indent=2)

url="https://www.simple-coding.com/guest-book/"
response=requests.get(url)

soup=BeautifulSoup(response.text,"html.parser")

result=soup.select("a")
print(result)

data=[]

for i in result:
    if i.get("href")!=None:
        data.append({
            "href":i.get("href").strip(),
            "text":i.text.strip(),
        })




write("../output/sample4.json",data)

