package o_�������̽�;

class b_Calculator {
    int left, right;
    public void setOprands(int left, int right) {
    	//����ڶ� �޸� 2���� ���� ����ġ�ȴ�..
        this.left = left;
        this.right = right;
    }
    public void sum() {
        System.out.println(this.left + this.right);
    }
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}