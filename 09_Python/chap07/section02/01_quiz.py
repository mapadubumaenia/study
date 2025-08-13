import requests
from bs4 import BeautifulSoup

try:
    # 1) 사이트 접근해서 정보가져오기
    url="https://www.simple-coding.com/guest-book/"
    response = requests.get(url)

    # 2) 결과 파싱
    soup = BeautifulSoup(response.text, "html.parser")

    # 3) title (태그, css선택자)
    result=soup.select_one("title") # title 결과만 가져오기

    with open("../output/sample2.txt","w",encoding="utf-8") as f:
        f.write(result.text)

except Exception as e:
    print(e)
