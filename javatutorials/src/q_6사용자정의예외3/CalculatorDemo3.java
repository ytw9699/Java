package q_6��������ǿ���3;
//���� DivideException�̶�� �̸���� ������
class DivideException extends Exception {
	public int left;
	public int right;
    DivideException(String message){
        super(message);
    }
    DivideException(String message, int left, int right){//�̷��� �߰����� ������ �ش�
    	super(message);
    	this.left= left;
    	this.right= right;
    }
}
class Calculator{
    int left, right;
    public void setOprands(int left, int right){        
        this.left = left;
        this.right = right;
    }
    public void divide()throws DivideException{//2.���⼭ �߻��� ���ܸ� ������
        if(this.right == 0){
        throw new DivideException("0���� �����������ϴ�.",this.left,this.right);//1.
        //�̷��� �߰����� ������ �ش�
        }
        System.out.print(this.left/this.right);//�߻����ϸ� �̰Խ���Ǵµ�
    }
}
public class CalculatorDemo3 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        try {
			c1.divide();//3.���⼭�����°���
		} catch (DivideException e) {
			e.printStackTrace();
			 System.out.print(e.left);//�̷��� �߰����� ������ �ش�
			 System.out.print("/");//�̷��� �߰����� ������ �ش�
			 System.out.print(e.right);//�̷��� �߰����� ������ �ش�
		}
    }
}