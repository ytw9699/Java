package i_Ŭ�����ɹ���_�ν��Ͻ��ɹ�;
//�ɹ�(member)�� ����� �������̶�� ���̴�. ��ü�� �������� �ִµ� �Ʒ��� ����.
//�ʵ�� ������¸�
//��ü�� ������: ����, �޼ҵ�
//Ŭ������ ������ : ����, �޼ҵ�
class Calculator {
    static double PI = 3.14;//�������� ��簴ü(�ν��Ͻ�)�� �Ȱ��� �����������
    //Ŭ������ ������ ��� �ν��Ͻ��� ���������� ���� ���� ������ �ְ� �Ѵ�
    //static�̺����� ������ƽ������ Ŭ������ �Ҽ��̵ȴ� �׷��� ��� �ν��Ͻ����� �����Ѱ��̵�
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public void sum() {
        System.out.println(this.left + this.right);
    }
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
public class a_Ŭ��������1 {
	 
    public static void main(String[] args) {
 
        Calculator c1 = new Calculator();
        System.out.println(c1.PI); //�ν��Ͻ��� ���� Ŭ���� ���������� ���� 1
 
        Calculator c2 = new Calculator();
        System.out.println(c2.PI); //�ν��Ͻ��� ���� Ŭ���� ���������� ���� 2
 
        System.out.println(Calculator.PI); //Ŭ������ ���� Ŭ���� ������ ���� ���� 3
   //�������� �ʿ��� �� Ŭ������ ���� �����ϱ� ������ �ν��Ͻ��� ������ �ʿ䰡 ��������.
   }
}
