-- 그룹화 연습
-- departments 테이블 이용
desc departments;

select * from departments;

select count(*) from departments;

-- 같은 location_id 끼리 모아서 출력한다.
select distinct location_id from departments;
select location_id from departments group by location_id;

-- 같은 location_id 끼리 모아서 각 location_id 마다 총 몇 개의 부서가 있는지 개수를 함께 출력한다.
select location_id, count(*) as 지역별부서수
from departments
group by location_id;

-- 같은 location_id 끼리 모아서 해당 location_id 에 어떤 department_name 이 있는지 출력한다.
-- 안 되는 이유 : select 절의 department_name 이 group by 절에 없으면 실행이 되지 않는다.
select department_name
from departments
group by location_id, department_name ;


-- 내부 조인 (inner join)
-- 1.
-- SELECT table1.column, table2.column
-- FROM table1, table2
-- WHERE table1.column = table2.column;
-- 2.
-- SELECT table1.column, table2.column
-- FROM table1 INNER JOIN table2
-- ON table1.column = table2.column;


-- users 테이블의 userid 와 buys 테이블의 userid 에 모두 있는 고객의 이름을 조회한다.
-- 구매 이력이 있는 고객
SELECT users.username, buys.productname
FROM users, buys
WHERE users.userid = buys.userid;

SELECT u.username, b.productname
FROM users u, buys b
WHERE u.userid = b.userid;

SELECT u.username, b.productname
FROM users u INNER JOIN buys b
ON u.userid = b.userid;

-- 카티젼 곱
SELECT * FROM users, buys;

-- 왼쪽 외부 조인 PPT 예제
SELECT e.emp_no, e.name, d.dept_name
FROM employee e LEFT OUTER JOIN department d
ON e.depart = d.dept_no;

-- 회원별로 구매횟수를 조회한다.
-- 강호동  3
-- 김제동  1
-- 김용만  1
-- 이휘재  3
-- 박수홍  4
SELECT u.username, count(*)
FROM users u, buys b
WHERE u.userid = b.userid
GROUP BY u.username;


-- 회원별로 구매횟수를 조회한다.
-- 강호동  3
-- 김제동  1
-- 김용만  1
-- 이휘재  3
-- 박수홍  4
-- 유재석  0
-- 남희석  0
-- 김국진  0
-- 신동엽  0
SELECT u.username, count(b.userid)
FROM users u LEFT JOIN buys b -- 왼쪽 테이블인 users 테이블의 내용은 전체 출력된다.
ON u.userid = b.userid
GROUP BY u.username;