package k_��Ӱ�������2;
class Calculator {
    int left, right;
  /*  public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }*/
    public void sum() {
        System.out.println(this.left + this.right);
    }
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {
    	//�̰� �����ɶ� �θ�Ŭ������ �⺻�����ڰ� �ڵ����� ��������� ȣ��ȴ�
    	//������
    	//������ ���� �ٲ�κ�
        this.left = left;
        this.right = right;
    }
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
public class c_�ٲ￹�� {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = 
       new SubstractionableCalculator(10, 20);//������ ���� �ٲ�κ�
        //c1.setOprands(10, 20);//�����//������ ���� �ٲ�κ�
        c1.sum();
        c1.avg();
        c1.substract();
    }
}