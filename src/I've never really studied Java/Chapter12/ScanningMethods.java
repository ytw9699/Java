package Chapter12;
import java.util.Scanner;
class ScanningMethods
{
	public static void main(String[] args)
	{
		Scanner keyboard=new Scanner(System.in);
		
		System.out.print("����� �̸���? ");
		String str=keyboard.nextLine();
		System.out.println("�ȳ��ϼ��� "+str+'��');
		
		System.out.print("����� ���İ�Ƽ�� �����Ѵٴµ�, �����Դϱ�? ");
		boolean isTrue=keyboard.nextBoolean();
		if(isTrue==true)
			System.out.println("��~ �����ϴ±���.");
		else
			System.out.println("�̷� �ƴϾ�����.");
	
		System.out.print("��Ű� ������ Ű�� ��� �ǳ���? ");
		double num1=keyboard.nextDouble();
		double num2=keyboard.nextDouble();
		double diff=num1-num2;
		if(diff>0)
			System.out.println("����� "+diff+"��ŭ ũ����.");
		else
			System.out.println("����� "+(-diff)+"��ŭ �۱���.");
	}
}