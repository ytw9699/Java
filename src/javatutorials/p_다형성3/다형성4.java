package p_������3;

class A{
    public String x(){return "A.x";}
}
class B extends A{
    public String x(){return "B.x";}
    public String y(){return "y";}
}
public class ������4 {
    public static void main(String[] args) {
        A obj = new B();
        System.out.println(obj.x());//�������� "B.x" ���ȴ�!!
        //�������̵� �߱⶧����! �̰� ����ȴٴ°�
        B obj2 = new B();
        System.out.println(obj2.x());
    }
}