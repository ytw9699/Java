package Chapter24;
	import java.io.*;

class b_BufferFileCopy//1바이트 단위가 아닌 버퍼를 이용한 복사 , 여기서 버퍼는 바이트형 배열을 의미, 즉 배열단위로 복사한다는것
{
	public static void main(String[] args) throws IOException
	{
		InputStream in=new FileInputStream("C:\\upload\\test.txt");
		OutputStream out=new FileOutputStream("C:\\upload\\test1.txt");
		
		int copyByte=0;
		int readLen;
		
		byte buf[]=new byte[1024];//read할 버퍼를 마련하는것 1024바이트는 1키로바이트
		
		while(true) {
			
			//public int read(byte[] b, int off, int len) throws IOException
			//위 메소드는 매개변수 b로 전달된 배열에 읽어 들인 데이터를 저장하되，off의 인덱스 위치를 시작으로 최대 len의 길이만큼 읽어 들인다.
			readLen=in.read(buf);//이 read메소드안에 버퍼를 넣음으로써 그 버퍼안에 데이터를 1024바이트까지 저장한다
			//실제 읽어 들인 데이터의 바이트 크기를 반환
			//예를 들어서 배열의 길이가 10이라면 최대 10바이트를 읽어 들일 수 있다
			//System.out.println(readLen);
			
		/*	for(int i = 0 ; i<buf.length; i++) {
				System.out.println("read"+buf[i]);
			}*/
			
			if(readLen == -1) //“더 이상 읽어 들일 데이터가 존재하지 않으면 -1을 반환합니다.”
				break;
			
			out.write(buf, 0, readLen);//0~1024까지의 바이트 만큼을 한번에 복사
			
			copyByte += readLen;	
		}

		in.close();//데이터를 읽어 들이는 과정이 끝났다면，생성했던 스트림은 소멸해야 한다. 그래야 가상머신이할당했던 각종 리소스들이 메모리상에서 지워지기 때문이다
		out.close();	
		
		System.out.println("복사된 바이트 크기 "+ copyByte);
	}
}