package i_Ŭ�����ɹ���_�ν��Ͻ��ɹ�;
class Calculator2 {
    static double PI = 3.14;
    static int base = 0;
    //Ŭ����(������ƽ) ������ base�� �߰��Ǿ���.
    //static�� �ɹ�(����,�޼ҵ�) �տ� ���̸� Ŭ������ �ɹ��� �ȴ�. 
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
     public void sum() {
        // ���ϱ⿡ base�� ���� ���Խ�Ų��.
        System.out.println(this.left + this.right + base);
    }
     public void avg() {
        // ���ġ�� base�� ���� ���Խ�Ų��.
        System.out.println((this.left + this.right + base) / 2);
    }
}
 public class b_Ŭ��������2 {
    public static void main(String[] args) {
        Calculator2 c1 = new Calculator2();
        c1.setOprands(10, 20);
        // 30 ���
        c1.sum();
 
        Calculator2 c2 = new Calculator2();
        c2.setOprands(20, 40);
        // 60 ���
        c2.sum();
        // Ŭ���� ���� base�� ���� 10���� �����ߴ�. //������ ���� �����ϴ°ž� �ᱹ
        Calculator2.base = 10;
        // 40 ���
        c1.sum();
        // 70 ���
        c2.sum();
     }
 }
 /*Ŭ���� ������ �뵵�� �����غ��� �Ʒ��� ����
 1.�ν��Ͻ��� ���� ������ �ʴ� ���� �ʿ��� ��� (���� �������� PI)
 (�̷� ��� final�� �̿��ؼ� ����� �����ϴ� ���� �ٶ��� ������ final�� ���� ����� �ʾұ� ������ ������� �ʾҴ�)
 2.�ν��Ͻ��� ������ �ʿ䰡 ���� ���� Ŭ������ �����ϰ� ���� ���
 3.���� ���� ������ ��� �ν��Ͻ��� �����ؾ� �ϴ� ���*/