import java.util.Scanner;

class StringScanning
{
	public static void main(String[] args)
	{
		String source="1 5 7";
		Scanner sc=new Scanner(source);
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int sum=num1+num2+num3;
		
		System.out.printf(
			"���ڿ��� ����� %d, %d, %d�� ���� %d \n", 
			num1, num2,num3, sum);
	}
}