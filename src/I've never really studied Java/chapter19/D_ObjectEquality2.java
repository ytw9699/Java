package chapter19;
class IntNumber2
{
	int num;
	
	public IntNumber2(int num)
	{
		this.num=num;
	}
	
	public boolean equals(Object obj)//�������̵�� ���ϴ°�
	{
		if(this.num==((IntNumber2)obj).num)
			return true;
		else
			return false;
	}
}

class D_ObjectEquality2
{
	public static void main(String[] args)
	{
		IntNumber2 num1=new IntNumber2(10);
		IntNumber2 num2=new IntNumber2(12);
		IntNumber2 num3=new IntNumber2(10);
		
		if(num1.equals(num2))
			System.out.println("num1�� num2�� ������ ����");
		else
			System.out.println("num1�� num2�� �ٸ� ����");
		
		if(num1.equals(num3))
			System.out.println("num1�� num3�� ������ ����");
		else
			System.out.println("num1�� num3�� �ٸ� ����");
	}
}