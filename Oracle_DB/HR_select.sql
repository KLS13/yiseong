-- HR 연습 1
SELECT
    nvl(NULL, 'apple')
FROM
    dual; -- apple

SELECT
    nvl('a', 'apple')
FROM
    dual; -- a

SELECT
    nvl2(NULL, 'apple', 'banana')
FROM
    dual; -- banana

SELECT
    nvl2('a', 'apple', 'banana')
FROM
    dual; -- apple


DESC employees;

SELECT
    first_name,
    last_name,
    job_id
FROM
    employees;

-- 3. 연봉이 12000 이상되는 직원들의 last_name, 연봉(salary)을 조회한다.

SELECT
    last_name,
    salary
FROM
    employees
WHERE
    salary >= 12000;

-- 4. 사원번호가 150 인 사람의 last_name 과 부서번호(department_id)를 조회한다.

SELECT
    last_name,
    department_id
FROM
    employees
WHERE
    employee_id = 150;

-- 5. 커미션을 버는 모든 사원들의 last_name, 연봉(salary) 및 커미션(commission_pct)을 조회한다.

SELECT
    last_name,
    salary,
    commission_pct
FROM
    employees
WHERE
    commission_pct IS NOT NULL;

SELECT
    last_name,
    salary,
    commission_pct
FROM
    employees
WHERE
    commission_pct > 0;

-- 6. (커미션이 없는) 모든 사원들의 last_name, 커미션(commission_pct)을 조회하되 커미션이 없는 사원은 0으로 처리하여 조회한다.

SELECT
    last_name,
    nvl(commission_pct, 0)
FROM
    employees;
--where
--    commission_pct is null;


-- 7. 커미션(commission_pct)이 없는 사원들은 0으로 처리하고, 커미션이 있는 사원들은 기존 커미션보다 0.1만큼 인상된 상태로 조회한다.

SELECT
    nvl2(commission_pct, commission_pct + 0.1, 0)
FROM
    employees;

-- 8. 연봉이 5000 에서 12000 인 범위의 사원들의 first_name, last_name, 연봉(salary)을 조회한다.

SELECT
    first_name,
    last_name,
    salary
FROM
    employees
WHERE
    salary >= 5000
    AND salary <= 12000;

SELECT
    first_name,
    last_name,
    salary
FROM
    employees
WHERE
    salary between 5000 and 12000;

-- 9. 연봉이 5000 에서 12000 사이의 범위가 아닌 사원들의 first_name, last_name, 연봉(salary)을 조회한다.
SELECT
    first_name,
    last_name,
    salary
FROM
    employees
WHERE
    salary < 5000
    OR salary > 12000;

SELECT
    first_name,
    last_name,
    salary
FROM
    employees
WHERE
    salary not between 5000 and 12000;

-- 10. 직업(job_id)이 SA_REP 이나 ST_CLERK 인 직원들을 조회한다.
select
    last_name, job_id
from
    employees
where
    job_id = 'SA_REP' or job_id = 'ST_CLERK';
    
select
    last_name, job_id
from
    employees
where
    job_id in('SA_REP', 'ST_CLERK');

-- 11. 연봉이 2,500, 3,500, 7000 이 아니며
-- 직업이 SA_REP 이나 ST_CLERK 인 사람들을 조회한다.
select *
from employees
where salary not in(2500, 3500, 7000)
and job_id in('SA_REP', 'ST_CLERK');

-- 12. 매니저(manager_id)가 없는 사람들의 last_name 및 job_id 를 조회한다.
select last_name, job_id
from employees
where manager_id is null;

-- 13. last_name에 u가 포함되는 사원들의 사번(employee_id) 및 last_name 을 조회한다.
select employee_id, last_name
from employees
where last_name like '%u%';

-- 14. 전화번호(phone_number)가 650 으로 시작하는
-- 사원들의 last_name, phone_number 를 조회한다.
select last_name, phone_number
from employees
where phone_number like '650%';

-- 15. last_name의 네 번째 글자가 a 인 사원들의
-- last_name 을 조회한다.
select last_name
from employees
where last_name like '____i%';

-- 16. last_name 에 a 혹은 e 글자가 있는 사원들의 last_name 을 조회한다.
select last_name
from employees
where last_name like '%a%' or last_name like '%e%';

-- 17. last_name에 a와 e 글자가 모두 있는 사원들의 last_name 을 조회한다.
select last_name
from employees
where last_name like '%a%e%' or last_name like '%e%a%';

-- 18. 2008/02/20~2008/05/01 사이에 고용된 사원들의 last_name, employeed_id, 고용일(hire_date) 를 조회한다.
-- 1) '2008/02/20'
-- 2) '08/02/20'
-- 3) '2008-02-20'
-- 4) '08-02-20'
select last_name, employee_id, hire_date
from employees
where hire_date >= '2008/02/20'
and hire_date <= '2008/05/01';

select last_name, employee_id, hire_date
from employees
where hire_date between '2008-02-20' and '2008-05-01';

-- 19. 2004년도에 고용된 모든 직원들의 last_name, employee_id, hire_date 를 조회한다.
select last_name, employee_id, hire_date
from employees
where hire_date >= '2004/01/01'
and hire_date <= '2004/12/31';

select last_name, employee_id, hire_date
from employees
where hire_date between '2004-01-01' and '2004-12-31';

select last_name, employee_id, hire_date
from employees
where hire_date like '04%'; -- 04 로 시작하는 모든 hire_date

-- 20. 부서(department_id)의 중복을 제거하여 조회한다.
select distinct department_id
from employees;
