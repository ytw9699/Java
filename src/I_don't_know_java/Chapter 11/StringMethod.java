class StringMethod
{
	public static void main(String[] args)
	{
		String str1="Smart";
		String str2=" and ";
		String str3="Simple";
		String str4=str1.concat(str2).concat(str3);
		
		System.out.println(str4);	
		System.out.println("���ڿ� ����: "+str4.length());

		if(str1.compareTo(str3)<0)
			System.out.println("str1�� �ռ���");
		else
			System.out.println("str3�� �ռ���");
	}
}