from urllib.parse import urljoin

import requests
from bs4 import BeautifulSoup

try:
    # 1) 웹페이지 가져오기
    url="https://www.simple-coding.com/guest-book/"
    response=requests.get(url)

    # 2) html 파싱(해석, 메모리 올리기)
    soup=BeautifulSoup(response.text,"html.parser")

    # 3) img 만 가져오기
    result=soup.select("img")

    for i in result:
        if i.get("src")!=None:
            print(urljoin("https://www.simple-coding.com/guest-book/",i.get("src")))

except Exception as e:
    print(e)

