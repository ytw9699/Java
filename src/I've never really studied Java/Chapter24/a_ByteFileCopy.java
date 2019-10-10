package Chapter24;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.InputStream;
	import java.io.OutputStream;
	
class a_ByteFileCopy //1바이트 단위로 복사
{
	public static void main(String[] args) throws IOException
	{
		InputStream in=new FileInputStream("C:\\upload\\test.txt");
		OutputStream out=new FileOutputStream("C:\\upload\\test1.txt");
		
		int copyByte=0;
		int bData;
		
		while(true)
		{
			bData=in.read();//read는 데이터를 1바이트씩 읽어들임
			
			if(bData==-1)
				break;
			
			out.write(bData);
			
			copyByte++;
		}

		in.close();
		out.close();		
		
	}
}