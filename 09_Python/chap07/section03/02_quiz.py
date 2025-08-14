# 셀레니움 기초 실습
# 동적인 사이트: 로그인 등이 필요한 사이트, 리액트, 뷰 사이트
import time

from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.common.by import By
from webdriver_manager.chrome import ChromeDriverManager

# 웹브라우저 설치,옵션
driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()), options=Options())
driver.get("https://quotes.toscrape.com/login")

driver.find_element(By.CSS_SELECTOR,"username").send_keys("admin")
driver.find_element(By.CSS_SELECTOR,"password").send_keys("admin")
driver.find_element(By.CSS_SELECTOR,"input[type='submit']").click()

time.sleep(1)
t=driver.find_elements(By.CSS_SELECTOR,"text")
y=t[0].text
print(y)
