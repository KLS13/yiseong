DROP TABLE book;
DROP TABLE customer;
DROP TABLE orders;


-- 1. ���� ������ �а� ������ ���̺��� �����ϵ�, �⺻Ű/�ܷ�Ű�� ������ �������� �ʴ´�.

-- 1) book ���̺�
-- bookid : å ���̵�, ���� (�ִ� 11�ڸ�), �� �Ұ�
-- bookname : å �̸�, ���� ���� ���� (�ִ� 100)
-- publisher : ���ǻ�, ���� ���� ���� (�ִ� 50)
-- price : ����, ���� (�ִ� 6�ڸ�)
CREATE TABLE book (
    bookid number(11) NOT NULL,
    bookname varchar2(100),
    publisher varchar2(50),
    price number(6)
);

-- 2) customer ���̺�
-- custid : �� ���̵�, ���� (�ִ� 11�ڸ�), �� �Ұ�
-- custname : �� �̸�, ���� ���� ���� (�ִ� 20)
-- address : �� �ּ�, ���� ���� ���� (�ִ� 50)
-- phone : �� ��ȭ, ���� ���� ���� (�ִ� 20)
CREATE TABLE customer (
    custid number(11) NOT NULL,
    custname varchar2(20),
    address varchar2(50),
    phone char(20)
);

-- 3) orders ���̺�
-- orderid : �ֹ� ���̵�, ���� (�ִ� 11�ڸ�), �� �Ұ�
-- custid : �� ���̵�, ���� (�ִ� 11�ڸ�)
-- bookid : å ���̵�, ���� (�ִ� 11�ڸ�)
-- saleprice : �Ǹ� ����, ���� (�ִ� 6�ڸ�)
-- orderdate : �ֹ���, ��¥
CREATE TABLE orders (
    orderid number(11) NOT NULL,
    custid number(11),
    bookid number(11),
    saleprice number(6),
    orderdate date
);

-- 4) �Ʒ� insert ���� ���� ���� �״�� ����Ѵ�.
INSERT ALL
    INTO book VALUES (1, '�౸�ǿ���', '�½�����', 7000)
    INTO book VALUES (2, '�౸�ƴ� ����', '������', 13000)
    INTO book VALUES (3, '�౸�� ����', '���ѹ̵��', 22000)
    INTO book VALUES (4, '���� ���̺�', '���ѹ̵��', 35000)
    INTO book VALUES (5, '�ǰ� ����', '�½�����', 6000)
    INTO book VALUES (6, '���� �ܰ躰 ���', '�½�����', 6000)
    INTO book VALUES (7, '�߱��� �߾�', '�̻�̵��', 20000)
    INTO book VALUES (8, '�߱��� ��Ź��', '�̻�̵��', 13000)
    INTO book VALUES (9, '�ø��� �̾߱�', '�Ｚ��', 7500)
    INTO book VALUES (10,'�ø��� è�Ǿ�', '�Ǿ', 13000)
SELECT * FROM DUAL;

INSERT ALL
    INTO customer VALUES (1, '������', '���� ��ü��Ÿ', '000-5000-0001')
    INTO customer VALUES (2, '�迬��', '���ѹα� ����', '000-6000-0001')
    INTO customer VALUES (3, '��̶�', '���ѹα� ������', '000-7000-0001')
    INTO customer VALUES (4, '�߽ż�', '�̱� Ŭ������', '000-8000-0001')
    INTO customer VALUES (5, '�ڼ���', '���ѹα� ����', NULL)
SELECT * FROM DUAL;

INSERT ALL 
    INTO orders VALUES (1, 1, 1, 6000, '2014-07-01')
    INTO orders VALUES (2, 1, 3, 21000, '2014-07-03')
    INTO orders VALUES (3, 2, 5, 8000, '2014-07-03')
    INTO orders VALUES (4, 3, 6, 6000, '2014-07-04')
    INTO orders VALUES (5, 4, 7, 20000, '2014-07-05')
    INTO orders VALUES (6, 1, 2, 12000, '2014-07-07')
    INTO orders VALUES (7, 4, 8, 13000, '2014-07-07')
    INTO orders VALUES (8, 3, 10, 12000, '2014-07-08')
    INTO orders VALUES (9, 2, 10, 7000, '2014-07-09')
    INTO orders VALUES (10, 3, 8, 13000, '2014-07-10')
SELECT * FROM DUAL;


-- 2. book, customer, orders ���̺� ������ �÷��� �⺻Ű�� �߰��Ѵ�.
ALTER TABLE book ADD CONSTRAINT book_pk PRIMARY KEY (bookid);
ALTER TABLE customer ADD CONSTRAINT customer_pk PRIMARY KEY (custid);
ALTER TABLE orders ADD CONSTRAINT orders_pk PRIMARY KEY (orderid);


-- 3. �ܷ�Ű�� �ʿ��� ���̺��� �����ϰ� ������ �÷��� �ܷ�Ű�� �߰��Ѵ�.
ALTER TABLE orders ADD CONSTRAINT orders_book_fk FOREIGN KEY (bookid) REFERENCES book(bookid);
ALTER TABLE orders ADD CONSTRAINT orders_customer_fk FOREIGN KEY (custid) REFERENCES customer(custid);


-- 4. 2014�� 7�� 4�Ϻ��� 7�� 7�� ���̿� �ֹ� ���� ������ �����ϰ� ������ ��� �ֹ� ������ ����Ѵ�.
SELECT * FROM orders WHERE orderdate NOT BETWEEN '2014-07-04' AND '2014/07/07';


-- 5. �������� �� ���ž�(saleprice)�� ��ȸ�Ѵ�.
SELECT SUM(saleprice) AS �ѱ��ž�
FROM customer c, orders o
WHERE c.custid = o.custid
AND c.custname = '������';

SELECT SUM(saleprice) AS �ѱ��ž�
FROM customer c INNER JOIN orders o
ON c.custid = o.custid
AND c.custname = '������';

SELECT SUM(saleprice) AS �ѱ��ž�
FROM (SELECT * FROM customer WHERE custname = '������') c,
     orders o
WHERE c.custid = o.custid;


-- 6. �������� ������ ������ ���� ��ȸ�Ѵ�.
SELECT COUNT(*)
FROM customer c, orders o
WHERE c.custid = o.custid
AND c.custname = '������';


-- 7. �������� ������ ������ �߰��� ���ǻ� ���� ��ȸ�Ѵ�.
SELECT COUNT(DISTINCT publisher)
FROM book b, customer c, orders o
WHERE b.bookid = o.bookid
AND c.custid = o.custid
AND c.custname = '������';


-- 8. ������ �з��Ͽ� �� ���� �̸��� �� ���� �� ���ž��� ��ȸ�Ѵ�.
SELECT c.custname, SUM(o.saleprice) AS �ѱ��ž�
FROM customer c, orders o
WHERE c.custid = o.custid
GROUP BY c.custname;


-- 9. �ֹ��� ���� ���� ���� �̸��� ��ȸ�Ѵ�.
-- 1) �ֹ��� ���� �ִ� ���� �̸��� ��ȸ
-- 2) 1)�� ���� ���� �̸��� ��ȸ
SELECT DISTINCT c.custname
FROM customer c, orders o
WHERE c.custid = o.custid;
SELECT custname 
FROM customer 
WHERE custname NOT IN (SELECT DISTINCT c.custname
                       FROM customer c, orders o
                       WHERE c.custid = o.custid);


-- 10. ������ �� ����Ƚ���� ��ȸ�Ѵ�. ������ ���� ���� ���� ����Ƚ���� 0���� ǥ���Ѵ�.
SELECT c.custname, COUNT(o.custid) AS ����Ƚ��
FROM customer c LEFT JOIN orders o
ON c.custid = o.custid
GROUP BY c.custname;
