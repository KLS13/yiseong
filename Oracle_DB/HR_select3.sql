-- 31. first_name �� 'Curtis' �� ����� first_name, last_name, email, phone_number, job_id �� ��ȸ�Ѵ�.
-- ��, job_id �� ����� �ҹ��ڷ� ��µǵ��� �Ѵ�.
select replace(first_name,'Curtis','ĿƼ��'), last_name, email, phone_number, lower(job_id)
from employees
where first_name = 'Curtis';

-- 32. �μ���ȣ�� 60, 70, 80, 90 �� ������� employee_id, first_name, last_name, hire_date, job_id �� ��ȸ�Ѵ�.
-- ��, job_id �� IT_PROG �� ����� ��� '���α׷���'�� �����Ͽ� ����Ѵ�.
select department_id,employee_id, first_name, last_name, hire_date, replace(job_id, 'IT_PROG', '���α׷���')
from employees
where department_id in (60, 70, 80, 90);

-- 33. job_id �� AD_PRES, PU_CLERK �� ������� employee_id, �����(full_name), employee_id, department_id, job_id �� ��ȸ�Ѵ�.
-- ��, �����(full_name)�� first_name �� last_name �� �����Ͽ� ����Ѵ�.
select employee_id, concat(first_name, last_name), employee_id, department_id, job_id
from employees
where job_id in ('AD_PRES', 'PU_CLERK');

select employee_id, first_name || ' ' || last_name, employee_id, department_id || '�� ' || job_id || '��' as ID
from employees
where job_id in ('AD_PRES', 'PU_CLERK');

-- 34. last_name �� u �� ���ԵǴ� ������� employee_id, last_name �� ��ȸ�Ѵ�.
select employee_id, last_name
from employees
where instr(last_name, 'u') > 0;
-- where last_name like '%u%';

-- 35. ��ȭ��ȣ(phone_number)�� 650���� �����ϴ� ������� last_name, phone_number �� ��ȸ�Ѵ�.
select concat('�̸� : ', last_name), substr(phone_number,1,8) || '****' as ����ȣ
from employees
where substr(phone_number, 1, 3) = '650';

-- 36. last_name �� �� ��° ���ڰ� a �� ������� last_name �� ��ȸ�Ѵ�.
select last_name
from employees
where instr(last_name, 'a') = 4;

select last_name
from employees
where substr(last_name, 4, 1) = 'a';

-- 37. ȸ���� ���� ����� �Ҽ� 2�ڸ����� �ݿø��Ͽ� ����Ѵ�.
select round(avg(salary), 2)
from employees;

-- 38. ȸ���� ���� �Ѿ��� $500,000 �� ���� �������� ����Ѵ�.
select to_char(sum(salary), '$999,999') -- 999999 : 6�ڸ� ���� ���ڴ� ����
from employees;

-- 39. last_name �� 'McCain' �� ����� ���ݱ��� �ٹ��� �ټ���(service_days)�� '4500��' �� ���� �������� ����Ѵ�.
select trunc(sysdate - hire_date) || '��' AS service_days
from employees
where last_name = 'McCain';

-- 40. last_name �� 'McCain' �� ����� ���ݱ��� �ٹ��� �ټ���(service_days)�� '120����' �� ���� �������� ����Ѵ�.
select trunc(MONTHS_BETWEEN(SYSDATE, hire_date)) || '����' AS service_days
from employees
where last_name = 'McCain';

-- ��ü
select sum(trunc(MONTHS_BETWEEN(SYSDATE, hire_date))) || '����' AS service_days
from employees;


-- 41. �� �μ�(department_id)���� �׷�ȭ�Ͽ� department_id �� �μ��� ����� ���� ����Ѵ�.
select department_id, count(*)
from employees
group by department_id
order by department_id;

-- 42. �μ�(department_id)���� �����Ͽ� department_id �� �޿������ ����Ѵ�.
-- ��, ��ձ޿��� �Ҽ� ���� �ݿø��Ͽ� ������ ó���ϰ�, department_id ������ �����Ѵ�.
select department_id, round(avg(salary)), count(*)
from employees
group by department_id
order by department_id;

-- 43. ������ ����(job_id)�� ���� ������� job_id �� �ο����� ��ձ޿��� �������� ����Ѵ�.
-- ��, ��ձ޿��� �� ������ �����Ͽ� ǥ���ϰ� ��ձ޿� ������ ����Ѵ�.
select job_id, count(*), trunc(avg(salary))
from employees
GROUP BY job_id
order by avg(salary);

-- 44. ����(job_id)�� SH_CLERK �� �������� �ο����� �ִ�޿� �� �ּұ޿��� ����Ѵ�.
select count(*), max(salary), min(salary)
from employees
where job_id = 'SH_CLERK'
group by job_id;

select count(*), max(salary), min(salary)
from employees
group by job_id
having job_id = 'SH_CLERK';


-- 45. �ٹ����� ������� 5�� �̻��� �μ��� department_id �� �ش� �μ��� ������� �Բ� ����Ѵ�.
-- department_id �� �������� �����Ͽ� ����Ѵ�.
select department_id, count(*)
from employees
group by department_id
having count(*) >= 5
order by department_id;

select job_id, count(*)
from employees
group by job_id
having count(*) >=10;


-- 46. ��ձ޿��� 10000 �̻��� �μ��� department_id �� ��ձ޿��� ����Ѵ�.
-- ��ձ޿��� �Ҽ� ���� ����ó���Ѵ�.
select department_id as �μ�, trunc(avg(salary)) ||'����' as ����ӱ�
from employees
group by department_id
having avg(salary) >= 10000
order by department_id;

-- 47. �μ�(department_id)���� ���� ����(job_id)�� ���� ������� �ο����� �μ������� �����Ͽ� ����Ѵ�.
-- ��, department_id �� ���� ����� ������� �ʴ´�.
select department_id, job_id, count(*)
from employees
where department_id is not null
group by department_id, job_id
order by department_id;
