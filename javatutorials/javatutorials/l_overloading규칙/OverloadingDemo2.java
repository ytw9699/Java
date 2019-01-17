package l_overloading규칙;
//상속받을때!! 오버로딩과 오버라이딩의 차이
public class OverloadingDemo2 extends OverloadingDemo{
    void A (String arg1, String arg2){//오버로딩!//이러한 매개변수 형식을 가진게 상위클래스에없음
    System.out.println("sub class : void A (String arg1, String arg2)");
    }
    void A (){//시그니처가 같은것을 오버라이딩! 재정의!상속받은거 재정의
    System.out.println("sub class : void A ()");
    }
    public static void main(String[] args) {
        OverloadingDemo2 od = new OverloadingDemo2();
        od.A();
        od.A(1);
        od.A("coding everybody");
        od.A("coding everybody", "coding everybody");
        //riding(올라탄다)을 이용해서 부모 클래스의 메소드의 동작방법을 변경하고,
        //loading을 이용해서 같은 이름, 다른 매개변수의 메소드들을 여러개 만들 수 있다는 사실을 아는 것이 중요하다. 
    }
}