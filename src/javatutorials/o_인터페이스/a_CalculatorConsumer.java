package o_인터페이스;

class CalculatorDummy{
    public void setOprands(int first, int second, int third){}
    //사용자가 인자값을 3개만들었는데
    public int sum(){
        return 60;
    }
    public int avg(){
        return 20;
    }
}
public class a_CalculatorConsumer {
    public static void main(String[] args){
        CalculatorDummy c = new CalculatorDummy();
        c.setOprands(10,20,30);
        System.out.println(c.sum()+c.avg());
    }
}