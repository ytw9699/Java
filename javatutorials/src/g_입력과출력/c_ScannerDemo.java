package g_�Է°����;

import java.util.Scanner;//��ĳ��Ŭ���� �ε��ؾ���//�ڹ� ��ƿ�̶�� ��Ű�����ִ�

public class c_ScannerDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//System.in�� ����ڰ� �Է��� �� InputStream
        //new Scanner(System.in)�� ��ü�� �����ϸ�
        //����ڰ� �Է��� ���� �˾Ƴ��� ������, �׸��� �� ��ü�� sc��� ������ ��´�
        //�׷��� �Է��� ���� �˾Ƴ��� ������ �ϴ� ��ü�� ������ �ؿ� ��ü�� �޼ҵ� ����
        int i = sc.nextInt(); //�� �޼ҵ�� ������ ���߰� ���� �Է��ϴ� ���� ��� ��ٸ��� ����
        //sc.nextInt()�� ����Ǹ� �ڹٴ� ������� �Է��� ���� ������ ���� 
        //i�� ���� �Ҵ����� �ʰ� �����¿� �ְ� �ȴ�.
        //�� ���¿��� ���͸� �����ָ� �� �޼ҵ尡 ����Ǽ� ���� i�� �����
        System.out.println(i*1000);
        sc.close();
    }
 }
