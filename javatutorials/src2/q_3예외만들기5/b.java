package q_3예외만들기5;
//https://docs.oracle.com/javase/7/docs/api/java/lang/ArithmeticException.html
public class b {
	//Class ArithmeticException의  상속관계를 보여줌
/*	java.lang.Object //모든 클래스의 부모
	java.lang.Throwable//그 위 부모
	java.lang.Exception//그 위 부모
	java.lang.RuntimeException//ArithmeticException의 부모
	java.lang.ArithmeticException,IllegalArgumentException,IndexOutOfBoundsException이렇게
	java.lang.ArrayIndexOutOfBoundsException은 IndexOutOfBoundsException의 자식
 
	================================================================
	//Throwable은 던지는것이 가능한이란뜻!
	이 Throwable클래스에 getmessage메소드, printstacktrace메소드
	//tostring 메소드가 있다  그래서 그아래 클래스에서 쓸수있는거
	 * 그리고 던질수도있는거임 부모클래스를 상속받으니까 
	 * 부모중에 RuntimeException이 있으면 unchecked이셉션이라함-
	 *  trycatch나 throws를 사용해서 예외를 처리 안해도됨
	*/
	//https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html
}//우리가 지금까지 사용했던 getMessage, printStackTrace, 
///toString이 Throwable 클래스에서 정의 되어 있었던 것이다! 또 이 클래스의 이름이 Throwable이다.
//'던질 수 있는'이라는 뜻이다. 즉 예외로 '던질 수 있는'
//클래스는 반드시 Throwable 클래스를 상속 받아야 한다.
//================================================================================================================================
/*
 * //Class IOException의  상속관계를 보여줌
java.lang.Object //모든 클래스의 부모
java.lang.Throwable//그 위 부모
java.lang.Exception//IOException 의 부모
java.lang.IOException//FileNotFoundException의 부모
java.io.FileNotFoundException
 
부모중에 RuntimeException이 없으면 checked이셉션이라함!!!!!!!!!!!!이게 너무중요 
부모중에 RuntimeException이 있냐없냐이차이
 checked는 반드시  trycatch나 throws를 사용해서 예외를 처리해야함,아니면 던지기
*/
