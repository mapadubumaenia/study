import os

import requests
from bs4 import BeautifulSoup

try:
    #html 가져오기
    url="https://www.simple-coding.com/"
    response=requests.get(url)
    # html 파싱
    soup=BeautifulSoup(response.text,"html.parser")


    #3)img 만 모두 가져오기
    #TODO:select("css선택자"): 그, 태그 정보를 가져옵니다.
    result = soup.select("img")
    # print(result)

    for i in result:
        if i.get("src")!=None:  #src 있는것만 가져오기
            img=i.get("src")  #src 이미지 인터넷 주소
            print(img)        #이미지 인터넷 주소 화면표시
            # TODO:request.get(이미지인터넷주소).content:이미지가 다운로드됨(데이터임 ,파일아님)
            data=requests.get(img).content  #이미지 파일 (바이너리,이진파일)
            # TODO: os.path.basename(img) : 이미지 인터넷주소에서 이미지이름만 추출하는 명령어
            name=os.path.basename(img)  #이미지 파일 이름 추출
            with open(f"../img/{name}","wb") as f:
                f.write(data)







except Exception as e:
    print(e)