package Chapter20;
class A_BoxingUnboxing
{	
	public static void main(String[] args)
	{
		Integer iValue=new Integer(10);//박싱
		Double dValue=new Double(3.14);//박싱
		
		System.out.println(iValue);//투스트링 메소드 호출
		System.out.println(dValue);//투스트링 메소드 호출
		
		iValue=new Integer(iValue.intValue()+10);//언박싱후 다시 박싱
		dValue=new Double(dValue.doubleValue()+1.2);//언박싱후 다시 박싱
		
		System.out.println(iValue);//투스트링 메소드 호출
		System.out.println(dValue);	//투스트링 메소드 호출	
	}
}