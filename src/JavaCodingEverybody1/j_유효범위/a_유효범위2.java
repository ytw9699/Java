package j_유효범위;

public class a_유효범위2 {
	
	static int i;//스테이틱,클래스 변수!
    
    static void a(){//스테이틱,클래스 메소드
        i = 0;//전역변수를 사용!
        //int i = 0; //이렇게 해주면 이 메소드안에서만 유효한범위이기때문에 결과달라짐
    }
   
    public static void main(String[] args) {
    	
        for (i = 0; i < 5; i++) {//int i=0;이렇게 선언안한것은 전역변수쓰는것
        	
            a();//여기서 계속 i를 0으로 바꿔줌 왜냐면 이 for문이 전역변수를 쓰고있는데
            //여기서 계속 전역변수를 0으로 바꿔주고있으니 같은 유효범위인것임
            System.out.println(i);
            //끝나고 i++로 1을 증가시키지만..다시 위에서 0으로 되버림
        }
    }
    
}