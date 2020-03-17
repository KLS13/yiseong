-- 21. JOB_ID 가 ST_CLERK 인 사원이 근무하지 않는 부서번호(department_id)를 조회한다.
-- 단, 부서번호가 NULL인 값은 제외하고 부서번호의 중복을 제거한다.
select distinct department_id
from employees
where job_id != 'ST_CLERK' -- where job_id <> 'ST_CLERK' | where job_id not in('ST_CLERK')
and department_id is not null;

-- 22. 커미션(commission_pct)을 받는 사원들의 실제 커미션(commission = salary * commission_pct)을 구하고,
-- employee_id, first_name, job_id 와 함께 출력한다.
select employee_id, first_name, job_id, salary * commission_pct as commission
from employees
where commission_pct is not null;

-- 23. 회사의 연봉 총액을 출력한다.
select sum(salary) as 전체금액
from employees;

-- 24. 회사의 연봉 평균을 출력한다.
select avg(salary) as average_salary
from employees;

-- 25. 사내의 최대연봉과 최소연봉의 차이를 출력한다.
select max(salary) - min(salary) as salary_gap
from employees;

-- 26. job_id 가 ST_CLERK 인 사원들의 전체 수를 출력한다.
-- count(컬럼) : 해당 컬럼만 보고 개수를 구한다. 
-- count(commission_pct) : commission_pct 가 NULL 인 사원은 사원의 개수에 포함되지 않는다.
-- 실제로 컬럼을 신경쓰지 않고 개수를 구하는 경우가 많다.
-- count(*) : 모든 컬럼을 보고 개수를 구한다. (추천)

select COUNT(*)
from employees
where job_id = 'ST_CLERK';

-- 27. 매니저(manager_id)로 근무하는 사원들의 전체 수를 출력한다.
select count(manager_id)
from employees;

-- 부서번호가 몇 개 있는지 출력한다. (몇 개의 부서가 있는지 출력한다.)
select count(distinct department_id)
from employees;


-- 28. 가장 오래 전에 입사한 직원부터 최근에 입사한 직원 순으로 last_name, hire_date 를 조회한다.
select last_name, hire_date
from employees
order by hire_date asc;  -- order by hire_date;

-- 29. 부서번호(department_id)가 20번, 50번 부서에서 근무하는 모든 사원들의 부서번호의 오름차순으로 조회하되,
-- 같은 부서번호 내에서는 last_name 의 알파벳순으로 조회한다.
select department_id, last_name
from employees
where department_id in (20, 50)
order by department_id, last_name;

desc employees;

-- 30. 커미션(commission_pct)을 받는 모든 사원들의 last_name, salary, commission_pct 을 조회한다.
-- 연봉이 높은 사원을 먼저 출력하고 같은 연봉의 사원들은 커미션이 높은 사원을 먼저 출력한다.
select last_name, salary, commission_pct
from employees
where commission_pct is not null
order by salary desc, commission_pct desc;
