# 06selenium 로그인+크롤링해서 + 모든이지미 다운로드 하기
import os
import time

from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.common.by import By
from webdriver_manager.chrome import ChromeDriverManager
import requests


driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()),options=Options())
driver.get("https://www.saucedemo.com/")

driver.find_element(By.CSS_SELECTOR,"#user-name").send_keys("standard_user")
driver.find_element(By.CSS_SELECTOR,"#password").send_keys("secret_sauce")
driver.find_element(By.CSS_SELECTOR, "input[type='submit']").click()

# 로그인 시간 지연
time.sleep(1)

# TODO: 이미지 css선택자 선택
t=driver.find_elements(By.CSS_SELECTOR,".inventory_item_img")

for i in range(len(t)):
#     이미지의 인터넷주소:src속성
    img=t[i].get_attribute("src")  #이미지 인터넷주소
    if img:
        data=requests.get(img).content  #이미지 파일 가져오기
        name=os.path.basename(img)   #이미지 이름 추출
        with open(f"../simg/{name}","wb") as f:      #이미지 파일 만들기
            f.write(data)

driver.quit()



