package q_8_1오브젝트toString;

class Calculator {//extends Object{ 와 같은거
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
   System.out.println(c1);//여기선 .toString()이 생략된거임
   System.out.println(c1.toString());//결과가같다 //객체를 문자열로 표시해주는//문자화 
 //오브젝트 클래스를 상속받기에 toString()메소드도 쓸수있는거
   }//q_오브젝트toString.Calculator@7852e922
   //q_오브젝트toString.Calculator는 어디 클래스인지경로를 나타내고 그이후는 인스턴스의 이름
}