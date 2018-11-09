package x_����1;
class A{
    public int id;//�ν��Ͻ� ����
    A(int id){//������
        this.id = id;
    }
}
public class b����_ReferenceDemo2 {
    public static void runValue(){
        int a = 1;
        //int�� �⺻ ��������(���� ��������, Primitive Data Types)�̴�. 
        int b = a; //����������
        b = 2;
        System.out.println("runValue, "+a); 
    }
    public static void runReference(){
        A a = new A(1);
        A b = a;//�̰��� �����̴�
        b.id = 2;//a��b�� ��䰪���� new A()��(����) ���� ���� �ν��Ͻ� �ּҰ�(������)�� ����ִ°Ŷ� �������̰� 
        //�� �ּҰ��� �����Ѱ��̱⶧���� �������� �ٲ�� �ȴ�
        //���� b�� ���� a�� ��� �ν��Ͻ��� ���� ���ٴ� ���� �ǹ��ϴ�
        //��ġ �ٷΰ��⸦ ����Ͱ� ��� �����ؽ�Ʈ������ �����ؼ� �ٷΰ���(symbolic link)�� �����
        //a��b���� new A(1)��(����)���� ���� �ν��Ͻ��� �ּҰ��� ����ִ°��̴�
        //new�� �̿��ؼ� ���� �ν��Ͻ��� ������Ÿ���� ������,�����ڷ���,�������������̶�θ���
        //new�� ����ؼ� ��ü�� ����� ��� ������ Ÿ���� ���� ���������̶�� �����ص� �ȴ�(�� String�� ���ܴ�) 
        System.out.println("runReference, "+a.id);      
        System.out.println("runReference, "+b.id);      
    }
    public static void main(String[] args) {
        runValue();
        runReference();
    } //�����ϸ� ������ ����ִ� �����Ͱ� �⺻���̸� �� �ȿ��� ���� �����Ͱ� ����ְ�, 
}   //�⺻���� �ƴϸ� ���� �ȿ��� �����Ϳ� ���� ���� ����� ����ִٰ� �� �� �ִ�.

