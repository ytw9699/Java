package q_1���ܹ���2;

class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
        try {
            System.out.print("������� ");
            System.out.print(this.left/this.right);
            System.out.print(" �Դϴ�.");
        } catch(Exception e){
            System.out.println("\ne.getMessage()\n"+e.getMessage());
            //���������� ���� ������ �⺻�� ���� ����by zero
            System.out.println("\ne.toString()\n"+e.toString());
            //� ��������: java.lang.ArithmeticException: / by zero
            System.out.println("\ne.printStackTrace()");
            e.printStackTrace();//�޼ҵ� getMessage, toString���� �ٸ��� printStackTrace�� ���ϰ��� ����.
            //�� �޼ҵ带 ȣ���ϸ� �޼ҵ尡 ���������� ���� ����� ȭ�鿡 ����Ѵ�.
            //printStackTrace�� ���� �ڼ��� ���� ������ �����Ѵ�.
          /*  java.lang.ArithmeticException: / by zero
        	at q_����2.Calculator.divide(CalculatorDemo3.java:12)
        	at q_����2.CalculatorDemo3.main(CalculatorDemo3.java:26)*/
        }
        System.out.println("�̷��� �޼ҵ�ȳ����� ����ȴ� ����!");
    }
} 
public class CalculatorDemo3 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
    }
}