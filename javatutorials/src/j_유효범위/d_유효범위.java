package j_��ȿ����;

public class d_��ȿ���� {
	static int i = 5;//��������
	 
    static void a() {
        int i = 10;//��������
        b();
    }
 
    static void b() {
    	 int i = 20;//��������
        System.out.println(i);//�� i�� �� �޼ҵ���� ���������� ���� �켱������ �����´� ������������ 
    }
 
    public static void main(String[] args) {
        a();
    }
 
}
