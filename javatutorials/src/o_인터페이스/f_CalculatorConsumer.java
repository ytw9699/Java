package o_�������̽�;
//���� �ؾ� �� ���� ��¥ Ŭ������ CalculatorDummy�� ���� �������� ��ü�ϸ� �ȴ�.
public class f_CalculatorConsumer {
    public static void main(String[] args) {
        e_Calculator c = new e_Calculator();
        c.setOprands(10, 20, 30);
        System.out.println(c.sum()+c.avg());
    }
}

/*�̷����ؼ� �������̽��� �̿��� ������ ���ؼ� �˾ƺô�. 
�������̽��� �̿��ؼ� ���ΰ� ������ �޼ҵ带 ���鵵�� �Ծ��� ���� ������ ��� ���ڰ�
����� �����̳� �����ϴ� ��Ŀ� �� ������ �����鼭 ���ø����̼��� ���� �� �� �־���.*/