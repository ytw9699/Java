package q_3���ܸ����1;
//���ܸ� ������ �����°��̴� �ڹٰ� ����ֱ�����
class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        if(right == 0){
            throw new IllegalArgumentException("�ι�° ������ ���� 0�� �� �� �����ϴ�.");
            //IllegalArgumentException������������ ���ڰ����ö� ����
            //�̰Ŵ� �׳� ���ܸ� �߻���Ű�� ������ �ƴϾ� ���⼭ �߻���Ű�� ����//������������ �������
        }
        this.left = left;
        this.right = right;
    }
    public void divide(){
            System.out.print("������� ");
            System.out.print(this.left/this.right);
            System.out.print(" �Դϴ�.");
    }
} 
public class CalculatorDemo1 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
    }
}