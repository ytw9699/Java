package p_다형성;

class A{}
class B extends A{}
public class 다형성2클래스 {
    public static void main(String[] args) {
        A obj = new B();
        //B obj2 = new B();
    }
}
//클래스 B의 데이터 형이 클래스 A이다. 클래스 B는 클래스 A를 상속하고 있다.
//이런 경우에 클래스 B는 클래스 A를 데이터 형으로 삼을 수 있다. 