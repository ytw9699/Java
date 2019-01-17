package k_overriding3;
class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public int avg() {
        return ((this.left + this.right) / 2);
    }
}
class SubstractionableCalculator extends Calculator {
     
    public void sum() {//오버라이딩
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }
     
    public int avg() {//오버라이딩
        return super.avg();//super.avg()를 하면 상위클래스의 avg메소드를 리턴한값이들어온다
        //그 리턴된값을 여기서 다시리턴한다
    }
     
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
public class c_오버라이딩 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        System.out.println("실행 결과는" + c1.avg());
        c1.substract();
    }
}