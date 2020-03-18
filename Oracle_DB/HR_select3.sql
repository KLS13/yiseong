-- 31. first_name 이 'Curtis' 인 사람의 first_name, last_name, email, phone_number, job_id 를 조회한다.
-- 단, job_id 의 결과는 소문자로 출력되도록 한다.
select replace(first_name,'Curtis','커티스'), last_name, email, phone_number, lower(job_id)
from employees
where first_name = 'Curtis';

-- 32. 부서번호가 60, 70, 80, 90 인 사원들의 employee_id, first_name, last_name, hire_date, job_id 를 조회한다.
-- 단, job_id 가 IT_PROG 인 사원의 경우 '프로그래머'로 변경하여 출력한다.
select department_id,employee_id, first_name, last_name, hire_date, replace(job_id, 'IT_PROG', '프로그래머')
from employees
where department_id in (60, 70, 80, 90);

-- 33. job_id 가 AD_PRES, PU_CLERK 인 사원들의 employee_id, 사원명(full_name), employee_id, department_id, job_id 를 조회한다.
-- 단, 사원명(full_name)은 first_name 과 last_name 을 연결하여 출력한다.
select employee_id, concat(first_name, last_name), employee_id, department_id, job_id
from employees
where job_id in ('AD_PRES', 'PU_CLERK');

select employee_id, first_name || ' ' || last_name, employee_id, department_id || '번 ' || job_id || '번' as ID
from employees
where job_id in ('AD_PRES', 'PU_CLERK');

-- 34. last_name 에 u 가 포함되는 사원들의 employee_id, last_name 을 조회한다.
select employee_id, last_name
from employees
where instr(last_name, 'u') > 0;
-- where last_name like '%u%';

-- 35. 전화번호(phone_number)가 650으로 시작하는 사원들의 last_name, phone_number 를 조회한다.
select concat('이름 : ', last_name), substr(phone_number,1,8) || '****' as 폰번호
from employees
where substr(phone_number, 1, 3) = '650';

-- 36. last_name 의 네 번째 글자가 a 인 사원들의 last_name 을 조회한다.
select last_name
from employees
where instr(last_name, 'a') = 4;

select last_name
from employees
where substr(last_name, 4, 1) = 'a';

-- 37. 회사의 연봉 평균을 소수 2자리까지 반올림하여 출력한다.
select round(avg(salary), 2)
from employees;

-- 38. 회사의 연봉 총액을 $500,000 과 같은 형식으로 출력한다.
select to_char(sum(salary), '$999,999') -- 999999 : 6자리 이하 숫자는 가능
from employees;

-- 39. last_name 이 'McCain' 인 사원이 지금까지 근무한 근속일(service_days)을 '4500일' 과 같은 형식으로 출력한다.
select trunc(sysdate - hire_date) || '일' AS service_days
from employees
where last_name = 'McCain';

-- 40. last_name 이 'McCain' 인 사원이 지금까지 근무한 근속일(service_days)을 '120개월' 과 같은 형식으로 출력한다.
select trunc(MONTHS_BETWEEN(SYSDATE, hire_date)) || '개월' AS service_days
from employees
where last_name = 'McCain';

-- 전체
select sum(trunc(MONTHS_BETWEEN(SYSDATE, hire_date))) || '개월' AS service_days
from employees;


-- 41. 각 부서(department_id)별로 그룹화하여 department_id 와 부서별 사원의 수를 출력한다.
select department_id, count(*)
from employees
group by department_id
order by department_id;

-- 42. 부서(department_id)별로 집계하여 department_id 와 급여평균을 출력한다.
-- 단, 평균급여는 소수 이하 반올림하여 정수로 처리하고, department_id 순으로 정렬한다.
select department_id, round(avg(salary)), count(*)
from employees
group by department_id
order by department_id;

-- 43. 동일한 직업(job_id)을 가진 사원들의 job_id 와 인원수와 평균급여를 직업별로 출력한다.
-- 단, 평균급여는 원 단위를 절사하여 표시하고 평균급여 순으로 출력한다.
select job_id, count(*), trunc(avg(salary))
from employees
GROUP BY job_id
order by avg(salary);

-- 44. 직업(job_id)이 SH_CLERK 인 직원들의 인원수와 최대급여 및 최소급여를 출력한다.
select count(*), max(salary), min(salary)
from employees
where job_id = 'SH_CLERK'
group by job_id;

select count(*), max(salary), min(salary)
from employees
group by job_id
having job_id = 'SH_CLERK';


-- 45. 근무중인 사원수가 5명 이상인 부서의 department_id 와 해당 부서의 사원수를 함께 출력한다.
-- department_id 를 기준으로 정렬하여 출력한다.
select department_id, count(*)
from employees
group by department_id
having count(*) >= 5
order by department_id;

select job_id, count(*)
from employees
group by job_id
having count(*) >=10;


-- 46. 평균급여가 10000 이상인 부서의 department_id 와 평균급여를 출력한다.
-- 평균급여는 소수 이하 절사처리한다.
select department_id as 부서, trunc(avg(salary)) ||'만원' as 평균임금
from employees
group by department_id
having avg(salary) >= 10000
order by department_id;

-- 47. 부서(department_id)마다 같은 직업(job_id)을 가진 사원들의 인원수를 부서순으로 정렬하여 출력한다.
-- 단, department_id 가 없는 사원은 출력하지 않는다.
select department_id, job_id, count(*)
from employees
where department_id is not null
group by department_id, job_id
order by department_id;
