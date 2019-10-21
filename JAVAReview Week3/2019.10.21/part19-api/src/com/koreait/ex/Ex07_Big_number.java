package com.koreait.ex;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.LongBuffer;

public class Ex07_Big_number {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE); //int형의 최대값
		System.out.println(Long.MAX_VALUE); //long 형의 최대값
		BigInteger a = new BigInteger("94444444444444444422222222222222222222222"); // long 타입 이상  사용 가능
		BigInteger b = new BigInteger("12345678912345678912345678912345678912345");
		System.out.println(BigInteger.ZERO);
		System.out.println(BigInteger.ONE);
		System.out.println(BigInteger.TEN);
		
		System.out.println(a.add(b));
		System.out.println(a.subtract(b)); 
		System.out.println(a.multiply(b));
		System.out.println(a.divide(b));
		// System.out.println(a.divideAndRemainder(b));
		// BigDecimal 클래스로 실수의 소수 자릿수를 제한없이(손실없이)
		double d = 1.23223232323232323;
		System.out.println(d);
		BigDecimal e = new BigDecimal("1.12345678912345678912345679123456798");
		System.out.println(e);
		
	}

}
