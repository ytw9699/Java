﻿package j_유효범위;
//유효범위는 클래스맴버와 인스턴스맴버에서 좀더 세부적으로 들어가서
//인스턴스변수인 전역변수와 지역변수의 관계에 관련하여 보는예제인듯하다
public class a_유효범위 {
	 
static void a() {//클래스 메소드 //스테이틱 메소드
    int i = 0;//지역변수 //이 메소드 안에서 선언된 변수는
    //내부 변수의 값이 그 외부에 영향을 미치지 않는다는 것을 알 수 있다.
}

public static void main(String[] args) {
	for (int i = 0; i < 5; i++) {
    a();//이곳에서 영향을 끼치지 않는다 유효하지않는다. 이게 scope이자 유효범위이다
    System.out.println(i);//이i는 메인메소드 안의  선언한 i를 출력하는것
}
    }
 
}
/*전역변수안에는 스테이틱변수 인스턴스 변수 둘다포함되는듯하다*/