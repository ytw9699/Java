package k_overriding2;
class Calculator2 {
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
    /*public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
 overriding을 하기 위해서는 메소드의 리턴 형식이 같아야 한다. 
즉 클래스 Calculator의 메소드 avg는 리턴 타입이 void이다. 
그런데 이것을 상속한 클래스 SubstractionableCalculator의 avg메소드의 리턴 타입은 int이다.
 오버라이딩을 하기 위해서는 아래의 조건을 충족시켜야 한다.
1.메소드의 이름
2.메소드 매개변수의 갯수와 데이터 타입 그리고 3.순서
4.메소드의 리턴 타입
하지만 접근제어자는 부모가 프로텍티드면 자식은 퍼블릭으로 바꿀수있음 하지만 반대는 안됨
위와 같이 메소드의 형태를 정의하는 사항들을 통털어서 메소드의 서명(signature)라고 한다.*/
}
class SubstractionableCalculator2 extends Calculator2 {
     
    public void sum() {
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }
     
    public int avg() {
        return (this.left + this.right)/2;//로직 중복
    }
     
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 public class b_오버라이딩 {
    public static void main(String[] args) {
        SubstractionableCalculator2 c1 = new SubstractionableCalculator2();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}