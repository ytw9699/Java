package n_abstract�߻�ȭ;
/*abstract�� �ѱ���δ� �߻����� �����ȴ�. 
����� �����ϴ� ������ ������� ��������. 
�� Ŭ������ �޼ҵ带 ����ϱ� ���ؼ��� �ݵ��
����ؼ� ����ϵ��� �����ϴ� ���� abstract��.
�׸��� �߻�޼ҵ带 �ݵ�� �������̵� �ؾ���
*/
abstract class A{
    public abstract int b();
    //�߻� �޼ҵ�� �޼ҵ��� �ñ״�ó���� ���ǵ� ����ִ� �޼ҵ带 �ǹ��Ѵ�. 
    //�� �޼ҵ��� ��ü���� ������ ���� Ŭ�������� �������̵� �ؾ� �Ѵٴ� �ǹ̴�.
    //�߻� �޼ҵ带 �ϳ��� �����ϰ� �ִ� Ŭ������ �߻� Ŭ������ �ǰ�, 
    //�ڿ������� Ŭ������ �̸� �տ� abstract�� �ٴ´�
    //public abstract int c(){System.out.println("Hello")}
    //��ü�� �ִ� �޼ҵ�� abstract Ű���带 ���� �� ����.
    public void d(){ //�߻� Ŭ���� ������ �߻� �޼ҵ尡 �ƴ� �޼ҵ尡 ���� �� �� �ִ�. 
        System.out.println("world");
    }
}
class B extends A{//1.Ŭ���� B�� Ŭ���� A�� �ݵ��! ����ߴ�.����� �ϳ��� ����!
	//�׸��� 2.Ŭ���� A�� �߻� �޼ҵ��� �޼ҵ� b�� �ݵ�� �������̵��ϰ� �ִ�. 
	//�� ��� Ŭ���� A�� ����� �� �־���.
    public int b(){
    return 1;
 }
}
public class AbstractDemo {
    public static void main(String[] args) {
    	B obj = new B();
        System.out.println(obj.b());
    }
}