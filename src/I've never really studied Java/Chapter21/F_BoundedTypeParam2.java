package Chapter21;
interface SimpleInterface3
{
	public void showYourName();
}

class UpperClass3
{
	public void showYourAncestor()
	{
		System.out.println("UpperClass");
	}
}

class AAA3 extends UpperClass3 implements SimpleInterface3
{
	public void showYourName()
	{
		System.out.println("Class AAA");
	}
}

class BBB3 extends UpperClass3 implements SimpleInterface3
{
	public void showYourName() 
	{
		System.out.println("Class BBB");
	}
}

class BoundedTypeParam3
{	//T가 SimpleInterface3를 상속 또는 구현하는 클래스의 자료형이 되어야 함을 명시함
	public static <T extends SimpleInterface3> void showInstanceAncestor(T param)
	{
		param.showYourName();
	}
	

	
	public static <T extends UpperClass3> void showInstanceName(T param)
	{
		param.showYourAncestor();
	}
	
	public static void main(String[] args)
	{
		AAA3 aaa=new AAA3();
		BBB3 bbb=new BBB3();
		
		showInstanceAncestor(aaa);
		showInstanceName(aaa);
		showInstanceAncestor(bbb);
		showInstanceName(bbb);
	}
}