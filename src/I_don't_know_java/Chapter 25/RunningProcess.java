import java.io.*;

class RunningProcess
{	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		Process proc=Runtime.getRuntime().exec("java FirstAWTExitEvent");
		proc.waitFor();
		
		if(proc.exitValue()==0)
			System.out.println("�� ����Ǿ���!");
		else
			System.out.println("�����ΰ� ������ �־�!");
	}
}