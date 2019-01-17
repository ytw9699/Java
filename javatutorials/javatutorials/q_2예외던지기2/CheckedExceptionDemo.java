package q_2예외던지기2;
import java.io.*;
public class CheckedExceptionDemo {
    public static void main(String[] args) {
        BufferedReader bReader=null;//전역변수로 선언해야 다른곳에서쓴다
        String input=null;//전역변수로 선언해야 다른곳에서쓴다
		try {
			bReader = new BufferedReader(new FileReader("out.txt"));
		} catch (FileNotFoundException e) {//예외를 강제해서 내가처리하는것
			e.printStackTrace();
		}
		try {
			input = bReader.readLine();
		} catch (IOException e) {//예외를 강제해서 내가처리하는것
			e.printStackTrace();
		}//파일에 있는걸 읽어들임
        System.out.println(input); 
    }
}