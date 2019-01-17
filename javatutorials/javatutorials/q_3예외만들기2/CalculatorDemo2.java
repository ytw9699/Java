package q_3예외만들기2;
import java.io.IOException;
//예외를 스스로 만들어보는것이다 자바가 잡아주기전에
class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        if(right == 0){
            throw new IllegalArgumentException("두번째 인자의 값은 0이 될 수 없습니다");
            //IllegalArgumentException적합하지않은 인자가들어올때 예외
        }
        this.left = left;
        this.right = right;
    }
    public void divide(){
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);//다시예외발생
            System.out.print(" 입니다.");
      }
} 
public class CalculatorDemo2 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        try{
        	c1.setOprands(10, 0);
        }
        catch(IllegalArgumentException e){
        	//throw new IllegalArgumentException("두번째 인자의 값은 0이 될 수 없습니다");
        	//위에서 이 객체가 e로 들어옴
        	 e.printStackTrace();//예외를 잡아주기때문에
        }
        c1.divide();//이게 실행
    }
}