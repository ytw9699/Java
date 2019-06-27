﻿package chapter19;
class Point2 implements Cloneable
{
	private int xPos;
	private int yPos;
	
	public Point2(int x, int y)
	{
		xPos=x;
		yPos=y;
	}
	public void showPosition()
	{
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println("");
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone(); 
	}
}

class E_InstanceCloning
{	
	public static void main(String[] args)
	{
		Point2 org=new Point2(3, 5);
		Point2 cpy;
		
		try
		{
			cpy=(Point2)org.clone();
			org.showPosition();
			cpy.showPosition();
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}