package k_��Ӱ�������2;

class Calculator2 {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator2 extends Calculator2 {//���ο� Ŭ��������
	//�׸��� Calculator Ŭ������ Ȯ���Ѵ� �� ��ӹ޴´�
    public void substract() {
        System.out.println(this.left - this.right);//Calculator�� �������� �������°�
    }
}
public class a_�������� {
    public static void main(String[] args) {
 
        SubstractionableCalculator2 c1 = new SubstractionableCalculator2();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}