package Chapter18;
import java.util.Scanner;

class AgeInputException1 extends Exception
{
	public AgeInputException1()
	{
		super("��ȿ���� ���� ���̰� �ԷµǾ����ϴ�.");
	}
}

class ProgrammerDefineException
{	
	public static void main(String[] args)
	{
		System.out.print("���̸� �Է��ϼ���: ");
		
		try
		{
			int age=readAge();
			System.out.println("����� "+age+"���Դϴ�.");
		}
		catch(AgeInputException1 e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static int readAge() throws AgeInputException1
	{
		Scanner keyboard=new Scanner(System.in);
		int age=keyboard.nextInt();
		if(age<0)
		{
			AgeInputException1 excpt=new AgeInputException1();
			throw excpt;
		}
		
		return age;
	}
}