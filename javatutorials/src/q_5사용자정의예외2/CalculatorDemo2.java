package q_5��������ǿ���2;
//���� DivideException�̶�� �̸���� ������
class DivideException extends Exception {
	//��ӹ޴� ����Ŭ������ üũƮ �̼����̶� trycatch�� throws�� ����ؼ� ���ܸ� ó�� �ؾ���
  /*  DivideException(){//��� �⺻������ ��� �������  �ؿ��� ��ü�� ���鶧 �����ڿ� �Ű�����������ֱ⶧��
        super();
    }*/
    DivideException(String message){
        super(message);//�θ�Ŭ���� ������ȣ�� �ϸ鼭 message�� �Ű������� ����
    }
}
class Calculator{
    int left, right;
    public void setOprands(int left, int right){        
        this.left = left;
        this.right = right;
    }
    public void divide(){//throws DivideException���� �Ѱܹ����ų� �Ʒ�ó���ϸ��
        if(this.right == 0){
            try {
				throw new DivideException("0���� ������ ���� ������ �ʽ��ϴ�.");
			} catch (DivideException e) {
				e.printStackTrace();
			}
        }
        System.out.print(this.left/this.right);
    }
}
public class CalculatorDemo2 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
    }
}