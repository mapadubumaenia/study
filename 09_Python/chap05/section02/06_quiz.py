#퀴즈 파이너리파일 읽기
with open("../output/sample2.bin","rb")as f:
    a=f.read().decode("utf-8")
    print(a)