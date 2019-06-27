package Chapter21;
class AAA2
{
	public String toString()
	{
		return "Class AAA";
	}
}

class BBB2
{
	public String toString()
	{
		return "Class BBB";
	}
}

class InstanceTypeShower2
{
	public <T, U> void showInstType(T inst1, U inst2)
	{
		System.out.println(inst1);
		System.out.println(inst2);
	}
}

class D_IntroGenericMethod2
{	
	public static void main(String[] args)
	{
		AAA2 aaa=new AAA2();
		BBB2 bbb=new BBB2();
		
		InstanceTypeShower2 shower=new InstanceTypeShower2();
		shower.<AAA2, BBB2>showInstType(aaa, bbb);
		shower.showInstType(aaa, bbb);//<AAA2, BBB2>생략가능
	}
}