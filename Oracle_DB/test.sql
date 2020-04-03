-- 1. employees 테이블과 구조와 데이터가 동일한 employees2 테이블을 생성한다.
CREATE TABLE employees2
AS SELECT * FROM employees;


-- 2. job_history 테이블의 employee_id, job_id, department_id 칼럼만 복사하여 job_history2 테이블을 생성한다.
CREATE TABLE job_history2 (employee_id, job_id, department_id)
AS SELECT employee_id, job_id, department_id FROM job_history;


-- 3. departments 테이블에서 manager_id 가 없는 데이터를 제외한 모든 데이터를 복사하여 departments2 테이블을 생성한다.
CREATE TABLE departments2
AS SELECT * FROM departments WHERE manager_id IS NOT NULL;


-- 4. countries 테이블과 구조만 동일하고 데이터는 하나도 존재하지 않는 countries2 테이블을 생성한다.
CREATE TABLE countries2
AS SELECT * FROM countries WHERE 1 = 2;


-- 5. regions 테이블과 동일한 구조를 가지는 regions2 테이블을 생성한다.
CREATE TABLE regions2
AS SELECT * FROM regions WHERE 1 = 2;


-- 6. regions 테이블에서 region_id 가 1 과 2 인 지역들을 검색하여 region2 테이블에 삽입한다.
DESC regions;

INSERT INTO regions2 (region_id, region_name) 
SELECT region_id, region_name FROM regions WHERE region_id IN (1, 2);

INSERT INTO regions2
SELECT region_id, region_name FROM regions WHERE region_id IN (1, 2);

INSERT ALL
    INTO regions2 VALUES (region_id, region_name)
SELECT * FROM regions WHERE region_id IN(1, 2);

commit;


-- 7. employees2 테이블에서 employee_id 가 150 인 사원이 employee_id 가 200 인 사원과 같은 부서가 되도록 수정한다.
UPDATE employees2
SET department_id = (SELECT department_id FROM employees2 WHERE employee_id = 200)
WHERE employee_id = 150;

-- 저장 : COMMIT;
-- 취소 : ROLLBACK; -- 이전 COMMIT 시점까지 취소

-- 8. 이번 조직 개편에서 'Marketing' 부서를 없애고, 해당 사원을 모두 해고하기로 했다.
-- employees2 테이블에서 부서가 'Marketing' 인 모든 사원을 삭제한다.
DELETE FROM employees2
WHERE department_id = (SELECT department_id FROM departments WHERE department_name = 'Marketing');


-- 9. 지금까지 생성한 employees2, job_history2, departments2, countries2, regions2 테이블을 모두 삭제한다.
DROP TABLE employees2;
DROP TABLE job_history2;
DROP TABLE departments2;
DROP TABLE countries2;
DROP TABLE regions2;

-- 간단한 회원테이블을 생성
CREATE TABLE members (
    mNo NUMBER NOT NULL PRIMARY KEY, -- 회원순번(1, 2, 3, ...)
    mName VARCHAR2(20)
);

-- 회원순번에서 사용할 시퀀스 생성
CREATE SEQUENCE members_seq;

-- 시퀀스는 INSERT, UPDATE 문에서 사용한다.
-- 시퀀스는 반드시 최초에 NEXTVAL 함수를 사용해야 한다.
INSERT INTO members VALUES (members_seq.NEXTVAL, '앨리스');
INSERT INTO members VALUES (members_seq.NEXTVAL, '제임스');
INSERT INTO members VALUES (members_seq.NEXTVAL, '데이빗');
INSERT INTO members VALUES (members_seq.NEXTVAL, '스미스');
INSERT INTO members VALUES (members_seq.NEXTVAL, '앨런');
INSERT INTO members VALUES (members_seq.NEXTVAL, '사만다');

-- 확인
SELECT * FROM members;
SELECT members_seq.CURRVAL FROM dual;

-- ROWNUM 을 확인한다.
SELECT ROWNUM, m.* FROM members m;

-- 첫 번째 회원을 확인한다.
SELECT * FROM members WHERE ROWNUM = 1; -- ROWNUM 의 동등비교(=)는 1만 예외적으로 허용된다.

-- 두 번째 회원을 확인한다.
SELECT * FROM members WHERE ROWNUM = 2; -- 안 됩니다.

-- 이름의 가나다순으로 정렬해서 첫 2명을 확인한다.
SELECT * FROM members WHERE ROWNUM <= 2 ORDER BY mName; -- 왜 안되는지 이유를 확인하자. (정렬전에 ROWNUM이 먼저 부여되기 때문이다.)

-- ORDER BY 를 먼저하고 ROWNUM 을 사용해야 한다.
SELECT * FROM members ORDER BY mName;

SELECT om.* FROM (SELECT * FROM members ORDER BY mName) om;

SELECT ROWNUM, om.* FROM (SELECT * FROM members ORDER BY mName) om WHERE ROWNUM <= 2;
