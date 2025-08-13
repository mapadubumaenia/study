# 이미지 다운받아 보기 크롤링으로
import os

import requests
from bs4 import BeautifulSoup

try:
    url="https://www.simple-coding.com/guest-book/"
    response = requests.get(url)
    soup = BeautifulSoup(response.text,"html.parser")
    result=soup.select("img")

    for i in result:
        if i.get("src")!=None:
            img=i.get("src")
            print(img)
            data=requests.get(img).content
            name=os.path.basename(img)
            with open(f"../img2/{name}","wb") as f:
                f.write(data)


except Exception as e:
    print(e)