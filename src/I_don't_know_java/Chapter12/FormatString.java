package Chapter12;
class FormatString
{
	public static void main(String[] args)
	{
		int age=20;
		double tall=175.7;
		String name="ȫ�ڹ�";
		
		System.out.printf("�� �̸��� %s�Դϴ�. \n", name);//���� %s
		System.out.printf("���̴� %d�̰�, Ű�� %e�Դϴ�. \n", age, tall);//������� age, tail �������
		System.out.printf("%d %o %x \n", 77, 77, 77);
		System.out.printf("%g %g \n", 0.00014, 0.000014);
	}
}