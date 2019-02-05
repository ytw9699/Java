package Chapter15;
//오버라이딩과 오버로딩의 차이점
class AAA
{
	public void rideMethod(){System.out.println("AAA's Method");}
	public void loadMethod(){System.out.println("void Method");}
}

class BBB extends AAA
{
	public void rideMethod(){System.out.println("BBB's Method");}
	public void loadMethod(int num){System.out.println("int Method");}
}

class CCC extends BBB
{
	public void rideMethod1(){System.out.println("AAA's Method");}
	public void rideMethod(){System.out.println("CCC's Method");}
	public void loadMethod(double num){System.out.println("double Method");}
}

class G_RideAndLoad
{
	public static void main(String[] args)
	{
		AAA ref1=new CCC();		
		BBB ref2=new CCC();
		CCC ref3=new CCC();
		
		ref1.rideMethod();//CCC's Method
		//ref1.rideMethod1();//하지만 이것은 에러발생한다
		ref2.rideMethod();//CCC's Method
		ref3.rideMethod();//CCC's Method
		
		ref3.loadMethod();//void Method
		ref3.loadMethod(1);//int Method
		ref3.loadMethod(1.2);//double Method
	}
}