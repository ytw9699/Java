package b_변수;

public class d변수의효용 {
	public static void main(String[] args) {
		System.out.println(100 + 10);
		System.out.println((100 + 10) / 10);
		System.out.println(((100 + 10) / 10) - 10);
		System.out.println((((100 + 10) / 10) - 10) * 10);
		
		int a = 100; //중복의제거, 가독성 , 유지보수 
		//고정적인 부분과 변경될수있는 부분나누기
		System.out.println(a + 10);
		System.out.println((a+ 10) / 10);
		System.out.println(((a + 10) / 10) - 10);
		System.out.println((((a + 10) / 10) - 10) * 10);
		
	}
}
