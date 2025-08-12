# 파일 1줄씩 읽기
with open("../output/sample2.txt","r",encoding="utf-8") as f:
    for line in f:
        print("[더 월드]"+line.strip())