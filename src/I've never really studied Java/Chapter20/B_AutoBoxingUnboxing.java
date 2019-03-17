package Chapter20;
class B_AutoBoxingUnboxing
{	
	public static void main(String[] args)
	{
		Integer iValue=10;//오토박싱
		Double dValue=3.14;//오토박싱
		
		System.out.println(iValue);
		System.out.println(dValue);
		
		int num1=iValue;//오토언박싱
		double num2=dValue;//오토언박싱
		System.out.println(num1);
		System.out.println(num2);
	}
}
