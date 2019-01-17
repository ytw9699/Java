package k_상속과생성자2;
class Calculator {
    int left, right;
  /*  public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }*/
    public void sum() {
        System.out.println(this.left + this.right);
    }
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {
    	//이게 생성될때 부모클래스의 기본생성자가 자동으로 만들어지고 호출된다
    	//생성자
    	//이전과 비교해 바뀐부분
        this.left = left;
        this.right = right;
    }
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
public class c_바뀐예제 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = 
       new SubstractionableCalculator(10, 20);//이전과 비교해 바뀐부분
        //c1.setOprands(10, 20);//사라짐//이전과 비교해 바뀐부분
        c1.sum();
        c1.avg();
        c1.substract();
    }
}