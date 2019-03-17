package Chapter15;
class AAA1 
{
	public int num=2;
}

class BBB1 extends AAA1
{
	public int num=5;
}

class CCC1 extends BBB1
{
	public int num=7;
}

class E_ValReDecle
{
	public static void main(String[] args)
	{
		CCC1 ref1=new CCC1();		
		BBB1 ref2=ref1;
		AAA1 ref3=ref2;
		//BBB1 ref4=ref3;//에러발생
		
		System.out.println("CCC's ref: "+ref1.num);		
		System.out.println("BBB's ref: "+ref2.num);		
		System.out.println("AAA's ref: "+ref3.num);
	}
}