package Chapter5;
class LabeledBreak
{
	public static void main(String[] args)
	{
		outerLoop:
		for(int i=1; i<10; i++)
		{
			for(int j=1; j<10; j++)
			{
				System.out.println("[" + i +", " + j + "]");
				if(i%2==0 && j%2==0)
					break outerLoop;
			}
		}
		
	}
}
