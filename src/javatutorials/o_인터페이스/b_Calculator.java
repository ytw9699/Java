package o_인터페이스;

class b_Calculator {
    int left, right;
    public void setOprands(int left, int right) {
    	//사용자랑 달리 2개만 만들어서 불일치된다..
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