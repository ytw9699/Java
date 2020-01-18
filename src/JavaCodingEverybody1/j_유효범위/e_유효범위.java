package j_유효범위;
   
class C {
    int v = 10;//인스턴스 변수
 
    void m() {
    	//메소드내부안에 지역변수가 없기때문에 
        System.out.println(v);//인스턴스 변수 전역변수v를 쓰는것
   }
}
 
public class e_유효범위 {
 
    public static void main(String[] args) {
        C c1 = new C();
        c1.m();//인스턴스를 통해 인스턴스 메소드 접근가능
        //하고 다시 인스턴스 변수에 접근  가능과 같은말
        //d_클래스맴버와인스터맴버의관계 가보면 중첩되는 부분이있다
        
    }
 
}