# 이미지 이름 가져오기
from urllib.parse import urljoin

import requests
from bs4 import BeautifulSoup

try:
    # 1) 웹페이지 가져오기
    url="https://www.simple-coding.com/"
    response=requests.get(url)

    # 2) html 파싱(해석, 메모리 올리기)
    soup=BeautifulSoup(response.text,"html.parser")

    # 3) img 만 가져오기
    result=soup.select("img")
    # print(result)            # 잠깐 확인

    for i in result:
        if i.get("src")!=None:   # src 속성 있는것만 가져오기
            # print(i.get("src"))  # src 속성값 표시
            # TODO: urljoin("인터넷기본주소", "경로") : 인터넷주소 합치기 함수
            print(urljoin("https://www.simple-coding.com/", i.get("src")))

except Exception as e:
    print(e)







