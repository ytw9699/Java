package q_1예외문법1;
//오류를 처리하는것이 예외라고 일단 생각
class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    } 
    public void divide(){
        System.out.print("계산결과는 ");
        System.out.print(this.left/this.right);
        System.out.print(" 입니다.");
    }
} 
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
    }
}
//계산결과는 Exception in thread "main" java.lang.ArithmeticException: / by zero
												//수학적인 예외발생