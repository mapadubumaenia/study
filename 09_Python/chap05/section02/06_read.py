# 이진 파일 읽기
# TODO: 사용법: with open("경로/파일명","rb") as 파일별명:
#                  변수=파일별명.read().decode('utf-8')
with open("../output/sample.bin","rb") as f:
    # 파일의 utf-8 글자를 읽기
    a=f.read().decode('utf-8')
    print(a)