package c_데이터타입;
public class b예시 {
	public static void main(String[] args) {
		//아래의 변수 a와 변수 b는 둘 다 똑같이 8byte의 메모리를 사용하게 된다.
		//데이터 타입이 같기 때문이다.
		long a = 2147483647;
		long b = 1;
		//반대로 아래의 변수 c와 변수 d는 똑같은 수를 저장하고 있지만, 
		//변수 d가 2배의 메모리를 사용한다. 데이터 타입이 다르기 때문이다. 
		int c = 2147483647;
		long d = 2147483647;
	}

}
