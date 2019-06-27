package Chapter4;
class SCE
{
	public static void main(String[] args)
	{
		int num1=0, num2=0;
		boolean result;
		
		result = (num1+=10)<0 && (num2+=10)>0;//&& 좌항피연산자가 폴스면 오른쪽피연산자는 계산도안함 결과반영안됨
		System.out.println("result="+result);
		System.out.println("num1="+num1+", num2="+num2);
		
		result = (num1+=10)>0 || (num2+=10)>0;//&& 좌항피연산자가 투르면 오른쪽피연산자는 계산도안함 결과반영안됨
		System.out.println("result="+result);
		System.out.println("num1="+num1+", num2="+num2);
	}
}