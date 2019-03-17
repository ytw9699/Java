class Circle
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

class CirclePerimeter
{
	public static void main(String args[])
	{
		Circle c=new Circle(1.5);
		System.out.println("�������� 1.5�� ���� �ѷ�: "+c.getPerimeter());
	}
}