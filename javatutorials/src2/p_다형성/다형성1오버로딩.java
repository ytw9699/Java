package p_������;
/*������ ���� 1. �������� �پ��ϴٶ�� �����ؾ��� �پ��ϰԾ��ϼ��ִٶ�°����̾� 
 * �����ε� : �Ű����������� �ٸ� �޼ҵ尡 ȣ�� �޼ҵ忡���� ������*/
class O{
    public void a(int param){
        System.out.println("�������");
        System.out.println(param);
    }
    public void a(String param){
        System.out.println("�������");
        System.out.println(param);
    }
}
public class ������1�����ε� {
    public static void main(String[] args) {
        O o = new O();
        o.a(1);
        o.a("one");
    }
}
/*Ŭ���� O�� �޼ҵ� a�� �ΰ��� ��ü�� ������ �ִ�. ���ÿ� �ΰ��� ��ü�� �ϳ��� �̸��� a�� �����ϰ� �ִ�. 
���� �̸������� ���� �ٸ� ���� ����� ������ �ֱ� ������ �����ε��� �������� �� ����� �� �� �ִ�.*/