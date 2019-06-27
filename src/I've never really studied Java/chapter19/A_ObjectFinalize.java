package chapter19;
class MyName
{
	String objName;
	
	public MyName(String name)
	{
		objName=name;
	}
	
	protected void finalize() throws Throwable
	{
		super.finalize();
		System.out.println(objName+"이 소멸되었습니다.");
	}
}

class A_ObjectFinalize
{	
	public static void main(String[] args)
	{
		MyName obj1=new MyName("인스턴스1");
		MyName obj2=new MyName("인스턴스2");
		obj1=null;
		obj2=null;
		
		System.out.println("프로그램을 종료합니다.");
		//가비지컬렉터가 실행이 안될수도있기 때문에 아래처럼 실행해준거
		 //System.gc();//가비지 컬렉터 실행
		// System.runFinalization();//finalize 메소드 실행
	}
}