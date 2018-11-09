package g_메소드;

public class f_return의특성 {
    public static int one() {
        return 1;  //1을 메소드 밖으로 반환하면서 메소드 완전히 종료
       // return 2;  //리턴을 하게되면 종료가 되버리니 뒤에는 실행안됨!오류남!
        //return 3;
    }
    public static void main(String[] args) {
    	one();//이건 걍 아무런결과없음
        System.out.println(one());
         int result = one();
         System.out.println(result);
    }
}