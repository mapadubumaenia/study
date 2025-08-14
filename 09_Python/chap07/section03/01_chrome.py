# 셀레니움 기초 실습
# 동적인 사이트: 로그인 등이 필요한 사이트, 리액트, 뷰 사이트
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.common.by import By
from webdriver_manager.chrome import ChromeDriverManager

# TODO:셀레니움 동작: 1_웹브라우저를 뛰움 2)웹브라우저에 값을 넘기기도 함 3)태그 정보 가져오기 4)화면 표시
#  크롤링용 크롬 웹브라우저 설치+ 옵션추가 명령어
driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()), options=Options())
# TODO: 그 브라우저에 인터넷주소 입력
driver.get("https://books.toscrape.com/")

#TODO a 태그 가져오기 : 셀레니움 함수에서
#  사용법: 결과=브라우저변수.find_elements(By.CSS_SELECTOR,"css선택자")
results = driver.find_elements(By.CSS_SELECTOR, "a")

# 반복문 실행 -> 화면 표시(href 주소)
for i in results:
    # TODO: 사용법:태그.get_attribute("href") : 속성의 값을 가져오기
    print(i.get_attribute("href"))
    # TODO: 사용법: 태그변수.text  =>태그사이의 글자 가져오기
    print(i.text)

#  웹브라우저 끝내기
driver.quit()
