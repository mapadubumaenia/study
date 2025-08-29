# 다양한 차트 보기
# 02_Visualize Library.md
# 햄버거메뉴 - Visualize Library 메뉴 클릭
# Create new visualization 클릭
# Aggregation Based -> Vertical Bar 클릭(막대 그래프)

# 예제 1) 히스토그램 집계 차트 보기
# histogram(히스토그램) 집계: 일정한 간격으로 집계 보기
#   1) x-axis:
#      - Aggregation: Histogram
#      - Field      : salary
#   2) y-axis: 그대로(기본: count)
#      - Aggregation: count
#  Update 버튼 클릭 -> 차트 나옴

# 예제 2) 부서별(x좌표), 평균급여(y좌표) 차트 보기
# 부서별  : terms(용어 집계) - dno(부서번호) == group by dno 
# 평균급여: avg(salary) 
#   1) x-axis:
#      - Aggregation: terms
#      - Field      : dno
#   2) y-axis: 그대로(기본: count)
#      - Aggregation: Average
#      - Field      : salary
#  Update 버튼 클릭 -> 차트 나옴

# 예제 3) 부서별(x좌표) 하위 25%, 상위 75%(y좌표) 급여 차트 보기
#   1) x-axis:
#      - Aggregation: terms
#      - Field      : dno
#   2) y-axis: 
#      - Aggregation: percentiles
#      - Field      : salary
#      - Percents   : 25
#                     75
#  Update 버튼 클릭 -> 차트 나옴

# 예제 4) 직위별(x좌표) 평균급여(y좌표) 차트 보기
# 부서별  : terms(용어 집계) - job(직위) == group by job
# 평균급여: avg(salary) 
#   1) x-axis:
#      - Aggregation: terms
#      - Field      : job.keyword
#   2) y-axis: 
#      - Aggregation: Average
#      - Field      : salary
#  Update 버튼 클릭 -> 차트 나옴