package m_����������;

class Calculator{
    private int left, right;//������ ������  private�� ����
     
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    private int _sum(){//������ ������ private�� ����
        return this.left+this.right;
    }
    public void sumDecoPlus(){
        System.out.println("++++"+_sum()+"++++"); //������ ������
    }
    public void sumDecoMinus(){
        System.out.println("----"+_sum()+"----");//������ ������
    }
}
public class c_CalculatorDemo {
    public static void main(String[] args) {        
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sumDecoPlus();//������ ������ sum�޼ҵ带 �ٷ����ٸ���
        c1.sumDecoMinus();//������ ������ sum�޼ҵ带 �ٷ����ٸ���
    }
}