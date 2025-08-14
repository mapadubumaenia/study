# 로그인 후  첫 번째 상품명
# 실습 사이트 : https://www.saucedemo.com/
# 아이디: standard_user
# 암호: secret_sauce
import time

from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.common.by import By
from webdriver_manager.chrome import ChromeDriverManager

# 웹브라우저 설치 옵션
driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()), options=Options())
# 로그인 페이지 접속
driver.get("https://www.saucedemo.com/")

driver.find_element(By.CSS_SELECTOR,"#user-name").send_keys("standard_user")
driver.find_element(By.CSS_SELECTOR,"#password").send_keys("secret_sauce")

driver.find_element(By.CSS_SELECTOR, "input[type='submit']").click()

time.sleep(1)
t=driver.find_elements(By.CSS_SELECTOR,".inventory_item_name")
y=t[1].text
print(y)

#끝내기
driver.quit()

