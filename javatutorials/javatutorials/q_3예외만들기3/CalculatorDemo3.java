package q_3���ܸ����3;
//���ܸ� ������ �����°��̴� �ڹٰ� ����ֱ�����
class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        if(right == 0){
            throw new IllegalArgumentException();
            //IllegalArgumentException������������ ���ڰ����ö� ����
        }
        this.left = left;
        this.right = right;
    }
    public void divide(){
        try {
            System.out.print("������� ");
            System.out.print(this.left/this.right);
            System.out.print(" �Դϴ�.");
        } catch(Exception e){
        	System.out.print("\n�ι�° ���� ���");
            e.printStackTrace();
        }
    }
} 
public class CalculatorDemo3 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        try{c1.setOprands(10, 0);
        }catch(IllegalArgumentException e){
        	   System.out.print("ù���� ���: �ι�° ������ ���� 0�� �� �� �����ϴ�\n");
        }  
        c1.divide();
    }
}