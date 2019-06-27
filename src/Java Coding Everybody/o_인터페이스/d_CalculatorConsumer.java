package o_인터페이스;
//다음은 인터페이스를 구현한 가짜 클래스를 임시로 사용해서 만든 에플리케이션이다.
class CalculatorDummy2 implements c_Calculatable{
    public void setOprands(int first, int second, int third){
    }
    public int sum(){
        return 60;
    }
    public int avg(){
        return 20;
    }
}
public class d_CalculatorConsumer {
    public static void main(String[] args) {
        CalculatorDummy2 c = new CalculatorDummy2();
        c.setOprands(10, 20, 30);
        System.out.println(c.sum()+c.avg());
    }
}