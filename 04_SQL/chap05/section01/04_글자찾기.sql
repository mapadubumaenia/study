--£ 글자 찾기 함수
--① 예제) 부서테이블에서 부서명에서 ‘S’ 위치를 화면에 표시하세요
-- 사용법) SELECT INSTR(컬럽,'찾을글자') FROM 테이블;




SELECT DNAME, INSTR(DNAME,'S')
FROM DEPARTMENT;