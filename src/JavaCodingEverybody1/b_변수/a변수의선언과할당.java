package b_변수;

public class a변수의선언과할당 {
	public static void main(String[] args) {
//변수-변할수있는 모든 데이타(숫자만이아님)
//영어로는 Variable로 (문자나 숫자 같은) 데이터를 담는 컨테이너다
//여기에 담겨진 데이터는 다른 데이터로 바꿀 수 있다.
//변수는 마치 (사람이 쓰는 언어인) 자연어에서 대명사와 비슷한 역할을 한다.	he,she,they
	int a;//int는 데이터형식이 숫자중 정수형(+,-,0) 인것으로 처음부터 강제함
	//a는 변수의 이름 
	//변수의 선언
	a = 1;//a라는 변수에 1이라는 값을 대입
	System.out.println(a+1); //2
	 
	a = 2;//재할당
	System.out.println(a+1); //3
	}
}
