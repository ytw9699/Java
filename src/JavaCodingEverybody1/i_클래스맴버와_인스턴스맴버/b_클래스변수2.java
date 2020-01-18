package i_클래스맴버와_인스턴스맴버;
class Calculator2 {
    static double PI = 3.14;
    static int base = 0;
    //클래스(스테이틱) 변수인 base가 추가되었다.
    //static을 맴버(변수,메소드) 앞에 붙이면 클래스의 맴버가 된다. 
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
     public void sum() {
        // 더하기에 base의 값을 포함시킨다.
        System.out.println(this.left + this.right + base);
    }
     public void avg() {
        // 평균치에 base의 값을 포함시킨다.
        System.out.println((this.left + this.right + base) / 2);
    }
}
 public class b_클래스변수2 {
    public static void main(String[] args) {
        Calculator2 c1 = new Calculator2();
        c1.setOprands(10, 20);
        // 30 출력
        c1.sum();
 
        Calculator2 c2 = new Calculator2();
        c2.setOprands(20, 40);
        // 60 출력
        c2.sum();
        // 클래스 변수 base의 값을 10으로 지정했다. //공통의 값을 지정하는거야 결국
        Calculator2.base = 10;
        // 40 출력
        c1.sum();
        // 70 출력
        c2.sum();
     }
 }
 /*클래스 변수의 용도를 정리해보면 아래와 같다
 1.인스턴스에 따라서 변하지 않는 값이 필요한 경우 (위의 예에서는 PI)
 (이런 경우 final을 이용해서 상수로 선언하는 것이 바람직 하지만 final을 아직 배우지 않았기 때문에 언급하지 않았다)
 2.인스턴스를 생성할 필요가 없는 값을 클래스에 저장하고 싶은 경우
 3.값의 변경 사항을 모든 인스턴스가 공유해야 하는 경우*/