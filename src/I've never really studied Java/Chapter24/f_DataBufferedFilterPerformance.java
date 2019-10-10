package Chapter24;
import java.io.*;

class f_DataBufferedFilterPerformance
{
	public static void performanceTest(DataOutputStream dataOut)
												throws IOException
	{
		long startTime=System.currentTimeMillis();//1970년 1월 1일 자정 이후로 지나온 시간을 밀리 초(1/1000초) 단위로 계산해서 반환하는 메소드이다
		
		for(int i=0; i<100; i++)
			for(int j=0; j<100; j++)
				dataOut.writeDouble(12.345);
		
		dataOut.flush();
		
		long endTime=System.currentTimeMillis();
		
		System.out.println("경과시간: "+ (endTime-startTime));	
	}
	
	public static void main(String[] args) throws IOException
	{
		OutputStream out1=new FileOutputStream("C:\\upload\\test4.txt");
		DataOutputStream dataOut=new DataOutputStream(out1);
		performanceTest(dataOut);
		dataOut.close();
		
		OutputStream out2=new FileOutputStream("C:\\upload\\test4.txt");
		BufferedOutputStream bufFilterOut
					=new BufferedOutputStream(out2, 1024*10);
		DataOutputStream dataBufOut=new DataOutputStream(bufFilterOut);
		performanceTest(dataBufOut);
		dataBufOut.close();
	}
}