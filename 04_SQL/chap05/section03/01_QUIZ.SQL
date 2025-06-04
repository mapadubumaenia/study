--② 퀴즈) 현재 날짜를 (SYSDATE) 아래 날짜 포맷으로 화면에 표시하세요

SELECT TO_CHAR(SYSDATE,'YYYY--MM--DD HH24:MI:SS' )
FROM DUAL;