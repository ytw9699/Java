package o_�������̽�;
//���� �ڵ�� �������̽��� ���� ������ Ŭ�����̴�.
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
////���� �ؾ� �� ���� ��¥ Ŭ������ CalculatorDummy�� ���� �������� ��ü�ϸ� �ȴ�.
/*public class f_CalculatorConsumer {
    public static void main(String[] args) {
        e_Calculator c = new e_Calculator();
        c.setOprands(10, 20, 30);
        System.out.println(c.sum()+c.avg());
    }
}*/