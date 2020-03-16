-- HR ���� 1
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

-- 3. ������ 12000 �̻�Ǵ� �������� last_name, ����(salary)�� ��ȸ�Ѵ�.

SELECT
    last_name,
    salary
FROM
    employees
WHERE
    salary >= 12000;

-- 4. �����ȣ�� 150 �� ����� last_name �� �μ���ȣ(department_id)�� ��ȸ�Ѵ�.

SELECT
    last_name,
    department_id
FROM
    employees
WHERE
    employee_id = 150;

-- 5. Ŀ�̼��� ���� ��� ������� last_name, ����(salary) �� Ŀ�̼�(commission_pct)�� ��ȸ�Ѵ�.

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

-- 6. (Ŀ�̼��� ����) ��� ������� last_name, Ŀ�̼�(commission_pct)�� ��ȸ�ϵ� Ŀ�̼��� ���� ����� 0���� ó���Ͽ� ��ȸ�Ѵ�.

SELECT
    last_name,
    nvl(commission_pct, 0)
FROM
    employees;
--where
--    commission_pct is null;


-- 7. Ŀ�̼�(commission_pct)�� ���� ������� 0���� ó���ϰ�, Ŀ�̼��� �ִ� ������� ���� Ŀ�̼Ǻ��� 0.1��ŭ �λ�� ���·� ��ȸ�Ѵ�.

SELECT
    nvl2(commission_pct, commission_pct + 0.1, 0)
FROM
    employees;

-- 8. ������ 5000 ���� 12000 �� ������ ������� first_name, last_name, ����(salary)�� ��ȸ�Ѵ�.

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

-- 9. ������ 5000 ���� 12000 ������ ������ �ƴ� ������� first_name, last_name, ����(salary)�� ��ȸ�Ѵ�.
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

-- 10. ����(job_id)�� SA_REP �̳� ST_CLERK �� �������� ��ȸ�Ѵ�.
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

-- 11. ������ 2,500, 3,500, 7000 �� �ƴϸ�
-- ������ SA_REP �̳� ST_CLERK �� ������� ��ȸ�Ѵ�.
select *
from employees
where salary not in(2500, 3500, 7000)
and job_id in('SA_REP', 'ST_CLERK');

-- 12. �Ŵ���(manager_id)�� ���� ������� last_name �� job_id �� ��ȸ�Ѵ�.
select last_name, job_id
from employees
where manager_id is null;

-- 13. last_name�� u�� ���ԵǴ� ������� ���(employee_id) �� last_name �� ��ȸ�Ѵ�.
select employee_id, last_name
from employees
where last_name like '%u%';

-- 14. ��ȭ��ȣ(phone_number)�� 650 ���� �����ϴ�
-- ������� last_name, phone_number �� ��ȸ�Ѵ�.
select last_name, phone_number
from employees
where phone_number like '650%';

-- 15. last_name�� �� ��° ���ڰ� a �� �������
-- last_name �� ��ȸ�Ѵ�.
select last_name
from employees
where last_name like '____i%';

-- 16. last_name �� a Ȥ�� e ���ڰ� �ִ� ������� last_name �� ��ȸ�Ѵ�.
select last_name
from employees
where last_name like '%a%' or last_name like '%e%';

-- 17. last_name�� a�� e ���ڰ� ��� �ִ� ������� last_name �� ��ȸ�Ѵ�.
select last_name
from employees
where last_name like '%a%e%' or last_name like '%e%a%';

-- 18. 2008/02/20~2008/05/01 ���̿� ���� ������� last_name, employeed_id, �����(hire_date) �� ��ȸ�Ѵ�.
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

-- 19. 2004�⵵�� ���� ��� �������� last_name, employee_id, hire_date �� ��ȸ�Ѵ�.
select last_name, employee_id, hire_date
from employees
where hire_date >= '2004/01/01'
and hire_date <= '2004/12/31';

select last_name, employee_id, hire_date
from employees
where hire_date between '2004-01-01' and '2004-12-31';

select last_name, employee_id, hire_date
from employees
where hire_date like '04%'; -- 04 �� �����ϴ� ��� hire_date

-- 20. �μ�(department_id)�� �ߺ��� �����Ͽ� ��ȸ�Ѵ�.
select distinct department_id
from employees;
