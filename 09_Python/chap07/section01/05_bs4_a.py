#예외처리

import requests
from bs4 import BeautifulSoup

# TODO: 예외처리: try/except {} x =>:, 들여쓰기 이용

try:

    #1) html 가져오기
    url="https://www.simple-coding.com/"
    response = requests.get(url)

    #2) html 정보를 파싱(해석,메모리에 올려둠)
    soup = BeautifulSoup(response.text,"html.parser")

    #TODO: 인터넷 주소,a태그 사이 값
    #3) a 태그만 가져오기
    results=soup.select("a")
    print(results)

    for i in results:
        #TODO: i.get("html속성"): html 속성 값을 가져옵니다.
        # i.text               : 태그 사이의 글자를 가져옵니다.
        if i.get("href")!=None:  #href 값이 없는 것은 가져오지 않는다.
            print(i.get("href"),i.text)
except Exception as e:
    #TODO: Exception 클래스: 에러정보들 있음
    print(e)
