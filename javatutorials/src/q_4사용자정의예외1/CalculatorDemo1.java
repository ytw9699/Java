package q_4��������ǿ���1;
//���� DivideException�̶�� �̸���� ������
class DivideException extends RuntimeException {
	//��ӹ޴� ����Ŭ������ ��Ÿ���̼���Ŭ������°��� 
	// ��üũƮ �̼����̶� ���� 
 //trycatch�� throws�� ����ؼ� ���ܸ� ó�� ���ص���
    DivideException(){// �ؿ� �Ű������� ������ ���� �⺻ ������ �������
        super();//�̰� �θ�Ŭ���� ������ȣ��
    }
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
    public void divide(){
        if(this.right == 0){
            throw new DivideException("0���� ������ ���� ������ �ʽ��ϴ�.");//�̰Ǳ׳� ���ܸ��߻���Ű�� �����Ǿƴ�!
        }
        System.out.print(this.left/this.right);
    }
}
public class CalculatorDemo1 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
    }
}