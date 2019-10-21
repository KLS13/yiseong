package com.koreait.ex;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.LongBuffer;

public class Ex07_Big_number {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE); //int���� �ִ밪
		System.out.println(Long.MAX_VALUE); //long ���� �ִ밪
		BigInteger a = new BigInteger("94444444444444444422222222222222222222222"); // long Ÿ�� �̻�  ��� ����
		BigInteger b = new BigInteger("12345678912345678912345678912345678912345");
		System.out.println(BigInteger.ZERO);
		System.out.println(BigInteger.ONE);
		System.out.println(BigInteger.TEN);
		
		System.out.println(a.add(b));
		System.out.println(a.subtract(b)); 
		System.out.println(a.multiply(b));
		System.out.println(a.divide(b));
		// System.out.println(a.divideAndRemainder(b));
		// BigDecimal Ŭ������ �Ǽ��� �Ҽ� �ڸ����� ���Ѿ���(�սǾ���)
		double d = 1.23223232323232323;
		System.out.println(d);
		BigDecimal e = new BigDecimal("1.12345678912345678912345679123456798");
		System.out.println(e);
		
	}

}
