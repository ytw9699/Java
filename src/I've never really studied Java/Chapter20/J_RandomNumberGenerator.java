package Chapter20;
import java.util.Random;

class J_RandomNumberGenerator
{	
	public static void main(String[] args)
	{
		Random rand=new Random();
		
		for(int i=0; i<100; i++)
			System.out.println(rand.nextInt(1000));
	}
}