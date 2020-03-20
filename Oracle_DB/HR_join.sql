-- 1. 부서의 위치(location_id)가 1700 인 사원들의 employee_id, last_name, department_id, salary 를 조회한다.
-- 사용할 테이블(departments, employees)
SELECT e.employee_id, e.last_name, e.department_id, e.salary
FROM employees e, departments d
WHERE e.department_id = d.department_id
AND d.location_id = 1700;

SELECT e.employee_id, e.last_name, e.department_id, e.salary
FROM employees e INNER JOIN departments d
ON e.department_id = d.department_id
AND d.location_id = 1700;



-- 2. 부서명(department_name)이 'Executive' 인 부서에 근무하는 모든 사원들의 department_id, last_name, job_id 를 조회한다.
-- 사용할 테이블(departments, employees)
SELECT e.department_id, e.last_name, e.job_id
FROM employees e, departments d
WHERE e.department_id = d.department_id
AND department_name = 'Executive';

SELECT e.department_id, e.last_name, e.job_id
FROM employees e INNER JOIN departments d
ON e.department_id = d.department_id
AND department_name = 'Executive';

-- 3. 기존의 직업(job_id)을 여전히 가지고 있는 사원들의 employee_id, job_id 를 조회한다.
-- 사용할 테이블(employees, job_history)
SELECT e.employee_id, e.job_id
FROM employees e, job_history j
WHERE e.employee_id = j.employee_id
AND e.job_id = j.job_id;

SELECT e.employee_id, e.job_id
FROM employees e INNER JOIN job_history j
ON e.employee_id = j.employee_id
AND e.job_id = j.job_id;


-- 4. department_name, location_id, 각 부서별 사원수, 각 부서별 평균연봉을 조회한다.
-- 평균연봉은 소수점 2 자리까지 반올림하여 표현한다.
-- 각 부서별 사원수의 오름차순으로 조회한다.
-- 사용할 테이블(departments, employees)
SELECT department_name, location_id, count(*), round(avg(salary), 2)
FROM employees e, departments d
WHERE e.department_id = d.department_id
GROUP BY department_name, location_id; -- SELECT 절에서 사용한 컬럼(표현식은 제외)은 GROUP BY 에서 사용해야 한다.

SELECT department_name, location_id, count(*), round(avg(salary), 2)
FROM employees e INNER JOIN departments d
ON e.department_id = d.department_id
GROUP BY department_name, location_id;


-- 5. 도시이름(city)이 T로 시작하는 지역에 사는 사원들의 employee_id, last_name, department_id, city 를 조회한다.
-- 사용할 테이블(employees, departments, locations)
SELECT e.employee_id, e.last_name, e.department_id, l.city
FROM employees e, departments d, locations l
WHERE e.department_id = d.department_id
AND d.location_id = l.location_id
AND l.city like 'T%';

SELECT e.employee_id, e.last_name, e.department_id, l.city
FROM employees e INNER JOIN departments d
ON e.department_id = d.department_id INNER JOIN locations l
ON d.location_id = l.location_id
AND l.city like 'T%';


-- 6. 자신의 담당 매니저의 고용일(hire_date)보다 빨리 입사한 사원을 찾아서 last_name, hire_date, manager_id 를 조회한다. 
-- 사용할 테이블 (employees 2개 연결)
SELECT e.employee_id as 내사번, e.last_name, e.hire_date as 내고용일, p.hire_date as 매니저고용일, e.manager_id
FROM employees e, employees p
WHERE e.manager_id = p.employee_id
AND e.hire_date < p.hire_date;


-- 7. 같은 소속부서에서 자신보다 늦게 고용되었으나 자신보다 많은 연봉을 받는 사원이 존재하는 사원들의 
-- department_id, name(first_name과 last_name을 연결하여 출력), salary, hire_date 를 조회한다.

-- e : 나
-- p : 다른 사원

-- 나보다 늦게 입사하고 높은 연봉을 받는 사원이 있는 사원들 조회하기 (70명)
SELECT DISTINCT e.department_id, e.first_name || e.last_name AS fullname, e.salary, e.hire_date
FROM employees e JOIN employees p
ON e.department_id = p.department_id
AND e.hire_date < p.hire_date
AND e.salary < p.salary
ORDER BY fullname;

-- 나보다 늦게 입사하고 높은 연봉을 받는 사원들 조회하기 (65명)
SELECT DISTINCT p.department_id, p.first_name || p.last_name AS fullname, p.salary, p.hire_date
FROM employees e JOIN employees p
ON e.department_id = p.department_id
AND e.hire_date < p.hire_date
AND e.salary < p.salary
ORDER BY fullname;

SELECT * FROM employees, departments where employees.employee_id = departments.manager_id
order by employees.id;

-------------------------------------------------------------------------------------------------------