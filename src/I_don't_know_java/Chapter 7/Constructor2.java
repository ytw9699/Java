class Number
{
	int num;
	
	public Number(int n)
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
		Number num1=new Number(10);
		System.out.println("�޼ҵ� ��ȯ ��: "+num1.getNumber());
		
		Number num2=new Number(20);
		System.out.println("�޼ҵ� ��ȯ ��: "+num2.getNumber());
	}	
}