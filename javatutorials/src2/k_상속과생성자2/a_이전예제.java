package k_상속과생성자2;

class Calculator2 {
    int left, right;
 
    public void setOprands(int left, int right) {
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
 
class SubstractionableCalculator2 extends Calculator2 {//새로운 클래스만듬
	//그리고 Calculator 클래스를 확장한다 즉 상속받는다
    public void substract() {
        System.out.println(this.left - this.right);//Calculator의 변수값을 가져오는것
    }
}
public class a_이전예제 {
    public static void main(String[] args) {
 
        SubstractionableCalculator2 c1 = new SubstractionableCalculator2();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}