-- 1. ȸ���� ��ü ��� �������� �� ���� ������ �޴� ������� employee_id, last_name, salary �� ��ȸ�Ѵ�.
SELECT employee_id, last_name, salary
FROM employees
WHERE salary > (SELECT AVG(salary)
                FROM employees);


-- 2. Patrick Sully �� ���� �μ��� �ִ� ��� ����� first_name, last_name, hire_date �� ��ȸ�Ѵ�.
SELECT first_name, last_name, hire_date
FROM employees
WHERE department_id IN (SELECT department_id
                        FROM employees
                        WHERE first_name = 'Patrick'
                        AND last_name = 'Sully');


-- 3. ����(job_id)�� 'SA_MAN'�� ������ ���� �� �ִ� �ִ뿬��(max_salary)���� ū ������ �޴� �������
-- employee_id, last_name, salary �� ��ȸ�Ѵ�.
-- ����� ���̺� (employees, jobs)
-- 1) ����(job_id)�� 'SA_MAN'�� ������ ���� �� �ִ� �ִ뿬��(max_salary) ����
-- 2) 1)���� ū ������ �޴� ��� ��ȸ
SELECT max_salary FROM jobs WHERE job_id = 'SA_MAN';
SELECT employee_id, last_name, salary 
FROM employees
WHERE salary > (SELECT max_salary 
                FROM jobs 
                WHERE job_id = 'SA_MAN');

-- 4. 20�� �μ�(department_id)�� ���� ��� �� ��ü ����� ��� �޿����� ���� �޿��� �޴� �������
-- employee_id, first_name, last_name, salary, job_id ������ ��ȸ�Ѵ�.
-- 1) ��ü ����� ��� �޿� ����
-- 2) 1)���� ���� �޿� + 20�� �μ��� ��� ��ȸ
SELECT AVG(salary) FROM employees;
SELECT employee_id, first_name, last_name, salary, job_id
FROM employees
WHERE salary > (SELECT AVG(salary) 
                FROM employees)
AND department_id = 20;

-- 5. �����ȣ(employee_id)�� 131�� ����� job_id �� salary �� ��� ��ġ�ϴ� ������� last_name, job_id, salary �� ��ȸ�Ѵ�.
-- 1) �����ȣ(employee_id)�� 131�� ����� job_id �� salary ��ȸ
-- 2) 1)�� �����ϴ� ��� ��ȸ
SELECT job_id, salary FROM employees WHERE employee_id = 131;
SELECT last_name, job_id, salary
FROM employees
WHERE (job_id, salary) = (SELECT job_id, salary 
                          FROM employees 
                          WHERE employee_id = 131);

-- 6. ������ ������ ������ ������ �ִ� ������� employee_id, job_id �� ��ȸ�Ѵ�.
-- 1) ������ ������ ��ȸ
-- 2) 1)�� �����ϴ� ��� ��ȸ
SELECT employee_id, job_id FROM job_history;
SELECT employee_id, job_id
FROM employees
WHERE (employee_id, job_id) IN (SELECT employee_id, job_id 
                                FROM job_history);


-- 7. location_id �� 1000 ����(1000~1900)�� ����(country_id)�� country_id, country_name �� ��ȸ�Ѵ�.
-- 1) location_id �� 1000 ����(1000~1900)�� ����(country_id)�� country_id �� ��ȸ
-- 2) 1)�� �����ϴ� ���� ��ȸ
SELECT DISTINCT country_id FROM locations WHERE location_id BETWEEN 1000 AND 1900;
SELECT country_id, country_name
FROM countries
WHERE country_id IN (SELECT DISTINCT country_id 
                     FROM locations 
                     WHERE location_id BETWEEN 1000 AND 1900);


-- 8. 'Executive' �μ��� �ٹ��ϴ� ��� ������� department_id, last_name, job_id �� ��ȸ�Ѵ�.
-- 1) 'Executive' �μ�(department_name)�� �μ���ȣ(department_id) �� ����
-- 2) 1)�� �����ϴ� ��� ��ȸ
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


-- 9. department_id �� 30 �� �μ��� �ٹ��ϴ� ����� �߿��� department_id �� 50 �� �������� �޴� �������� ū ������ �޴� ������� 
-- employee_id, last_name, salary �� ��ȸ�Ѵ�.
-- 1) department_id �� 50 �� �������� �޴� ���� ���ϱ�
-- 2) 1) �� ����麸�� ū ������ �޴�(��� 1)�� ��� ���� ū) + department_id �� 30�� ��� ��ȸ
SELECT DISTINCT salary FROM employees WHERE department_id = 50;
SELECT employee_id, last_name, salary
FROM employees
WHERE salary > ALL(SELECT DISTINCT salary FROM employees WHERE department_id = 50)
AND department_id = 30;

SELECT employee_id, last_name, salary
FROM employees
WHERE salary > (SELECT MAX(salary) FROM employees WHERE department_id = 50)
AND department_id = 30;


-- 10. �ּ��� department_id �� 50 �� �μ��� �ٹ��ϴ� ������� ����(salary) ���ٴ� ���� ������ �޴� �ٸ� �μ� ������� 
-- department_id, employee_id, last_name, salary �� ��ȸ�Ѵ�.
SELECT department_id, employee_id, last_name, salary
FROM employees
WHERE salary > ANY(SELECT DISTINCT salary FROM employees WHERE department_id = 50)
AND department_id = 30;

SELECT department_id, employee_id, last_name, salary
FROM employees
WHERE salary > (SELECT MIN(salary) FROM employees WHERE department_id = 50)
AND department_id = 30;


-- 11. last_name �� u�� ���ԵǴ� ������ ������ �μ��� �ٹ��ϴ� ������� employee_id, last_name �� ��ȸ�Ѵ�.
-- 1) last_name �� u�� ���ԵǴ� ������� �μ���ȣ ��ȸ
-- 2) 1)�� �����ϴ� ��� ��ȸ
SELECT DISTINCT department_id FROM employees WHERE last_name LIKE '%u%';
SELECT employee_id, last_name
FROM employees
WHERE department_id IN (SELECT DISTINCT department_id 
                        FROM employees 
                        WHERE last_name LIKE '%u%');


-- 12. �Ŵ����� �ƴ� ����� �̸�(first_name, last_name)�� ��ȸ�Ѵ�.
-- (1)  not exists
SELECT first_name, last_name
FROM employees e
WHERE not exists (SELECT p.manager_id FROM employees p WHERE e.employee_id = p.manager_id);

-- (2) not in
-- 1) �Ŵ����� ����� manager_id ��ȸ
-- 2) 1) �� �ƴ� ��� ��ȸ
SELECT manager_id FROM employees WHERE manager_id IS NOT NULL;
SELECT first_name, last_name
FROM employees
WHERE employee_id NOT IN (SELECT manager_id 
                          FROM employees 
                          WHERE manager_id IS NOT NULL);


-- ���� (�������� ����� NULL �� ������ �� �ȴ�.)
SELECT first_name, last_name
FROM employees
WHERE employee_id NOT IN (SELECT manager_id 
                          FROM employees); -- �������� ����� NULL �� �־ �˻��Ǵ� ������ ����.
                          
-- �ذ��ϰ� �ʹ�. (NULL �� ���ָ� �ȴ�.)
SELECT first_name, last_name
FROM employees
WHERE employee_id NOT IN (SELECT NVL(manager_id, 999) 
                          FROM employees); -- NULL ��� 999(���� ���̵� ��� ����) �� ä��� NVL �Լ��� ���� �ȴ�.

