package a_숫자와문자;

/*가장 익숙한 데이터 타입(data type)은 숫자와 문자일 것이다.
 컴퓨터도 계산기와 연관이 크기때문에 숫자를 먼저 배워보자
문자와 숫자를 프로그래밍에서는 어떻게 표현하고 연산하는지 알아보자.
데이터 타입은 자료형 또는 데이터형,데이터 형식 이라고도 한다.*/
public class a숫자 extends Object{
	public a숫자() {
	}
public static void main(String[] args) {
	//자바에서는 따옴표가 없는 숫자는 숫자로 인식한다.
	System.out.println(1+2);//정수
	System.out.println(1.2+1.3);//실수(소수점(자리수가있는것)이 붙는것)
	//정수와 실수는 상수라고 한다
	//위 두가지 정수와 실수는 전혀 다른 데이터 형식으로 자바에서 처리
	System.out.println(2*5);
	System.out.println(6/2);
	System.out.println(6/1.3);//이거는 실수 데이터 타입이 되는듯
	System.out.println(1.3/6);//이거는 실수 데이터 타입이 되는듯
	System.out.println(6/4);//소수점을 버린다
	}
}
