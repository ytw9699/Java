package q_3���ܸ����2;
import java.io.IOException;
//���ܸ� ������ �����°��̴� �ڹٰ� ����ֱ�����
class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        if(right == 0){
            throw new IllegalArgumentException("�ι�° ������ ���� 0�� �� �� �����ϴ�");
            //IllegalArgumentException������������ ���ڰ����ö� ����
        }
        this.left = left;
        this.right = right;
    }
    public void divide(){
            System.out.print("������� ");
            System.out.print(this.left/this.right);//�ٽÿ��ܹ߻�
            System.out.print(" �Դϴ�.");
      }
} 
public class CalculatorDemo2 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        try{
        	c1.setOprands(10, 0);
        }
        catch(IllegalArgumentException e){
        	//throw new IllegalArgumentException("�ι�° ������ ���� 0�� �� �� �����ϴ�");
        	//������ �� ��ü�� e�� ����
        	 e.printStackTrace();//���ܸ� ����ֱ⶧����
        }
        c1.divide();//�̰� ����
    }
}