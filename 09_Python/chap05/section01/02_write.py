#기존파일에 텍스트 추가!
#  사용법: with open("경로/파일명","a",encoding="utf-8") as 파일별명:
#    옵션 "a" : 기존 파일에 글자를 끝에 추가
with open("../output/sample.txt","a",encoding="utf-8") as f:
    f.write("33세 독신\n")
    f.write("일은 성실하게 빈틈없이 잘 하는데, 열정도 영 없고... 어딘가 엘리트 같고 기품이 있어 여사원들에게는 인기가 있지만, 회사에서\n")