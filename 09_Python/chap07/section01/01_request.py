#01_request
#request 라이브러리 가져오기
#request 기능: 사이트 접속에서 html 내용 가져오기 라이브러리
import requests

url="https://WWW.simple-coding.com/"
#TODO: .get(인터넷주소): 그 주소에 html 내용을 가져옵니다.
response = requests.get(url)

#신호: 200(ok), 404(not_found)
#TODO: response.status_code: 그 주소의 응답코드가 있음
print("신호(응답코드):",response.status_code)
print("html 앞부분")
#TODO: response.text   :html 전체 내용이 있음
print(response.text[:1000])  #앞부분 1000자만 출력