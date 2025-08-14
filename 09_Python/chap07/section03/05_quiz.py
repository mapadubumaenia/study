import re
import time

from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.common.by import By
from webdriver_manager.chrome import ChromeDriverManager

driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()),options=Options())
driver.get("https://www.saucedemo.com/")

driver.find_element(By.CSS_SELECTOR,"#user-name").send_keys("standard_user")
driver.find_element(By.CSS_SELECTOR,"#password").send_keys("secret_sauce")
driver.find_element(By.CSS_SELECTOR, "input[type='submit']").click()

# 로그인 시간 지연
time.sleep(1)
# 로그인후 상품 명 가져오기
t=driver.find_elements(By.CSS_SELECTOR,".inventory_item_price")

# t:상품명 배열중에서 T-Shirt 또는 Backpack
#  TODO: 정규표현식에서 또는 |  ,
for i in range (len(t)):
    if re.search("29.99|49.99",t[i].text):
        y=t[i].text
        print(y)

driver.quit()