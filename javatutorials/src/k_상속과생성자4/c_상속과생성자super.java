package k_��Ӱ�������4;

class Calculator {
   int left, right;
   /* public void setOprands(int left, int right) {
   this.left = left;
   this.right = right;
}*/
    
   //public Calculator(){}//������ ��� �������//���Ӱ� �ٲ�κ� 
  
   public Calculator(int left, int right){
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
class SubstractionableCalculator extends Calculator {
	public SubstractionableCalculator(int left, int right) {//2��°�����
		//�� ������ ������ ���� �ߺ��ȴٸ� �̰� ���ؼ� �ذ��ϴ� 2��°����� ������ super �θ� Ŭ������ �����ڸ� �ǹ�
		//super Ű����� �θ� Ŭ������ �ǹ��Ѵ�
		// ���⿡ ()���̸� �θ� Ŭ������ �����ڸ� �ǹ��ϰ� �ȴ�
	    super(left , right);//�θ�Ŭ���� �����ڿ��� ���⼭ �Ű������� left���� right���� �޾Ƽ�
	    //public Calculator(int left, int right) �������� �����ϴ°�
	    //�׷��� ���� �θ�Ŭ������ �⺻������ �ȸ�����൵ ���ڳ� �Ű������� ���̵��� �⺻������ �ȸ�����൵��
	    //�׸��� ����Ŭ������ �ʱ�ȭ�۾��� �ϰ������ 
	    //���� �θ�Ŭ������ �ʱ�ȭ�۾��� �����ϰ� �ؾ��Ѵ�
	}
   public void substract() {
       System.out.println(this.left - this.right);
   }
}
public class c_��Ӱ�������super {
   public static void main(String[] args) {
       SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
       c1.sum();
       c1.avg();
       c1.substract();
   }
}