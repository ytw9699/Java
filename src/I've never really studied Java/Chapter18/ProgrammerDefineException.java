package Chapter18;
import java.util.Scanner;

class AgeInputException1 extends Exception
{
	public AgeInputException1()
	{
		super("유효하지 않은 나이가 입력되었습니다.");
	}
}

class ProgrammerDefineException
{	
	public static void main(String[] args)
	{
		System.out.print("나이를 입력하세요: ");
		
		try
		{
			int age=readAge();
			System.out.println("당신은 "+age+"세입니다.");
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