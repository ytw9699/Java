﻿package Chapter5;
class DupFor
{
	public static void main(String[] args)
	{
		for(int i=0; i<3; i++)
		{
			System.out.println("변수 i의  값: " + i);
			for(int j=0; j<3; j++)
				System.out.println("***변수 j의 값: " + j);
		}
	}
}