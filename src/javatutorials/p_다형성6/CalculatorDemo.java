package p_다형성6;

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
    public static void execute(CalculatorDecoPlus cal){//이방식은 오버로딩으로 해결해서 비효율적
    	//다음예제에서 이 로직에 같은 부모이다는걸 이용해서 다형성 개념을 넣어보자
        System.out.println("실행결과1");
        cal.run();
    }
    public static void execute(CalculatorDecoMinus cal){//오버로딩으로해결
        System.out.println("실행결과2");
        cal.run();
    }
    public static void main(String[] args) { 
    	CalculatorDecoPlus c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);
         
        CalculatorDecoMinus c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);
         
        execute(c1);
        execute(c2);
    }
}