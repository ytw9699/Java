package q_8_1������ƮtoString;

class Calculator {//extends Object{ �� ������
   int left, right;
     
   public void setOprands(int left, int right){
       this.left = left;
       this.right = right;
   }
   public void sum(){
       System.out.println(this.left+this.right);
   }
     
   public void avg(){
       System.out.println((this.left+this.right)/2);
   }
}
 
public class CalculatorDemo {
     
   public static void main(String[] args) {
         
   Calculator c1 = new Calculator();
   c1.setOprands(10, 20);
   System.out.println(c1);//���⼱ .toString()�� �����Ȱ���
   System.out.println(c1.toString());//��������� //��ü�� ���ڿ��� ǥ�����ִ�//����ȭ 
 //������Ʈ Ŭ������ ��ӹޱ⿡ toString()�޼ҵ嵵 �����ִ°�
   }//q_������ƮtoString.Calculator@7852e922
   //q_������ƮtoString.Calculator�� ��� Ŭ����������θ� ��Ÿ���� �����Ĵ� �ν��Ͻ��� �̸�
}