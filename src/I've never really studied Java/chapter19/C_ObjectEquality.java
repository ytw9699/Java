﻿package chapter19;
class IntNumber
{
	int num;
	
	public IntNumber(int num)
	{
		this.num=num;
	}
	
	public boolean isEquals(IntNumber numObj)//메소드를 내가 만들고 비교하는것
	{
		if(this.num==numObj.num)
			return true;
		else
			return false;
	}
}

class C_ObjectEquality
{
	public static void main(String[] args)
	{
		IntNumber num1=new IntNumber(10);
		IntNumber num2=new IntNumber(12);
		IntNumber num3=new IntNumber(10);
		
		if(num1.isEquals(num2))
			System.out.println("num1과 num2는 동일한 정수");
		else
			System.out.println("num1과 num2는 다른 정수");
		
		if(num1.isEquals(num3))
			System.out.println("num1과 num3는 동일한 정수");
		else
			System.out.println("num1과 num3는 다른 정수");
		
	}
}