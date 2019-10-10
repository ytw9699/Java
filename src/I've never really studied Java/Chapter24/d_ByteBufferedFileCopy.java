﻿package Chapter24;
import java.io.*;

class d_ByteBufferedFileCopy
{
	public static void main(String[] args) throws IOException
	{
		InputStream in = new FileInputStream("C:\\upload\\test3.txt");
		
		OutputStream out = new FileOutputStream("C:\\upload\\test3.txt");
		
		BufferedInputStream bin = new BufferedInputStream(in);
		
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		int copyByte=0;
		
		int bData;
		
		while(true)
		{
			bData=bin.read();
			if(bData==-1)
				break;
			
			bout.write(bData);
			copyByte++;
		}
		
		bin.close();
		bout.close();	
		
		System.out.println("복사된 바이트 크기 "+ copyByte);
	}
}