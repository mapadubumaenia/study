#정규표현식 실습
# 크롤링시 자세하게 검색하기 위해 사용
#TODO: re: 정규표현식 라이브러리
import re

# 실습 글자
text="welcome to simple-coding site"

#TODO: 사용법: re.search(r"검색어",문장): =>있으면 True, 없으면 False
if re.search(r"(SITE)".lower(),text):
    print("있음")