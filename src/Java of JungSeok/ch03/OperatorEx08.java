﻿package ch03;
class OperatorEx08 {
	public static void main(String args[]) { 
		int a = 1000000;    // 1,000,000   1백만 
		int b = 2000000;    // 2,000,000   2백만 

		long c = a * b;     // a * b = 2,000,000,000,000 ?

		System.out.println(c);
	}
}
