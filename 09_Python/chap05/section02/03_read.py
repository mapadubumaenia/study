#텍스트 파일 읽기
with open("../output/sample.txt","r",encoding="utf-8") as f:
    a=f.read()
    print(a)