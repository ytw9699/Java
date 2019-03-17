package Chapter20;
class C_AutoBoxingUnboxing2
{	
	public static void main(String[] args)
	{
		Integer num1=10;//오토박싱
		Integer num2=20;//오토박싱
		
		num1++;//오토언박싱후 다시 오토박싱
		System.out.println(num1);
		
		num2+=3;	
		System.out.println(num2);	
		
		int addResult=num1+num2;
		System.out.println(addResult);
		
		int minResult=num1-num2;	
		System.out.println(minResult);	
	}
}
