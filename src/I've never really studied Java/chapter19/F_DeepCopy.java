package chapter19;
class Point1 implements Cloneable
{
	private int xPos;
	private int yPos;
	
	public Point1(int x, int y)
	{
		xPos=x;
		yPos=y;
	}
	public void showPosition()
	{
		System.out.printf("[%d, %d]", xPos, yPos);
	}
	public void changePos(int x, int y)
	{
		xPos=x;
		yPos=y;
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

class Rectangle1 implements Cloneable
{
	Point1 upperLeft, lowerRight;
	
	public Rectangle1(int x1, int y1, int x2, int y2)
	{
		upperLeft=new Point1(x1, y1);
		lowerRight=new Point1(x2, y2);
	}
	public void showPosition()
	{
		System.out.println("���簢�� ��ġ����...");
		System.out.print("�� ���: ");
		upperLeft.showPosition();
		System.out.println("");	
		System.out.print("�� �ϴ�: ");
		lowerRight.showPosition();	
		System.out.println("\n");
	}
	public void changePos(int x1, int y1, int x2, int y2)
	{
		upperLeft.changePos(x1, y1);
		lowerRight.changePos(x2, y2);
	}
	public Object clone() throws CloneNotSupportedException
	{
		Rectangle1 copy=(Rectangle1)super.clone();
		copy.upperLeft=(Point1)upperLeft.clone();//point �ν��Ͻ� ���� ����δٺ���
		copy.lowerRight=(Point1)lowerRight.clone();		
		return copy;
	}
}

class F_DeepCopy
{	
	public static void main(String[] args)
	{
		Rectangle1 org=new Rectangle1(1, 1, 9, 9);
		Rectangle1 cpy;
		
		try
		{
			cpy=(Rectangle1)org.clone();
			org.changePos(2, 2, 7, 7);
			org.showPosition();
			cpy.showPosition();
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}