import orange.area.Circle;
import orange.perimeter.Circle;

class PackageCircle
{
	public static void main(String args[])
	{
		Circle c1=new Circle(1.5);
		System.out.println("�������� 1.5�� ���� ����: "+c1.getArea());

		Circle c2 = new Circle(2.5);
		System.out.println("�������� 2.5�� ���� �ѷ�: "+c2.getPerimeter());
	}
}