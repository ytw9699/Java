﻿package Chapter4;
class PostfixUst
{
	public static void main(String[] args)
	{
		int num1=7, num2;
		num2 = (num1--) + 5;
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
	}
}