#파일 읽기: 1줄씩 읽기
with open("../output/sample.txt","r",encoding="utf-8") as f:
    # 1줄씩 읽어보자
     for line in f:
         print("[경고]"+line.strip())
