package q_3예외만들기3;
//예외를 스스로 만들어보는것이다 자바가 잡아주기전에
class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        if(right == 0){
            throw new IllegalArgumentException();
            //IllegalArgumentException적합하지않은 인자가들어올때 예외
        }
        this.left = left;
        this.right = right;
    }
    public void divide(){
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);
            System.out.print(" 입니다.");
        } catch(Exception e){
        	System.out.print("\n두번째 예외 잡기");
            e.printStackTrace();
        }
    }
} 
public class CalculatorDemo3 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        try{c1.setOprands(10, 0);
        }catch(IllegalArgumentException e){
        	   System.out.print("첫예외 잡기: 두번째 인자의 값은 0이 될 수 없습니다\n");
        }  
        c1.divide();
    }
}