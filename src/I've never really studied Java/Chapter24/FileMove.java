﻿package Chapter24;
import java.io.File;

class FileMove
{
	public static void main(String[] args)
	{
		File myFile=new File("C:\\MyJava\\my.bin");
		if(myFile.exists()==false)
		{
			System.out.println("원본 파일이 준비되어 있지 않습니다.");
			return;
		}
		
		File reDir=new File("C:\\YourJava");
		reDir.mkdir();
		File reFile=new File(reDir, "my.bin");
		myFile.renameTo(reFile);
		if(reFile.exists()==true)
			System.out.println("파일 이동에 성공하였습니다.");
		else
			System.out.println("파일 이동에 실패하였습니다.");
	}
}