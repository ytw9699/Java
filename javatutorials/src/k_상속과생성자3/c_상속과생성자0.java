package k_��Ӱ�������3;
/*ù��°���
���� Ŭ������ ȣ��� �� �ڵ����� ���� Ŭ������ �⺻ �����ڸ� ȣ���ϰ� �ȴ�.
�׷��� ���� Ŭ������ �Ű������� �ִ� �����ڰ� �ִٸ� �ڹٴ� �ڵ����� ���� Ŭ������ �⺻ �����ڸ� ��������� �ʴ´�. 
���� �������� �ʴ� �����ڸ� ȣ���ϰ� �Ǳ� ������ ������ �߻��ߴ� �׷��Ƿ� �⺻�����ڸ� ������༭ ���� �ذ�*/
class Calculator {
   int left, right;
   /*  public void setOprands(int left, int right) {
   this.left = left;
   this.right = right;
}*/
   public Calculator(){}//�⺻�����ڰ� ���ٸ� ���� 
   	//�ؿ� �Ű����� �ִ� �����ڰ� �ֱ⿡ �ڵ����� �⺻������ �ȸ�����ش�//
  
   public Calculator(int left, int right){
	   //���Ӱ� �ٲ�κ� left�� right�� �޴� �Ű��������޴� ������ ������⶧����
	   //new SubstractionableCalculator(10, 20);
	   //�̰��� ���鶧 ����Ŭ������ Calculator�� �⺻�����ڸ� ȣ���ϴµ�
	   //�⺻�����ڸ� �� �����ڶ����� �ڵ����� ����������ʰ�
	   //ȣ���Ҽ����� ������ �߻��ϴ� ���Ͱ��� �⺻�����ڸ� ����������!
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
   public SubstractionableCalculator(int left, int right) {
       this.left = left;
       this.right = right;
   }
   public void substract() {
       System.out.println(this.left - this.right);
   }
}
public class c_��Ӱ�������0 {
   public static void main(String[] args) {
       SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
       c1.sum();
       c1.avg();
       c1.substract();
   }
}