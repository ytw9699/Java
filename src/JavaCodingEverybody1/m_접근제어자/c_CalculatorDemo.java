package m_접근제어자;

class Calculator{
    private int left, right;//기존과 차이점  private을 붙임
     
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    private int _sum(){//기존과 차이점 private을 붙임
        return this.left+this.right;
    }
    public void sumDecoPlus(){
        System.out.println("++++"+_sum()+"++++"); //기존과 차이점
    }
    public void sumDecoMinus(){
        System.out.println("----"+_sum()+"----");//기존과 차이점
    }
}
public class c_CalculatorDemo {
    public static void main(String[] args) {        
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sumDecoPlus();//기존과 차이점 sum메소드를 바로접근못함
        c1.sumDecoMinus();//기존과 차이점 sum메소드를 바로접근못함
    }
}