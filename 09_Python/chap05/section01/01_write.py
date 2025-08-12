#TODO 텍스트 파일 만들기
# \n :줄바꿈 문자
# TODO: 사용법: with open("경로/파일명","w",encoding="utf-8") as 파일별명:
#   옵션: "w"             : 쓰기로 파일 열기
#       encoding="utf-8" : 한글 때문에 넣기
#   파일별명.write("글자\n")
with open("../output/sample.txt","w",encoding="utf-8") as f:
    f.write("내이름은\n")
    f.write("키라요시카게\n")