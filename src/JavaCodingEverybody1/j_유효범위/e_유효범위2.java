package j_유효범위;
   
class C2 {
	
    int v = 10;
 
    void m() {
    	int v =20;//메소드 내부안 우선순위가 높은 지역변수를 쓰는것
        System.out.println(v);//지역변수 v를 쓰는것
    }
}
 
public class e_유효범위2 {
 
    public static void main(String[] args) {
    	
        C2 c1 = new C2();
        c1.m();
    }
}