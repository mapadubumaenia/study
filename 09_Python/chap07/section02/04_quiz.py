#정규표현식 실습
# 크롤링시 자세하게 검색하기 위해 사용
#TODO: re: 정규표현식 라이브러리
import re


text="안녕 홍길동"

#TODO: 사용법: re.search(r"검색어",문장): =>있으면 True, 없으면 False
if re.search(r"홍길동",text):
    print("있음")
