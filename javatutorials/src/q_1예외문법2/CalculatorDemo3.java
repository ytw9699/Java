package q_1예외문법2;

class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);
            System.out.print(" 입니다.");
        } catch(Exception e){
            System.out.println("\ne.getMessage()\n"+e.getMessage());
            //오류에대한 가장 간단한 기본적 원인 정보by zero
            System.out.println("\ne.toString()\n"+e.toString());
            //어떤 예외인지: java.lang.ArithmeticException: / by zero
            System.out.println("\ne.printStackTrace()");
            e.printStackTrace();//메소드 getMessage, toString과는 다르게 printStackTrace는 리턴값이 없다.
            //이 메소드를 호출하면 메소드가 내부적으로 예외 결과를 화면에 출력한다.
            //printStackTrace는 가장 자세한 예외 정보를 제공한다.
          /*  java.lang.ArithmeticException: / by zero
        	at q_예외2.Calculator.divide(CalculatorDemo3.java:12)
        	at q_예외2.CalculatorDemo3.main(CalculatorDemo3.java:26)*/
        }
        System.out.println("이렇게 메소드안끝가지 실행된다 주의!");
    }
} 
public class CalculatorDemo3 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
    }
}