package p_다형성4;

class A{
    public String x(){return "A.x";}
}
class B extends A{
    public String x(){return "B.x";}//오버라이딩한 결과출력
    public String y(){return "y";}
}
class B2 extends A{
    public String x(){return "B2.x";}//오버라이딩한 결과출력
}
public class 다형성5 {
    public static void main(String[] args) {
        A obj = new B();
        A obj2 = new B2();
        System.out.println(obj.x());//오버라이딩한 결과출력
        System.out.println(obj2.x());//오버라이딩한 결과출력
        //하나의 클래스A를 상속 받는데 결과는 클래스마다 다르게 나옴 이게 다형성 다양한결과
    }
}