package g_�Է°����;

import java.util.Scanner;
 
public class d_ScannerDemo2 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {//�̸޼ҵ� ����3����
        	//sc.hasNextInt()�̸޼ҵ� �����Ű�� 1.������ �ϴ� ���߰�
        	//2.����ڰ� �Է��Ѱ��� ���͸��ƴٸ�(�����̵��Դٸ� �ٽ� ����)
        	//3.����ڰ� �Է��� ���� int���� ������ ������ true,
        	// int�� ������ �ؿ� ���� �����ϰ�  �ٽ� �ݺ�
        	//�ƴϸ� false�����ϰ� sc.close�ΰ��ԵǼ� �����
            System.out.println(sc.nextInt()*1000); 
        }
        sc.close();
    }
 
}
