package com.koreait.test;

import java.math.BigInteger;

public class Test06 {

	// 1! = 1
	// 2! = 1! * 2
	// 3! = 2! * 3
	// 4! = 3! * 4
	// ...
	// n! = (n-1)! * n
	
	static BigInteger factorial(BigInteger n) {
		
		if (n.equals(BigInteger.ONE)) {		// if (n == 1) {
			return BigInteger.ONE;
		} else {
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));	// factorial(n-1) * n;
		}
		
	}
	
	public static void main(String[] args) {

		for (int n = 1; n < 100; n++) {
			System.out.println(n + "! = " + factorial(BigInteger.valueOf(n)));
		}
		
	}

}
