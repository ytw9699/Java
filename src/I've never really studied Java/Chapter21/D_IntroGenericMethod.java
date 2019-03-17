package Chapter21;
class AAA1
{
	public String toString()
	{
		return "Class AAA1";
	}
}

class BBB1
{
	public String toString()
	{
		return "Class BBB1";
	}
}

class InstanceTypeShower
{
	int showCnt=0;
	
	public <T> void showInstType(T inst)//�޼ҵ常 �κ������� ���׸�ȭ
	{
		System.out.println(inst);
		showCnt++;
	}
	
	void showPrintCnt()
	{
		System.out.println("Show count: "+showCnt);
	}
}

class D_IntroGenericMethod
{	
	public static void main(String[] args)
	{
		AAA1 aaa=new AAA1();
		BBB1 bbb=new BBB1();
		
		InstanceTypeShower shower=new InstanceTypeShower();
		shower.<AAA1>showInstType(aaa);
		shower.showInstType(aaa);//<AAA1>��������
		shower.<BBB1>showInstType(bbb);
		shower.showPrintCnt();
	}
}