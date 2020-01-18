package i_클래스맴버와_인스턴스맴버;
//맴버(member)는 영어로 구성원이라는 뜻이다. 객체도 구성원이 있는데 아래와 같다.
//필드는 변수라는말
//객체의 구성원: 변수, 메소드
//클래스의 구성원 : 변수, 메소드
class Calculator {
    static double PI = 3.14;//원주율은 모든객체(인스턴스)가 똑같은 값을가지면됨
    //클래스의 변수는 모든 인스턴스가 공통적으로 같은 값을 가질수 있게 한다
    //static이붙으면 스테이틱변수는 클래스의 소속이된다 그러면 모든 인스턴스에서 동일한값이됨
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
public class a_클래스변수1 {
	 
    public static void main(String[] args) {
 
        Calculator c1 = new Calculator();
        System.out.println(c1.PI); //인스턴스를 통해 클래스 변수에대한 접근 1
 
        Calculator c2 = new Calculator();
        System.out.println(c2.PI); //인스턴스를 통해 클래스 변수에대한 접근 2
 
        System.out.println(Calculator.PI); //클래스를 통해 클래스 변수에 대한 접근 3
   //원주율만 필요할 때 클래스에 직접 접근하기 때문에 인스턴스를 생성할 필요가 없어진다.
   }
}
