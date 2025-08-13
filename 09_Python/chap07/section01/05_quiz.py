import requests
from bs4 import BeautifulSoup

try:
    url="https://www.simple-coding.com/guest-book/"
    response=requests.get(url)

    soup=BeautifulSoup(response.text,"html.parser")

    result=soup.select("a")
    print(result)

    for i in result:
        if i.get("href")!=None:
            print(i.get("href"),i.text)
except Exception as e:
    print(e)
