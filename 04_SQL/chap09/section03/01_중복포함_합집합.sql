--£ 합집합 사용하기
--① 예제) 부서번호를 기준으로 중복된 데이터를 포함해서 부서,사원테이블의 행을 모두 세로로
--화면에 표시하세요


SELECT DNO,DNAME FROM DEPARTMENT
UNION ALL 
SELECT DNO,ENAME FROM EMPLOYEE;

--해석: 중복을 포함해서 합집합 합니다.
--주의: 컬램개수 맟추기, 자료형도 맟춰야 한다. (컬럼명은 달라도 자료형이 같으면 괜찮음)

