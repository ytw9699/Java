package j_��ȿ����;

class Calculator{
    int left, right;
   /* public void setOprands(int left, int right){
        this.left = left; //this�� c1�� �ν��Ͻ��� ����Ű�°�,�ν��Ͻ� �ڽ�//�ᱹ ���������ΰǵ�
        this.right = right;
    }*/
    public void setOprands(int _left, int _right){
        left = _left; //���⼭ left�� ���������ΰŴ�!�ֳĸ� �޼ҵ�ȿ� ���������� ��������ʾұ⶧����!
        right = _right;
        //�̷��� ���������� ���� Ű���ڶ�� �ǹ̿��� ����
    }
    //�� �ΰ��� �޼ҵ� ó�� �ΰ����� ������ִ°Ŵ�
    public void sum(){
        System.out.println(this.left+this.right);
    }
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}
public class f_this����ȿ���� {
    public static void main(String[] args) {
     
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();       
        Calculator c2 = new Calculator();
        c2.setOprands(20, 40);
        c2.sum();       
        c2.avg();
    }
}