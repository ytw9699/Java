package Chapter18;
import java.util.Scanner;

class AgeInputException2 extends Exception
{
	public AgeInputException2()
	{
		super("��ȿ���� ���� ���̰� �ԷµǾ����ϴ�.");
	}
}

class ThrowsFromMain
{	
	public static void main(String[] args) throws AgeInputException2
	{
		System.out.print("���̸� �Է��ϼ���: ");
		int age=readAge();
		System.out.println("����� "+age+"���Դϴ�.");
	}
	
	public static int readAge() throws AgeInputException2
	{
		Scanner keyboard=new Scanner(System.in);
		int age=keyboard.nextInt();
		if(age<0)
		{
			AgeInputException2 excpt=new AgeInputException2();
			throw excpt;
		}		
		return age;
	}
}