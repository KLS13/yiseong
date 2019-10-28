회원 테이블 
회원_시퀀스
	회원번호(no)     number 시퀀스         PK
	아이디(id)	   varchar2(20) 	   NOT NULL, UNIQUE
	비밀번호(pw)     varchar2(20) 	   NOT NULL
	이메일(email)   varchar2(40)  	   UNIQUE
	주소(addr)      carchar2(40)  	   NULL
	포인트(point)   number default 0 
	생일(birthday)  date 	           NULL
	가입일(regdate) date default sysdate
	
구매 테이블(buy)
구매시퀀스(buy_seq)

	구매번호(buy_no)  number  시퀀스  PK
	회원번호(no)     number         REFERENECS MEMBER(NO)
	제품번호(pno)    number         NOT NULL
	수량(ea)	        number 	      NOT NULL

