# 퀴즈) https://www.simple-coding.com/guest-book/ 정보 1500자만 가져와 출력
import requests

uri="https://www.simple-coding.com/guest-book/"
response=requests.get(uri)

print("신호 (응답코드):",response.status_code)
print("html 앞부분")
print(response.text[:1500])