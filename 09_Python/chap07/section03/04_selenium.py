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

time.sleep(1)
t=driver.find_elements(By.CSS_SELECTOR,".inventory_item_name")

# TODO: 모든 상품명 표시
for i in range(len(t)):
    y=t[i].text
    print(y)

driver.quit()