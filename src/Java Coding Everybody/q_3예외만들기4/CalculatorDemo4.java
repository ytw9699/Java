package q_3예외만들기4;
import java.io.IOException;
//예외를 스스로 만들어보는것이다 자바가 잡아주기전에
class Calculator{
    int left, right;
    public void setOprands(int left, int right){
      
        this.left = left;
        this.right = right;
    }
    public void divide(){
    	if(this.right == 0){
            throw new ArithmeticException("0으로 나누는 것은 허용되지 않습니다..");
        }
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);
            System.out.print(" 입니다.");
        } catch(Exception e){
            e.printStackTrace();
        }
    }
} 
public class CalculatorDemo4 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        try{  c1.divide();//여기서 실행할때 잡아주는거라 두번째예외는 발생안함
        }
        catch(ArithmeticException e){
        	   e.printStackTrace();
        } 
        catch(Exception e){
     	   e.printStackTrace();
     } 
    }
}
/*예외	사용해야 할 상황
IllegalArgumentException 적합하지 않은 인자 매개변수가 의도하지 않은 상황을 유발시킬 때
IllegalStateException	메소드를 호출하기 위한 상태가 아닐 때,메소드가 동작할수있는 상황이 충족안瑛뻑?
NullPointerException	매개 변수 값이 null 일 때
IndexOutOfBoundsException	인덱스 매개 변수 값이 범위를 벗어날 때
ArithmeticException	산술적인 연산에 오류가 있을 때*/