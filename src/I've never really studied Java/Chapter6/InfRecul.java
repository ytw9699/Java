package Chapter6;
class InfRecul
{
	public static void main(String[] args)
	{
		showHi(3);
	}

	public static void showHi(int cnt)
	{
		System.out.println("Hi~ ");
		showHi(cnt--);//재귀가 종료되지못함..--cnt로 바꿔야함
		if(cnt==1)  //이것도 메소드와 재귀를 부르는 중간에 놓여져야함
			return;
	}
}