package k_overriding2;
class Calculator2 {
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
    /*public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
 overriding�� �ϱ� ���ؼ��� �޼ҵ��� ���� ������ ���ƾ� �Ѵ�. 
�� Ŭ���� Calculator�� �޼ҵ� avg�� ���� Ÿ���� void�̴�. 
�׷��� �̰��� ����� Ŭ���� SubstractionableCalculator�� avg�޼ҵ��� ���� Ÿ���� int�̴�.
 �������̵��� �ϱ� ���ؼ��� �Ʒ��� ������ �������Ѿ� �Ѵ�.
1.�޼ҵ��� �̸�
2.�޼ҵ� �Ű������� ������ ������ Ÿ�� �׸��� 3.����
4.�޼ҵ��� ���� Ÿ��
������ ���������ڴ� �θ� ������Ƽ��� �ڽ��� �ۺ����� �ٲܼ����� ������ �ݴ�� �ȵ�
���� ���� �޼ҵ��� ���¸� �����ϴ� ���׵��� ���о �޼ҵ��� ����(signature)��� �Ѵ�.*/
}
class SubstractionableCalculator2 extends Calculator2 {
     
    public void sum() {
        System.out.println("���� ����� " +(this.left + this.right)+"�Դϴ�.");
    }
     
    public int avg() {
        return (this.left + this.right)/2;//���� �ߺ�
    }
     
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 public class b_�������̵� {
    public static void main(String[] args) {
        SubstractionableCalculator2 c1 = new SubstractionableCalculator2();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}