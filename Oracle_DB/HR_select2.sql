-- 21. JOB_ID �� ST_CLERK �� ����� �ٹ����� �ʴ� �μ���ȣ(department_id)�� ��ȸ�Ѵ�.
-- ��, �μ���ȣ�� NULL�� ���� �����ϰ� �μ���ȣ�� �ߺ��� �����Ѵ�.
select distinct department_id
from employees
where job_id != 'ST_CLERK' -- where job_id <> 'ST_CLERK' | where job_id not in('ST_CLERK')
and department_id is not null;

-- 22. Ŀ�̼�(commission_pct)�� �޴� ������� ���� Ŀ�̼�(commission = salary * commission_pct)�� ���ϰ�,
-- employee_id, first_name, job_id �� �Բ� ����Ѵ�.
select employee_id, first_name, job_id, salary * commission_pct as commission
from employees
where commission_pct is not null;

-- 23. ȸ���� ���� �Ѿ��� ����Ѵ�.
select sum(salary) as ��ü�ݾ�
from employees;

-- 24. ȸ���� ���� ����� ����Ѵ�.
select avg(salary) as average_salary
from employees;

-- 25. �系�� �ִ뿬���� �ּҿ����� ���̸� ����Ѵ�.
select max(salary) - min(salary) as salary_gap
from employees;

-- 26. job_id �� ST_CLERK �� ������� ��ü ���� ����Ѵ�.
-- count(�÷�) : �ش� �÷��� ���� ������ ���Ѵ�. 
-- count(commission_pct) : commission_pct �� NULL �� ����� ����� ������ ���Ե��� �ʴ´�.
-- ������ �÷��� �Ű澲�� �ʰ� ������ ���ϴ� ��찡 ����.
-- count(*) : ��� �÷��� ���� ������ ���Ѵ�. (��õ)

select COUNT(*)
from employees
where job_id = 'ST_CLERK';

-- 27. �Ŵ���(manager_id)�� �ٹ��ϴ� ������� ��ü ���� ����Ѵ�.
select count(manager_id)
from employees;

-- �μ���ȣ�� �� �� �ִ��� ����Ѵ�. (�� ���� �μ��� �ִ��� ����Ѵ�.)
select count(distinct department_id)
from employees;


-- 28. ���� ���� ���� �Ի��� �������� �ֱٿ� �Ի��� ���� ������ last_name, hire_date �� ��ȸ�Ѵ�.
select last_name, hire_date
from employees
order by hire_date asc;  -- order by hire_date;

-- 29. �μ���ȣ(department_id)�� 20��, 50�� �μ����� �ٹ��ϴ� ��� ������� �μ���ȣ�� ������������ ��ȸ�ϵ�,
-- ���� �μ���ȣ �������� last_name �� ���ĺ������� ��ȸ�Ѵ�.
select department_id, last_name
from employees
where department_id in (20, 50)
order by department_id, last_name;

desc employees;

-- 30. Ŀ�̼�(commission_pct)�� �޴� ��� ������� last_name, salary, commission_pct �� ��ȸ�Ѵ�.
-- ������ ���� ����� ���� ����ϰ� ���� ������ ������� Ŀ�̼��� ���� ����� ���� ����Ѵ�.
select last_name, salary, commission_pct
from employees
where commission_pct is not null
order by salary desc, commission_pct desc;
