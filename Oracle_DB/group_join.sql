-- �׷�ȭ ����
-- departments ���̺� �̿�
desc departments;

select * from departments;

select count(*) from departments;

-- ���� location_id ���� ��Ƽ� ����Ѵ�.
select distinct location_id from departments;
select location_id from departments group by location_id;

-- ���� location_id ���� ��Ƽ� �� location_id ���� �� �� ���� �μ��� �ִ��� ������ �Բ� ����Ѵ�.
select location_id, count(*) as �������μ���
from departments
group by location_id;

-- ���� location_id ���� ��Ƽ� �ش� location_id �� � department_name �� �ִ��� ����Ѵ�.
-- �� �Ǵ� ���� : select ���� department_name �� group by ���� ������ ������ ���� �ʴ´�.
select department_name
from departments
group by location_id, department_name ;


-- ���� ���� (inner join)
-- 1.
-- SELECT table1.column, table2.column
-- FROM table1, table2
-- WHERE table1.column = table2.column;
-- 2.
-- SELECT table1.column, table2.column
-- FROM table1 INNER JOIN table2
-- ON table1.column = table2.column;


-- users ���̺��� userid �� buys ���̺��� userid �� ��� �ִ� ���� �̸��� ��ȸ�Ѵ�.
-- ���� �̷��� �ִ� ��
SELECT users.username, buys.productname
FROM users, buys
WHERE users.userid = buys.userid;

SELECT u.username, b.productname
FROM users u, buys b
WHERE u.userid = b.userid;

SELECT u.username, b.productname
FROM users u INNER JOIN buys b
ON u.userid = b.userid;

-- īƼ�� ��
SELECT * FROM users, buys;

-- ���� �ܺ� ���� PPT ����
SELECT e.emp_no, e.name, d.dept_name
FROM employee e LEFT OUTER JOIN department d
ON e.depart = d.dept_no;

-- ȸ������ ����Ƚ���� ��ȸ�Ѵ�.
-- ��ȣ��  3
-- ������  1
-- ��븸  1
-- ������  3
-- �ڼ�ȫ  4
SELECT u.username, count(*)
FROM users u, buys b
WHERE u.userid = b.userid
GROUP BY u.username;


-- ȸ������ ����Ƚ���� ��ȸ�Ѵ�.
-- ��ȣ��  3
-- ������  1
-- ��븸  1
-- ������  3
-- �ڼ�ȫ  4
-- ���缮  0
-- ����  0
-- �豹��  0
-- �ŵ���  0
SELECT u.username, count(b.userid)
FROM users u LEFT JOIN buys b -- ���� ���̺��� users ���̺��� ������ ��ü ��µȴ�.
ON u.userid = b.userid
GROUP BY u.username;