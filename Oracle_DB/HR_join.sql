-- 1. �μ��� ��ġ(location_id)�� 1700 �� ������� employee_id, last_name, department_id, salary �� ��ȸ�Ѵ�.
-- ����� ���̺�(departments, employees)
SELECT e.employee_id, e.last_name, e.department_id, e.salary
FROM employees e, departments d
WHERE e.department_id = d.department_id
AND d.location_id = 1700;

SELECT e.employee_id, e.last_name, e.department_id, e.salary
FROM employees e INNER JOIN departments d
ON e.department_id = d.department_id
AND d.location_id = 1700;



-- 2. �μ���(department_name)�� 'Executive' �� �μ��� �ٹ��ϴ� ��� ������� department_id, last_name, job_id �� ��ȸ�Ѵ�.
-- ����� ���̺�(departments, employees)
SELECT e.department_id, e.last_name, e.job_id
FROM employees e, departments d
WHERE e.department_id = d.department_id
AND department_name = 'Executive';

SELECT e.department_id, e.last_name, e.job_id
FROM employees e INNER JOIN departments d
ON e.department_id = d.department_id
AND department_name = 'Executive';

-- 3. ������ ����(job_id)�� ������ ������ �ִ� ������� employee_id, job_id �� ��ȸ�Ѵ�.
-- ����� ���̺�(employees, job_history)
SELECT e.employee_id, e.job_id
FROM employees e, job_history j
WHERE e.employee_id = j.employee_id
AND e.job_id = j.job_id;

SELECT e.employee_id, e.job_id
FROM employees e INNER JOIN job_history j
ON e.employee_id = j.employee_id
AND e.job_id = j.job_id;


-- 4. department_name, location_id, �� �μ��� �����, �� �μ��� ��տ����� ��ȸ�Ѵ�.
-- ��տ����� �Ҽ��� 2 �ڸ����� �ݿø��Ͽ� ǥ���Ѵ�.
-- �� �μ��� ������� ������������ ��ȸ�Ѵ�.
-- ����� ���̺�(departments, employees)
SELECT department_name, location_id, count(*), round(avg(salary), 2)
FROM employees e, departments d
WHERE e.department_id = d.department_id
GROUP BY department_name, location_id; -- SELECT ������ ����� �÷�(ǥ������ ����)�� GROUP BY ���� ����ؾ� �Ѵ�.

SELECT department_name, location_id, count(*), round(avg(salary), 2)
FROM employees e INNER JOIN departments d
ON e.department_id = d.department_id
GROUP BY department_name, location_id;


-- 5. �����̸�(city)�� T�� �����ϴ� ������ ��� ������� employee_id, last_name, department_id, city �� ��ȸ�Ѵ�.
-- ����� ���̺�(employees, departments, locations)
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


-- 6. �ڽ��� ��� �Ŵ����� �����(hire_date)���� ���� �Ի��� ����� ã�Ƽ� last_name, hire_date, manager_id �� ��ȸ�Ѵ�. 
-- ����� ���̺� (employees 2�� ����)
SELECT e.employee_id as �����, e.last_name, e.hire_date as �������, p.hire_date as �Ŵ��������, e.manager_id
FROM employees e, employees p
WHERE e.manager_id = p.employee_id
AND e.hire_date < p.hire_date;


-- 7. ���� �ҼӺμ����� �ڽź��� �ʰ� ���Ǿ����� �ڽź��� ���� ������ �޴� ����� �����ϴ� ������� 
-- department_id, name(first_name�� last_name�� �����Ͽ� ���), salary, hire_date �� ��ȸ�Ѵ�.

-- e : ��
-- p : �ٸ� ���

-- ������ �ʰ� �Ի��ϰ� ���� ������ �޴� ����� �ִ� ����� ��ȸ�ϱ� (70��)
SELECT DISTINCT e.department_id, e.first_name || e.last_name AS fullname, e.salary, e.hire_date
FROM employees e JOIN employees p
ON e.department_id = p.department_id
AND e.hire_date < p.hire_date
AND e.salary < p.salary
ORDER BY fullname;

-- ������ �ʰ� �Ի��ϰ� ���� ������ �޴� ����� ��ȸ�ϱ� (65��)
SELECT DISTINCT p.department_id, p.first_name || p.last_name AS fullname, p.salary, p.hire_date
FROM employees e JOIN employees p
ON e.department_id = p.department_id
AND e.hire_date < p.hire_date
AND e.salary < p.salary
ORDER BY fullname;

SELECT * FROM employees, departments where employees.employee_id = departments.manager_id
order by employees.id;

-------------------------------------------------------------------------------------------------------