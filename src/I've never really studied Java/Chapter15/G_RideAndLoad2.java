package Chapter15;
//인스턴스 변수는 오버라이딩 되지않는다
class AAA4
{
	public int num=2;
}

class BBB4 extends AAA4
{
	public int num=5;
}

class CCC4 extends BBB4
{
	public int num=7;
}

class G_RideAndLoad2
{
	public static void main(String[] args)
	{
		CCC4 ref1=new CCC4();		
		BBB4 ref2=ref1;
		AAA4 ref3=ref2;
	
		System.out.println(ref1.num);
		System.out.println(ref2.num);
		System.out.println(ref3.num);
	}
}