package j_유효범위;

public class c_유효범위 {
	static int i = 5;//전역변수
	 
    static void a() {
        int i = 10;//지역변수
        b();
    }
 
    static void b() {
        System.out.println(i);//이 i는 전역변수가 출력되는것이지 다른 메소드에있는 i가
        //출력될수 없다
    }
 
    public static void main(String[] args) {
         int i=1;//지역변수
    	a();
    }
 
}
