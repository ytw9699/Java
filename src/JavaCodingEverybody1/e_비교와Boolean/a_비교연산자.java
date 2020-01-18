package e_비교와Boolean;
public class a_비교연산자 {
	public static void main(String[] args) {
		/*0.boolean은 참과 거짓을 의미하는 데이터 타입으로 bool이라고도 부른다.
		불린은 정수나 문자와 같이 하나의 데이터 타입인데, 
		참을 의미하는 true와 거짓을 의미하는 false 두 가지의 값을 가지고 있다.
		
		1.비교 연산자 (관계 연산자)
		
		프로그래밍에서 비교란
		주어진 값들이 같은지, 다른지, 큰지, 작은지를 구분하는 것을 의미한다. 
		이때 비교 연산자를 사용하는데
	  	비교 연산자의 결과는 true나 false 중의 하나다. 
		true는 비교 결과가 참이라는 의미이고, false는 거짓이라는 뜻이다. */

		System.out.println(1==2); //동등비교연산자          //false
        System.out.println(1==1);      //동등비교연산자     //true
        System.out.println("one"=="two");   //동등비교연산자//false
        System.out.println("one"=="one");  //동등비교연산자 //true
        
        Boolean g = 10==20;
        System.out.println(g);//false
	}
}
