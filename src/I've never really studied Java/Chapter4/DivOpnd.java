package Chapter4;
class DivOpnd
{
	public static void main(String[] args)
	{
		System.out.println("정수형 나눗셈: " + 7/3);
		System.out.println("실수형 나눗셈: " + 7.0f/3.0f);
		System.out.println("형 변환 나눗셈: " + (float)7/3);//(float)7먼저 플로트로변환하고//3은int인데 나눗셈하면 int로 형변환됨
	}
}