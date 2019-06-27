﻿package orange.perimeter;    // 패키지 선언

public class Circle
{
	double rad;
	final double PI;
	
	public Circle(double r)
	{
		rad=r;
		PI=3.14;
	}
	public double getPerimeter()
	{
		return (rad*2)*PI;
	}
}