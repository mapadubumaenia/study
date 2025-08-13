#퀴즈
import requests
from bs4 import BeautifulSoup

url="https://www.simple-coding.com/guest-book/"
response=requests.get(url)

soup=BeautifulSoup(response.text,"html.parser")

result=soup.select("a")
print(result)

for i in result:
    if i.get("href")!=None:
        print(i.get("href"),i.text)

