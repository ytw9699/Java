package e_�񱳿�Boolean;//���ڿ��� ���Ҷ�!!
public class d_equals�񱳿����� {
//���⼭ equals�� ��Ʈ�� Ŭ������ equals�޼ҵ� �̴�
	public static void main(String[] args) {
		String a = "Hello world";
        String b = new String("Hello world");
        //���� a�� b�� ���� ���ڿ��� �����ؼ� �����ߴ�. 
        //���� b�� ���ڿ��� ����� ����� �����ڸ� �̿�
        System.out.println(a == b);//false
        //==�� �ΰ��� ������ Ÿ���� ������ ��ü������ �˾Ƴ��� ���ؼ� ����ϴ� �������̱� ������
        //b�� ��� ��ü�� ��ġ���� �ʴ� ���̴�.�̸� �����ϴ� �� ����� equals
        System.out.println(a.equals(b));//true
        //.equals�� ���ڿ��� ���� �� ����ϴ� �޼ҵ��. 
        System.out.println(b.equals(a));//true
        String c = "Hello world";
        String d = "Hello world";
        System.out.println(c == d);//true// �̷����ϸ� ������..
        System.out.println(c.equals(d));//true
        String e = new String("Hello world");
        String f = new String("Hello world");
        System.out.println(e == f);//false!!!
        //flase e�� f�� ���� �ٸ� ��ü�̱� �����̴�
        System.out.println(e.equals(f));}//true//������Ʈ������ �̰� ����������
  // q_������Ʈequals1\ObjectDemo.java  ���� 
/* �� ������ == �� ���� ���������� ���� ���� �������.
 ���� ������ ��(Primitive Data Type)�̶� �ڹٿ��� �⺻������ �����ϴ� ������ Ÿ������
 byte, short, int, long, float, double, boolean, char�� �ִ�. 
 �̷��� ������ Ÿ�Ե��� new �����ڸ� �̿��ؼ� �������� �ʾƵ� ���� �� �ִٴ� Ư¡�� �ִ�.*/
}
