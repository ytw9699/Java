package Chapter11;
class C_StringCopy
{
	public static void main(String[] args)
	{
		String str1="Lemon";
		String str2="Lemon";
		String str3=new String(str2);
		
		if(str1==str2)
			System.out.println("str1�� str2�� ���� �ν��Ͻ� ����");
		else
			System.out.println("str1�� str2�� �ٸ�  �ν��Ͻ� ����");			
		
		if(str2==str3)
			System.out.println("str2�� str3�� ���� �ν��Ͻ� ����");
		else
			System.out.println("str2�� str3�� �ٸ�  �ν��Ͻ� ����");	
	}
}