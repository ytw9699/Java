package e_비교와Boolean;//문자열을 비교할때!!
public class d_equals비교연산자 {
//여기서 equals는 스트링 클래스의 equals메소드 이다
	public static void main(String[] args) {
		String a = "Hello world";
        String b = new String("Hello world");
        //변수 a와 b에 각각 문자열을 생성해서 저장했다. 
        //변수 b에 문자열을 만드는 방법은 생성자를 이용
        System.out.println(a == b);//false
        //==은 두개의 데이터 타입이 동일한 객체인지를 알아내기 위해서 사용하는 연산자이기 때문에
        //b에 담긴 객체와 일치하지 않는 것이다.이를 보완하는 비교 방법이 equals
        System.out.println(a.equals(b));//true
        //.equals는 문자열을 비교할 때 사용하는 메소드다. 
        System.out.println(b.equals(a));//true
        String c = "Hello world";
        String d = "Hello world";
        System.out.println(c == d);//true// 이렇게하면 투르네..
        System.out.println(c.equals(d));//true
        String e = new String("Hello world");
        String f = new String("Hello world");
        System.out.println(e == f);//false!!!
        //flase e과 f가 서로 다른 객체이기 때문이다
        System.out.println(e.equals(f));}//true//오브젝트에서는 이게 폴스가나옴
  // q_오브젝트equals1\ObjectDemo.java  참고 
/* 비교 연산자 == 은 원시 데이터형을 비교할 때만 사용하자.
 원시 데이터 형(Primitive Data Type)이란 자바에서 기본적으로 제공하는 데이터 타입으로
 byte, short, int, long, float, double, boolean, char가 있다. 
 이러한 데이터 타입들은 new 연산자를 이용해서 생성하지 않아도 사용될 수 있다는 특징이 있다.*/
}
