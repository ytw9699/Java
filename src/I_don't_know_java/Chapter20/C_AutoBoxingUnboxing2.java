package Chapter20;
class C_AutoBoxingUnboxing2
{	
	public static void main(String[] args)
	{
		Integer num1=10;//����ڽ�
		Integer num2=20;//����ڽ�
		
		num1++;//�����ڽ��� �ٽ� ����ڽ�
		System.out.println(num1);
		
		num2+=3;	
		System.out.println(num2);	
		
		int addResult=num1+num2;
		System.out.println(addResult);
		
		int minResult=num1-num2;	
		System.out.println(minResult);	
	}
}
