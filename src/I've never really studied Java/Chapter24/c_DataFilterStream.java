package Chapter24;
import java.io.*;

class c_DataFilterStream
{
	public static void main(String[] args) throws IOException
	{
		OutputStream out = new FileOutputStream("C:\\upload\\test3.txt");
		
		DataOutputStream filterOut = new DataOutputStream(out);//필터스트림을 파일 아웃풋 스트림에 연결
		
		filterOut.writeInt(275);
		filterOut.writeDouble(45.79);
		filterOut.close();//필터스트림 파일 아웃풋스트림 같이 소멸
		
		InputStream in=new FileInputStream("C:\\upload\\test3.txt");
		
		DataInputStream filterIn = new DataInputStream(in);//필터스트림을 파일인풋스트림에 연결
		
		
		int num1 = filterIn.readInt();
		double num2 = filterIn.readDouble();
		int num3 = filterIn.readInt();
		filterIn.close();
		
		System.out.println(num1);
		System.out.println(num2);		
	}
}