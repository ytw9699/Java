package Chapter7;
class Number4
{
	int num=0;
	public void addNum(int n)
	{
		num+=n;
	}
	public int getNumber()
	{
		return num;
	}
}

class PassInstance
{
	public static void main(String[] args)
	{
		Number4 nInst=new Number4();
		System.out.println("�޼ҵ� ȣ�� ��: "+nInst.getNumber());
		
		simpleMethod(nInst);
		System.out.println("�޼ҵ� ȣ�� ��: "+nInst.getNumber());	
	}	
	public static void simpleMethod(Number4 numb)//���������� �����Ѵٴ� �ǹ̰� ���⼭���� �ٽ�
	{
		numb.addNum(12);
	}	
}