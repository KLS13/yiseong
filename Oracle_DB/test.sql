-- 1. employees ���̺�� ������ �����Ͱ� ������ employees2 ���̺��� �����Ѵ�.
CREATE TABLE employees2
AS SELECT * FROM employees;


-- 2. job_history ���̺��� employee_id, job_id, department_id Į���� �����Ͽ� job_history2 ���̺��� �����Ѵ�.
CREATE TABLE job_history2 (employee_id, job_id, department_id)
AS SELECT employee_id, job_id, department_id FROM job_history;


-- 3. departments ���̺��� manager_id �� ���� �����͸� ������ ��� �����͸� �����Ͽ� departments2 ���̺��� �����Ѵ�.
CREATE TABLE departments2
AS SELECT * FROM departments WHERE manager_id IS NOT NULL;


-- 4. countries ���̺�� ������ �����ϰ� �����ʹ� �ϳ��� �������� �ʴ� countries2 ���̺��� �����Ѵ�.
CREATE TABLE countries2
AS SELECT * FROM countries WHERE 1 = 2;


-- 5. regions ���̺�� ������ ������ ������ regions2 ���̺��� �����Ѵ�.
CREATE TABLE regions2
AS SELECT * FROM regions WHERE 1 = 2;


-- 6. regions ���̺��� region_id �� 1 �� 2 �� �������� �˻��Ͽ� region2 ���̺� �����Ѵ�.
DESC regions;

INSERT INTO regions2 (region_id, region_name) 
SELECT region_id, region_name FROM regions WHERE region_id IN (1, 2);

INSERT INTO regions2
SELECT region_id, region_name FROM regions WHERE region_id IN (1, 2);

INSERT ALL
    INTO regions2 VALUES (region_id, region_name)
SELECT * FROM regions WHERE region_id IN(1, 2);

commit;


-- 7. employees2 ���̺��� employee_id �� 150 �� ����� employee_id �� 200 �� ����� ���� �μ��� �ǵ��� �����Ѵ�.
UPDATE employees2
SET department_id = (SELECT department_id FROM employees2 WHERE employee_id = 200)
WHERE employee_id = 150;

-- ���� : COMMIT;
-- ��� : ROLLBACK; -- ���� COMMIT �������� ���

-- 8. �̹� ���� ������ 'Marketing' �μ��� ���ְ�, �ش� ����� ��� �ذ��ϱ�� �ߴ�.
-- employees2 ���̺��� �μ��� 'Marketing' �� ��� ����� �����Ѵ�.
DELETE FROM employees2
WHERE department_id = (SELECT department_id FROM departments WHERE department_name = 'Marketing');


-- 9. ���ݱ��� ������ employees2, job_history2, departments2, countries2, regions2 ���̺��� ��� �����Ѵ�.
DROP TABLE employees2;
DROP TABLE job_history2;
DROP TABLE departments2;
DROP TABLE countries2;
DROP TABLE regions2;

-- ������ ȸ�����̺��� ����
CREATE TABLE members (
    mNo NUMBER NOT NULL PRIMARY KEY, -- ȸ������(1, 2, 3, ...)
    mName VARCHAR2(20)
);

-- ȸ���������� ����� ������ ����
CREATE SEQUENCE members_seq;

-- �������� INSERT, UPDATE ������ ����Ѵ�.
-- �������� �ݵ�� ���ʿ� NEXTVAL �Լ��� ����ؾ� �Ѵ�.
INSERT INTO members VALUES (members_seq.NEXTVAL, '�ٸ���');
INSERT INTO members VALUES (members_seq.NEXTVAL, '���ӽ�');
INSERT INTO members VALUES (members_seq.NEXTVAL, '���̺�');
INSERT INTO members VALUES (members_seq.NEXTVAL, '���̽�');
INSERT INTO members VALUES (members_seq.NEXTVAL, '�ٷ�');
INSERT INTO members VALUES (members_seq.NEXTVAL, '�縸��');

-- Ȯ��
SELECT * FROM members;
SELECT members_seq.CURRVAL FROM dual;

-- ROWNUM �� Ȯ���Ѵ�.
SELECT ROWNUM, m.* FROM members m;

-- ù ��° ȸ���� Ȯ���Ѵ�.
SELECT * FROM members WHERE ROWNUM = 1; -- ROWNUM �� �����(=)�� 1�� ���������� ���ȴ�.

-- �� ��° ȸ���� Ȯ���Ѵ�.
SELECT * FROM members WHERE ROWNUM = 2; -- �� �˴ϴ�.

-- �̸��� �����ټ����� �����ؼ� ù 2���� Ȯ���Ѵ�.
SELECT * FROM members WHERE ROWNUM <= 2 ORDER BY mName; -- �� �ȵǴ��� ������ Ȯ������. (�������� ROWNUM�� ���� �ο��Ǳ� �����̴�.)

-- ORDER BY �� �����ϰ� ROWNUM �� ����ؾ� �Ѵ�.
SELECT * FROM members ORDER BY mName;

SELECT om.* FROM (SELECT * FROM members ORDER BY mName) om;

SELECT ROWNUM, om.* FROM (SELECT * FROM members ORDER BY mName) om WHERE ROWNUM <= 2;
