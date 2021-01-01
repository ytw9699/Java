package k_상속과생성자3;
/*만약 매개변수를 가지는 생성자를 하나라도 정의했다면, 기본 생성자는 자동으로 추가되지 않는다.
따라서 매개변수를 가지는 생성자를 하나 이상 정의한 후 기본 생성자를 호출하면, 오류가 발생한다
그래서 수동적으로 기본 생성자를 만들어줘야한다.*/

/*첫번째방법
하위 클래스가 호출될 때 자동으로 상위 클래스의 기본 생성자를 호출하게 된다.
그런데 상위 클래스에 매개변수가 있는 생성자가 있다면 자바는 자동으로 상위 클래스의 기본 생성자를 만들어주지 않는다. 
따라서 존재하지 않는 생성자를 호출하게 되기 때문에 에러가 발생했다 그러므로 기본생성자를 만들어줘서 오류 해결*/

class Calculator {
	
   int left, right;
   /*  public void setOprands(int left, int right) {
   this.left = left;
   this.right = right;
}*/
   public Calculator(){}//기본생성자가 없다면 오류 
   	//밑에 매개변수 있는 생성자가 있기에 자동으로 기본생성자 안만들어준다//
  
   public Calculator(int left, int right){
	   //새롭게 바뀐부분 left와 right를 매개변수로 받는 생성자 만들었기때문에
	   //new SubstractionableCalculator(10, 20);
	   //이것을 만들때 상위클래스인 Calculator의 기본생성자를 호출하는데
	   //기본생성자를 이 생성자때문에 자동으로 만들어주지않고
	   //호출할 수 없어 오류가 발생하니 위와같이 기본생성자를 만들어줘야함!
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

public class c_상속과생성자0 {
	
   public static void main(String[] args) {
	   
       SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
       c1.sum();
       c1.avg();
       c1.substract();
   }
}