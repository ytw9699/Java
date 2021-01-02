package j_유효범위;

class C3 {
	
    int v = 10;//인스턴스 변수
 
    void m() {
    	
    	int v = 20;
        System.out.println(v);//지역변수 v를 쓰는것
        System.out.println(this.v);//전역변수 v를쓰는것 this는 인스턴스 자신을 의미
    }
}

public class e_유효범위3 {
 
    public static void main(String[] args) {
    	
        C3 c1 = new C3();
        c1.m();
    }
}
