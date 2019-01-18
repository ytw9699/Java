package Chapter 10;

class SimpleMath    // �ܼ� ��� Ŭ����
{
	public static final double PI=3.1415;
	public static double add(double n1, double n2){ return n1+n2; }
	public static double min(double n1, double n2){ return n1-n2; }
	public static double mul(double n1, double n2){ return n1*n2; }
}

class AreaMath    // ���� ��� Ŭ����
{	
	public static double calCircleArea(double rad)
	{
		double result=SimpleMath.mul(rad, rad);
		result=SimpleMath.mul(result, SimpleMath.PI);
		return result;
	}
	public static double calRectangleArea(double width, double height)
	{
		return SimpleMath.mul(width, height);
	}
}

class PerimeterMath    // �ѷ� ��� Ŭ����
{	
	public static double calCirclePeri(double rad)
	{
		double result=SimpleMath.mul(rad, 2);
		result=SimpleMath.mul(result, SimpleMath.PI);
		return result;
	}
	public static double calRectanglePeri(double width, double height)
	{
		return SimpleMath.add(SimpleMath.mul(width, 2), SimpleMath.mul(height, 2));
	}
}

class ChangeToStaticMethod
{
	public static void main(String[] args)
	{		
		System.out.println("���� ����: "+AreaMath.calCircleArea(2.4));
		System.out.println("���簢�� �ѷ�: "+PerimeterMath.calRectanglePeri(2.0, 4.0));
	}
}