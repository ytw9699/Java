package q_1���ܹ���1;
//������ ó���ϴ°��� ���ܶ�� �ϴ� ����
class Calculator2{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    } 
    public void divide(){
    	try {//������� ������ �߻��߽��ϴ� : / by zero
    		//try�ȿ��� ������ �߻��� ����Ǵ� ������ ��ġ
        System.out.print("������� ");
        System.out.print(this.left/this.right);
        System.out.print(" �Դϴ�.");
    	}catch(Exception e){//���ܰ� try�ȿ��� ������ �� ������ ���������� ����ִ� ��ü�� �Ű����� e��������! 
    		//�� ��ü�� ������Ÿ���� exception�̶�� Ŭ����
    		//catch�ȿ��� ���ܰ��߻������� ����Ǵ� ������ ����
    		System.out.println("������ �߻��߽��ϴ� : "+e.getMessage());//�̼��� �ȿ� �ٸ޼ҵ� ȣ���ϸ�
    		//������ ���� ���� ���� : /by zero
    	}// Exception�� �ڹٿ��� �⺻������ �����ϴ� Ŭ������ java.lang�� �Ҽ�
    }
} 
public class CalculatorDemo2 {
    public static void main(String[] args) {
        Calculator2 c1 = new Calculator2();
        c1.setOprands(10, 0);
        c1.divide();
    }
}
//������� Exception in thread "main" java.lang.ArithmeticException: / by zero
												//�������� ���ܹ߻�