package o_�������̽�;

class CalculatorDummy{
    public void setOprands(int first, int second, int third){}
    //����ڰ� ���ڰ��� 3��������µ�
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