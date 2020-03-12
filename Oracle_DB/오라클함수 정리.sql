-- 문자 함수 테스트
SELECT INITCAP('aPPLe') FROM dual;
SELECT INITCAP('happy birthday to you') FROM dual;
SELECT UPPER('apple') FROM dual;
SELECT LOWER('APPLE') FROM dual;

SELECT LENGTH('apple') FROM dual;
SELECT LENGTH('사과') FROM dual;
SELECT LENGTHB('apple') FROM dual;
SELECT LENGTHB('사 과') FROM dual;

SELECT CONCAT('APP', 'LE') FROM dual;
SELECT CONCAT('APP', 'LE', 'APPLE') FROM dual; -- CONCAT 은 2개 문자열만 붙인다.
SELECT CONCAT(CONCAT('APP', 'LE'), 'APPLE') FROM dual;
SELECT 'APP' || 'LE' FROM dual;
SELECT 'APP' || 'LE' || 'APPLE' FROM dual;

SELECT SUBSTR('951215-1234567', 1, 2) FROM dual; -- 1번째 글자부터 2글자를 추출한다.
SELECT SUBSTR('951215-1234567', 8) FROM dual; -- 8번째 글자부터 끝까지 추출한다.
SELECT SUBSTR('951215-1234567', -7) FROM dual; -- 뒤에서부터 7번째 글자부터 끝까지 추출한다.
SELECT SUBSTR('010-1234-5678', -4) FROM dual;

SELECT INSTR('APPLE', 'P') FROM dual; -- 첫 번째 P의 위치가 반환된다.
SELECT INSTR('JAMES DEAN', ' ') FROM dual; -- 첫 번째 공백의 위치가 반환된다.

-- 'JAMES DEAN', '홍 길동' 과 같은 형식으로 이름이 입력되어 있다.
-- 공백 뒤의 이름만 추출하시오.
-- 1. 공백의 위치를 구한다. INSTR('성명', ' ')
-- 2. 공백의 위치 다음 글자부터 끝까지 추출한다. SUBSTR('성명', INSTR('성명', ' ') + 1)
-- 2. 공백의 위치부터 끝까지 추출하고 왼쪽 공백을 제거한다. LTRIM(SUBSTR('성명', INSTR('성명', ' ')), ' ')
SELECT SUBSTR('JAMES DEAN', INSTR('JAMES DEAN', ' ') + 1) FROM dual;
SELECT SUBSTR('홍 길동', INSTR('홍 길동', ' ') + 1) FROM dual;
SELECT LTRIM(SUBSTR('JAMES DEAN', INSTR('JAMES DEAN', ' ')), ' ') FROM dual;
SELECT LTRIM(SUBSTR('홍 길동', INSTR('홍 길동', ' ')), ' ') FROM dual;

SELECT LPAD('APPLE', 10, '*') FROM dual;
SELECT RPAD('APPLE', 10, '*') FROM dual;

-- 'admin' 이라는 아이디를 'a****' 로 변경해서 출력하시오.
-- 'min' 이라는 아이디를 'm**' 로 변경해서 출력하시오.
-- 1. 아이디에서 첫 번째 글자만 추출한다. SUBSTR('아이디', 1, 1)
-- 2. 추출한 결과 오른쪽에 '*'를 채운다. RPAD(SUBSTR('아이디', 1, 1), LENGTH('아이디'), '*')
-- 3. 채운 뒤 결과는 원래 아이디와 길이가 같아야 한다.
SELECT RPAD(SUBSTR('admin', 1, 1), LENGTH('admin'), '*') FROM dual;
SELECT RPAD(SUBSTR('홍길동', 1, 1), LENGTH('홍길동') + 1, '*') FROM dual;

SELECT AVG(salary) FROM employees;
SELECT ROUND(AVG(salary)) FROM employees; -- 정수로 반올림한다.

-- 올림 처리 (0.5 를 더하고 반올림한다.)
-- 1.1 -> 1.1 + 0.5 -> 1.6 -> ROUND(1.6) -> 2
-- 1.2 -> 1.2 + 0.5 -> 1.7 -> ROUND(1.7) -> 2
-- 1.8 -> 1.8 + 0.5 -> 2.3 -> ROUND(2.3) -> 2
-- 1.9 -> 1.9 + 0.5 -> 2.4 -> ROUND(2.4) -> 2

SELECT SYSDATE FROM dual;
SELECT SYSDATE - TO_DATE('20/01/01') FROM dual;
SELECT TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS') FROM dual;
