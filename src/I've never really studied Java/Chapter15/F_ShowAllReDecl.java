package Chapter15;
class AAA2 
{
	public int num=2;
}

class BBB2 extends AAA2
{
	public int num=5;
	public void showSuperNum()
	{
		System.out.println("AAA's num: "+super.num);
	}
}

class CCC2 extends BBB2
{
	public int num=7;
	public void showAllNums()
	{
		super.showSuperNum();
		System.out.println("BBB's num: "+super.num);	
		System.out.println("CCC's num: "+num);
	}
}

class F_ShowAllReDecl
{
	public static void main(String[] args)
	{
		CCC2 ref=new CCC2();
		ref.showAllNums();
	}
}