package q_1���ܹ���1;
//������ ó���ϴ°��� ���ܶ�� �ϴ� ����
class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    } 
    public void divide(){
        System.out.print("������� ");
        System.out.print(this.left/this.right);
        System.out.print(" �Դϴ�.");
    }
} 
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
    }
}
//������� Exception in thread "main" java.lang.ArithmeticException: / by zero
												//�������� ���ܹ߻�