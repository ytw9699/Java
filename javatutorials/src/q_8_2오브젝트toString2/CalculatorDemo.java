package q_8_2������ƮtoString2;

class Calculator{
   int left, right;
     
   public void setOprands(int left, int right){
       this.left = left;
       this.right = right;
   }
   public String toString(){//������Ʈ Ŭ������ ��ӹ����� �������̵�
       return super.toString()+"left : " + this.left + ", right : "+ this.right;
   }
}
public class CalculatorDemo {
     
   public static void main(String[] args) {
         
       Calculator c1 = new Calculator();
       c1.setOprands(10, 20);
       System.out.println(c1);
       System.out.println(c1.toString());
   }
}