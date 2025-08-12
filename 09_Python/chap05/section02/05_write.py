# 바이너리 =이진파일 쓰기
with open("../output/sample.bin","wb")as f:
    # utf-8 바꾸어서 쓰기
    f.write("안녕\n".encode("utf-8"))
    f.write("홍길동\n".encode("utf-8"))