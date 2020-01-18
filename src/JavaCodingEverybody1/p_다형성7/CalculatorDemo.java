package p_다형성7;

abstract class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    } 
    int _sum() {
        return this.left + this.right;
    }
    public abstract void sum();  
    public abstract void avg();
    public void run(){
        sum();
        avg();
    }
}
class CalculatorDecoPlus extends Calculator {
    public void sum(){
        System.out.println("+ sum :"+_sum());
    }
    public void avg(){
        System.out.println("+ avg :"+(this.left+this.right)/2);
    }
} 
class CalculatorDecoMinus extends Calculator {
    public void sum(){
        System.out.println("- sum :"+_sum());
    }
    public void avg(){
        System.out.println("- avg :"+(this.left+this.right)/2);
    }
} 
public class CalculatorDemo {
    public static void execute(Calculator cal){//다형성개념으로 받음 //바뀐부분 코드를 줄임
        System.out.println("실행결과");
        cal.run();
    }
    public static void main(String[] args) { 
        Calculator c1 = new CalculatorDecoPlus();//다형성
        c1.setOprands(10, 20);
         
        Calculator c2 = new CalculatorDecoMinus();//다형성
        c2.setOprands(10, 20);
         
        execute(c1);//다형성
        execute(c2);//다형성
    }
}