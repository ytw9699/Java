package o_인터페이스;
//다음 코드는 인터페이스에 따라서 구현된 클래스이다.
class e_Calculator implements c_Calculatable {
    int first, second, third;
    public void setOprands(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public int sum() {
        return this.first + this.second + this.third;
    }
    public int avg() {
        return (this.first + this.second + this.third) / 3;
    }
}
////이제 해야 할 일은 가짜 클래스인 CalculatorDummy를 실제 로직으로 교체하면 된다.
/*public class f_CalculatorConsumer {
    public static void main(String[] args) {
        e_Calculator c = new e_Calculator();
        c.setOprands(10, 20, 30);
        System.out.println(c.sum()+c.avg());
    }
}*/