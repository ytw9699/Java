package q_2���ܴ�����2;
import java.io.*;
public class CheckedExceptionDemo {
    public static void main(String[] args) {
        BufferedReader bReader=null;//���������� �����ؾ� �ٸ�����������
        String input=null;//���������� �����ؾ� �ٸ�����������
		try {
			bReader = new BufferedReader(new FileReader("out.txt"));
		} catch (FileNotFoundException e) {//���ܸ� �����ؼ� ����ó���ϴ°�
			e.printStackTrace();
		}
		try {
			input = bReader.readLine();
		} catch (IOException e) {//���ܸ� �����ؼ� ����ó���ϴ°�
			e.printStackTrace();
		}//���Ͽ� �ִ°� �о����
        System.out.println(input); 
    }
}