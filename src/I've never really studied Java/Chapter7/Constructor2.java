package Chapter7;
class Number2
{
	int num;
	
	public Number2(int n)
	{
		num=n;
		System.out.println("���� ����: "+n);
	}
	public int getNumber()
	{
		return num;
	}
}

class Constructor2
{
	public static void main(String[] args)
	{
		Number2 num1=new Number2(10);
		System.out.println("�޼ҵ� ��ȯ ��: "+num1.getNumber());
		
		Number2 num2=new Number2(20);
		System.out.println("�޼ҵ� ��ȯ ��: "+num2.getNumber());
	}	
}