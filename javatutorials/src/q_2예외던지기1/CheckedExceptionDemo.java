package q_2���ܴ�����1;
import java.io.*;
public class CheckedExceptionDemo {
   /* public static void main(String[] args) {
        BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
        String input = bReader.readLine();
        System.out.println(input); 
    }*/
}
/*Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	Unhandled exception type FileNotFoundException
	Unhandled exception type IOException*/

/*Throws�� �ѱ���δ� '������'�� �����ȴ�. 
���� ������ ������ FileReader�� ���� fileName�� 
���� �ش��ϴ� ������ ���丮�̰ų� � ������ ����� �� ���ٸ�
FileNotFoundException�� �߻���Ų�ٴ� �ǹ̴�.
�̰��� FileReader�� �����ڰ� ������ �� ������ �� �� ���� ��찡 ���� �� �ְ�, 
�̷� ��� ������ FileReader������ �� ������ ó���� �� ���� ������ �̿� ����
ó���� �������� ����ڿ��� �����ϰڴٴ� �ǹ̴�. �װ��� ������(throw)�� ǥ���ϰ� �ִ�.
���� API�� ����� �ʿ����� ���ܿ� ���� ó���� �ݵ�� �ؾ� �Ѵٴ� �ǹ̴�. 
���� �Ʒ��� ���� �ؾ� FileReader Ŭ������ ����� �� �ִ�.*/