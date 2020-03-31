DROP TABLE book;
DROP TABLE customer;
DROP TABLE orders;


-- 1. 다음 설명을 읽고 적절한 테이블을 생성하되, 기본키/외래키는 별도로 설정하지 않는다.

-- 1) book 테이블
-- bookid : 책 아이디, 숫자 (최대 11자리), 널 불가
-- bookname : 책 이름, 가변 길이 문자 (최대 100)
-- publisher : 출판사, 가변 길이 문자 (최대 50)
-- price : 가격, 숫자 (최대 6자리)
CREATE TABLE book (
    bookid number(11) NOT NULL,
    bookname varchar2(100),
    publisher varchar2(50),
    price number(6)
);

-- 2) customer 테이블
-- custid : 고객 아이디, 숫자 (최대 11자리), 널 불가
-- custname : 고객 이름, 가변 길이 문자 (최대 20)
-- address : 고객 주소, 가변 길이 문자 (최대 50)
-- phone : 고객 전화, 고정 길이 문자 (최대 20)
CREATE TABLE customer (
    custid number(11) NOT NULL,
    custname varchar2(20),
    address varchar2(50),
    phone char(20)
);

-- 3) orders 테이블
-- orderid : 주문 아이디, 숫자 (최대 11자리), 널 불가
-- custid : 고객 아이디, 숫자 (최대 11자리)
-- bookid : 책 아이디, 숫자 (최대 11자리)
-- saleprice : 판매 가격, 숫자 (최대 6자리)
-- orderdate : 주문일, 날짜
CREATE TABLE orders (
    orderid number(11) NOT NULL,
    custid number(11),
    bookid number(11),
    saleprice number(6),
    orderdate date
);

-- 4) 아래 insert 문은 변경 없이 그대로 사용한다.
INSERT ALL
    INTO book VALUES (1, '축구의역사', '굿스포츠', 7000)
    INTO book VALUES (2, '축구아는 여자', '나무수', 13000)
    INTO book VALUES (3, '축구의 이해', '대한미디어', 22000)
    INTO book VALUES (4, '골프 바이블', '대한미디어', 35000)
    INTO book VALUES (5, '피겨 교본', '굿스포츠', 6000)
    INTO book VALUES (6, '역도 단계별 기술', '굿스포츠', 6000)
    INTO book VALUES (7, '야구의 추억', '이상미디어', 20000)
    INTO book VALUES (8, '야구를 부탁해', '이상미디어', 13000)
    INTO book VALUES (9, '올림픽 이야기', '삼성당', 7500)
    INTO book VALUES (10,'올림픽 챔피언', '피어슨', 13000)
SELECT * FROM DUAL;

INSERT ALL
    INTO customer VALUES (1, '박지성', '영국 맨체스타', '000-5000-0001')
    INTO customer VALUES (2, '김연아', '대한민국 서울', '000-6000-0001')
    INTO customer VALUES (3, '장미란', '대한민국 강원도', '000-7000-0001')
    INTO customer VALUES (4, '추신수', '미국 클리블랜드', '000-8000-0001')
    INTO customer VALUES (5, '박세리', '대한민국 대전', NULL)
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


-- 2. book, customer, orders 테이블에 적절한 컬럼에 기본키를 추가한다.
ALTER TABLE book ADD CONSTRAINT book_pk PRIMARY KEY (bookid);
ALTER TABLE customer ADD CONSTRAINT customer_pk PRIMARY KEY (custid);
ALTER TABLE orders ADD CONSTRAINT orders_pk PRIMARY KEY (orderid);


-- 3. 외래키가 필요한 테이블을 선정하고 적절한 컬럼에 외래키를 추가한다.
ALTER TABLE orders ADD CONSTRAINT orders_book_fk FOREIGN KEY (bookid) REFERENCES book(bookid);
ALTER TABLE orders ADD CONSTRAINT orders_customer_fk FOREIGN KEY (custid) REFERENCES customer(custid);


-- 4. 2014년 7월 4일부터 7월 7일 사이에 주문 받은 도서를 제외하고 나머지 모든 주문 정보를 출력한다.
SELECT * FROM orders WHERE orderdate NOT BETWEEN '2014-07-04' AND '2014/07/07';


-- 5. 박지성의 총 구매액(saleprice)을 조회한다.
SELECT SUM(saleprice) AS 총구매액
FROM customer c, orders o
WHERE c.custid = o.custid
AND c.custname = '박지성';

SELECT SUM(saleprice) AS 총구매액
FROM customer c INNER JOIN orders o
ON c.custid = o.custid
AND c.custname = '박지성';

SELECT SUM(saleprice) AS 총구매액
FROM (SELECT * FROM customer WHERE custname = '박지성') c,
     orders o
WHERE c.custid = o.custid;


-- 6. 박지성이 구매한 도서의 수를 조회한다.
SELECT COUNT(*)
FROM customer c, orders o
WHERE c.custid = o.custid
AND c.custname = '박지성';


-- 7. 박지성이 구매한 도서를 발간한 출판사 수를 조회한다.
SELECT COUNT(DISTINCT publisher)
FROM book b, customer c, orders o
WHERE b.bookid = o.bookid
AND c.custid = o.custid
AND c.custname = '박지성';


-- 8. 고객별로 분류하여 각 고객의 이름과 각 고객별 총 구매액을 조회한다.
SELECT c.custname, SUM(o.saleprice) AS 총구매액
FROM customer c, orders o
WHERE c.custid = o.custid
GROUP BY c.custname;


-- 9. 주문한 적이 없는 고객의 이름을 조회한다.
-- 1) 주문한 적이 있는 고객의 이름을 조회
-- 2) 1)에 없는 고객의 이름을 조회
SELECT DISTINCT c.custname
FROM customer c, orders o
WHERE c.custid = o.custid;
SELECT custname 
FROM customer 
WHERE custname NOT IN (SELECT DISTINCT c.custname
                       FROM customer c, orders o
                       WHERE c.custid = o.custid);


-- 10. 고객별로 총 구매횟수를 조회한다. 구매한 적이 없는 고객은 구매횟수를 0으로 표시한다.
SELECT c.custname, COUNT(o.custid) AS 구매횟수
FROM customer c LEFT JOIN orders o
ON c.custid = o.custid
GROUP BY c.custname;
