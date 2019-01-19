package Chapter7;
class Number4
{
	int num=0;
	public void addNum(int n)
	{
		num+=n;
	}
	public int getNumber()
	{
		return num;
	}
}

class PassInstance
{
	public static void main(String[] args)
	{
		Number4 nInst=new Number4();
		System.out.println("메소드 호출 전: "+nInst.getNumber());
		
		simpleMethod(nInst);
		System.out.println("메소드 호출 후: "+nInst.getNumber());	
	}	
	public static void simpleMethod(Number4 numb)//여러곳에서 참조한다는 의미가 여기서보는 핵심
	{
		numb.addNum(12);
	}	
}