package j_유효범위;

public class d_유효범위 {
	static int i = 5;//전역변수
	 
    static void a() {
        int i = 10;//지역변수
        b();
    }
 
    static void b() {
    	 int i = 20;//지역변수
        System.out.println(i);//이 i는 이 메소드안의 지역변수를 먼저 우선순위로 가져온다 전역변수보다 
    }
 
    public static void main(String[] args) {
        a();
    }
 
}
