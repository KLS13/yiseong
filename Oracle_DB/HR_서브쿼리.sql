-- 1. 회사의 전체 평균 연봉보다 더 많은 연봉을 받는 사원들의 employee_id, last_name, salary 를 조회한다.
SELECT employee_id, last_name, salary
FROM employees
WHERE salary > (SELECT AVG(salary)
                FROM employees);


-- 2. Patrick Sully 와 같은 부서에 있는 모든 사원의 first_name, last_name, hire_date 를 조회한다.
SELECT first_name, last_name, hire_date
FROM employees
WHERE department_id IN (SELECT department_id
                        FROM employees
                        WHERE first_name = 'Patrick'
                        AND last_name = 'Sully');


-- 3. 직업(job_id)이 'SA_MAN'인 직원이 받을 수 있는 최대연봉(max_salary)보다 큰 연봉을 받는 사원들의
-- employee_id, last_name, salary 를 조회한다.
-- 사용할 테이블 (employees, jobs)
-- 1) 직업(job_id)이 'SA_MAN'인 직원이 받을 수 있는 최대연봉(max_salary) 구함
-- 2) 1)보다 큰 연봉을 받는 사원 조회
SELECT max_salary FROM jobs WHERE job_id = 'SA_MAN';
SELECT employee_id, last_name, salary 
FROM employees
WHERE salary > (SELECT max_salary 
                FROM jobs 
                WHERE job_id = 'SA_MAN');

-- 4. 20번 부서(department_id)에 속한 사원 중 전체 사원의 평균 급여보다 높은 급여를 받는 사원들의
-- employee_id, first_name, last_name, salary, job_id 정보를 조회한다.
-- 1) 전체 사원의 평균 급여 구함
-- 2) 1)보다 높은 급여 + 20번 부서인 사원 조회
SELECT AVG(salary) FROM employees;
SELECT employee_id, first_name, last_name, salary, job_id
FROM employees
WHERE salary > (SELECT AVG(salary) 
                FROM employees)
AND department_id = 20;

-- 5. 사원번호(employee_id)가 131인 사원의 job_id 와 salary 가 모두 일치하는 사원들의 last_name, job_id, salary 를 조회한다.
-- 1) 사원번호(employee_id)가 131인 사원의 job_id 와 salary 조회
-- 2) 1)을 만족하는 사원 조회
SELECT job_id, salary FROM employees WHERE employee_id = 131;
SELECT last_name, job_id, salary
FROM employees
WHERE (job_id, salary) = (SELECT job_id, salary 
                          FROM employees 
                          WHERE employee_id = 131);

-- 6. 기존의 직업을 여전히 가지고 있는 사원들의 employee_id, job_id 를 조회한다.
-- 1) 기존의 직업을 조회
-- 2) 1)을 만족하는 사원 조회
SELECT employee_id, job_id FROM job_history;
SELECT employee_id, job_id
FROM employees
WHERE (employee_id, job_id) IN (SELECT employee_id, job_id 
                                FROM job_history);


-- 7. location_id 가 1000 번대(1000~1900)인 국가(country_id)의 country_id, country_name 을 조회한다.
-- 1) location_id 가 1000 번대(1000~1900)인 국가(country_id)의 country_id 를 조회
-- 2) 1)을 만족하는 국가 조회
SELECT DISTINCT country_id FROM locations WHERE location_id BETWEEN 1000 AND 1900;
SELECT country_id, country_name
FROM countries
WHERE country_id IN (SELECT DISTINCT country_id 
                     FROM locations 
                     WHERE location_id BETWEEN 1000 AND 1900);


-- 8. 'Executive' 부서에 근무하는 모든 사원들의 department_id, last_name, job_id 를 조회한다.
-- 1) 'Executive' 부서(department_name)의 부서번호(department_id) 를 구함
-- 2) 1)을 만족하는 사원 조회
SELECT department_id FROM departments WHERE department_name = 'Executive';
SELECT department_id, last_name, job_id
FROM employees
WHERE department_id IN (SELECT department_id 
                        FROM departments 
                        WHERE department_name = 'Executive');
SELECT department_id, last_name, job_id
FROM employees
WHERE (department_id, 'Executive') IN (SELECT department_id, department_name 
                                       FROM departments);


-- 9. department_id 가 30 인 부서에 근무하는 사원들 중에서 department_id 가 50 인 직원들이 받는 연봉보다 큰 연봉을 받는 사원들의 
-- employee_id, last_name, salary 를 조회한다.
-- 1) department_id 가 50 인 직원들이 받는 연봉 구하기
-- 2) 1) 의 결과들보다 큰 연봉을 받는(모든 1)의 결과 보다 큰) + department_id 가 30인 사원 조회
SELECT DISTINCT salary FROM employees WHERE department_id = 50;
SELECT employee_id, last_name, salary
FROM employees
WHERE salary > ALL(SELECT DISTINCT salary FROM employees WHERE department_id = 50)
AND department_id = 30;

SELECT employee_id, last_name, salary
FROM employees
WHERE salary > (SELECT MAX(salary) FROM employees WHERE department_id = 50)
AND department_id = 30;


-- 10. 최소한 department_id 가 50 인 부서에 근무하는 사원들의 연봉(salary) 보다는 많은 연봉을 받는 다른 부서 사원들의 
-- department_id, employee_id, last_name, salary 를 조회한다.
SELECT department_id, employee_id, last_name, salary
FROM employees
WHERE salary > ANY(SELECT DISTINCT salary FROM employees WHERE department_id = 50)
AND department_id = 30;

SELECT department_id, employee_id, last_name, salary
FROM employees
WHERE salary > (SELECT MIN(salary) FROM employees WHERE department_id = 50)
AND department_id = 30;


-- 11. last_name 에 u가 포함되는 사원들과 동일한 부서에 근무하는 사원들의 employee_id, last_name 을 조회한다.
-- 1) last_name 에 u가 포함되는 사원들의 부서번호 조회
-- 2) 1)을 만족하는 사원 조회
SELECT DISTINCT department_id FROM employees WHERE last_name LIKE '%u%';
SELECT employee_id, last_name
FROM employees
WHERE department_id IN (SELECT DISTINCT department_id 
                        FROM employees 
                        WHERE last_name LIKE '%u%');


-- 12. 매니저가 아닌 사원의 이름(first_name, last_name)을 조회한다.
-- (1)  not exists
SELECT first_name, last_name
FROM employees e
WHERE not exists (SELECT p.manager_id FROM employees p WHERE e.employee_id = p.manager_id);

-- (2) not in
-- 1) 매니저인 사원의 manager_id 조회
-- 2) 1) 이 아닌 사원 조회
SELECT manager_id FROM employees WHERE manager_id IS NOT NULL;
SELECT first_name, last_name
FROM employees
WHERE employee_id NOT IN (SELECT manager_id 
                          FROM employees 
                          WHERE manager_id IS NOT NULL);


-- 번외 (서브쿼리 결과는 NULL 이 있으면 안 된다.)
SELECT first_name, last_name
FROM employees
WHERE employee_id NOT IN (SELECT manager_id 
                          FROM employees); -- 서브쿼리 결과에 NULL 이 있어서 검색되는 내용이 없다.
                          
-- 해결하고 싶다. (NULL 만 없애면 된다.)
SELECT first_name, last_name
FROM employees
WHERE employee_id NOT IN (SELECT NVL(manager_id, 999) 
                          FROM employees); -- NULL 대신 999(무슨 값이든 상관 없음) 를 채우는 NVL 함수를 쓰면 된다.

