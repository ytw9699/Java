package n_final���̳�;
//�߻��� ����� �����ϴ� ���̶�� final�� ���/������ �����ϴ� ������. 
//�ʵ�� ������ ���� �ǹ��̴�
//���̳��� ����Ǵ� �������� �ѹ� ���� ������ ���Ŀ��� ���� ���� ���� �ٲ��� �ʵ��� �ϴ� ������.
class Calculator {
    static final double PI = 3.14;//�ָ��� ���� ���� �տ� final�� �پ��ִٴ� ���̴�
    //final�� ������ �������� �ѹ� ���� �Ҵ�Ǹ� �� ���� �ٲ� �� ���� �����̴�.
    //�̷��� Ư¡�� Ŭ���� ������ ���� ������� �ν��Ͻ� �������� ����ȴ�.
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        //Calculator.PI = 6;//���ٲ�
    }
    public void sum() {
        System.out.println(this.left + this.right);
    }
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
public class CalculatorDemo1 {
 
    public static void main(String[] args) {
 
        Calculator c1 = new Calculator();
        System.out.println(c1.PI);
        //Calculator.PI = 10;//���ٲ�
    }
 }