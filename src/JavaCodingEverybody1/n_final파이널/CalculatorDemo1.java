package n_final파이널;
//추상이 상속을 강제하는 것이라면 final은 상속/변경을 금지하는 규제다. 
//파이널은 실행되는 과정에서 한번 값이 정해진 이후에는 변수 내의 값이 바뀌지 않도록 하는 규제다.

class Calculator {
	
    static final double PI = 3.14;//주목할 점은 변수 앞에 final이 붙어있다는 점이다
    //final로 지정된 변수에는 한번 값이 할당되면 그 값을 바꿀 수 없기 때문이다.
    //이러한 특징은 클래스 변수의 예를 들었지만 인스턴스 변수에도 적용된다.
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        //Calculator.PI = 6;//못바꿈
    }
    
    public void sum() {
        System.out.println(this.left + this.right);
    }
    
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

public class CalculatorDemo1 {
 
    public static void main(String[] args) {
 
        Calculator c1 = new Calculator();
        System.out.println(c1.PI);
        //Calculator.PI = 10;//못바꿈
    }
 }