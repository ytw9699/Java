package l_overloading��Ģ;
//��ӹ�����!! �����ε��� �������̵��� ����
public class OverloadingDemo2 extends OverloadingDemo{
    void A (String arg1, String arg2){//�����ε�!//�̷��� �Ű����� ������ ������ ����Ŭ����������
    System.out.println("sub class : void A (String arg1, String arg2)");
    }
    void A (){//�ñ״�ó�� �������� �������̵�! ������!��ӹ����� ������
    System.out.println("sub class : void A ()");
    }
    public static void main(String[] args) {
        OverloadingDemo2 od = new OverloadingDemo2();
        od.A();
        od.A(1);
        od.A("coding everybody");
        od.A("coding everybody", "coding everybody");
        //riding(�ö�ź��)�� �̿��ؼ� �θ� Ŭ������ �޼ҵ��� ���۹���� �����ϰ�,
        //loading�� �̿��ؼ� ���� �̸�, �ٸ� �Ű������� �޼ҵ���� ������ ���� �� �ִٴ� ����� �ƴ� ���� �߿��ϴ�. 
    }
}