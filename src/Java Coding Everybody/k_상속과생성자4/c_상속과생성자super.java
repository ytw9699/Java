package k_상속과생성자4;

class Calculator {
   int left, right;
   /* public void setOprands(int left, int right) {
   this.left = left;
   this.right = right;
}*/
    
   //public Calculator(){}//이제는 없어도 상관없다//새롭게 바뀐부분 
  
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
	public SubstractionableCalculator(int left, int right) {//2번째방법은
		//이 생성자 로직이 위와 중복된다면 이걸 통해서 해결하는 2번째방법은 다음장 super 부모 클래스의 생성자를 의미
		//super 키워드는 부모 클래스를 의미한다
		// 여기에 ()붙이면 부모 클래스의 생성자를 의미하게 된다
	    super(left , right);//부모클래스 생성자에게 여기서 매개변수로 left값과 right값을 받아서
	    //public Calculator(int left, int right) 이쪽으로 전달하는것
	    //그러면 굳이 부모클래스의 기본생성자 안만들어줘도 되자나 매개변수에 값이들어가면 기본생성자 안만들어줘도됨
	    //그리고 하위클래스에 초기화작업을 하고싶으면 
	    //먼저 부모클래스의 초기화작업을 먼저하고서 해야한다
	}
   public void substract() {
       System.out.println(this.left - this.right);
   }
}
public class c_상속과생성자super {
   public static void main(String[] args) {
       SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
       c1.sum();
       c1.avg();
       c1.substract();
   }
}