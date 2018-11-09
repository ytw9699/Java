package q_3���ܸ����4;
import java.io.IOException;
//���ܸ� ������ �����°��̴� �ڹٰ� ����ֱ�����
class Calculator{
    int left, right;
    public void setOprands(int left, int right){
      
        this.left = left;
        this.right = right;
    }
    public void divide(){
    	if(this.right == 0){
            throw new ArithmeticException("0���� ������ ���� ������ �ʽ��ϴ�..");
        }
        try {
            System.out.print("������� ");
            System.out.print(this.left/this.right);
            System.out.print(" �Դϴ�.");
        } catch(Exception e){
            e.printStackTrace();
        }
    }
} 
public class CalculatorDemo4 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        try{  c1.divide();//���⼭ �����Ҷ� ����ִ°Ŷ� �ι�°���ܴ� �߻�����
        }
        catch(ArithmeticException e){
        	   e.printStackTrace();
        } 
        catch(Exception e){
     	   e.printStackTrace();
     } 
    }
}
/*����	����ؾ� �� ��Ȳ
IllegalArgumentException �������� ���� ���� �Ű������� �ǵ����� ���� ��Ȳ�� ���߽�ų ��
IllegalStateException	�޼ҵ带 ȣ���ϱ� ���� ���°� �ƴ� ��,�޼ҵ尡 �����Ҽ��ִ� ��Ȳ�� �����ȉ�����
NullPointerException	�Ű� ���� ���� null �� ��
IndexOutOfBoundsException	�ε��� �Ű� ���� ���� ������ ��� ��
ArithmeticException	������� ���꿡 ������ ���� ��*/