package k_overriding3;
class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public int avg() {
        return ((this.left + this.right) / 2);
    }
}
class SubstractionableCalculator extends Calculator {
     
    public void sum() {//�������̵�
        System.out.println("���� ����� " +(this.left + this.right)+"�Դϴ�.");
    }
     
    public int avg() {//�������̵�
        return super.avg();//super.avg()�� �ϸ� ����Ŭ������ avg�޼ҵ带 �����Ѱ��̵��´�
        //�� ���ϵȰ��� ���⼭ �ٽø����Ѵ�
    }
     
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
public class c_�������̵� {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        System.out.println("���� �����" + c1.avg());
        c1.substract();
    }
}