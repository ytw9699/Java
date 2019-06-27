package Chapter10;

class InstCnt2
{
	static int instNum=0;
	
	public InstCnt2()
	{
		instNum++;
		System.out.println("인스턴스 생성: "+instNum);
	}
}

class ClassVar
{
	public static void main(String[] args)
	{
		InstCnt2 cnt1=new InstCnt2();
		InstCnt2 cnt2=new InstCnt2();
		InstCnt2 cnt3=new InstCnt2();
	}
}