package ch04;

public class Casting {
	 
    public static void main(String[] args) {
         
        double a = 1.1;
        double b = 1;//자동형변환 정수를 실수로
        double b2 = (double) 1;
         
        System.out.println(b);
        System.out.println(b2);
         
        double d = 1.1;
        int e = (int) 1.1;//실수를 정수로 바꾸고싶으면 명시적으로만 가능 왜냐면 0.1을 잃기때문
        //int c = 1.1;//
        System.out.println(e);
         
        // 1 to String 
        String f = Integer.toString(1);//정수를 문자열로 바꾸기
        System.out.println(f.getClass());//class java.lang.String 어떤타입인지 확인
 
        //검색능력을 기르자 : java int to string casting
        //How do I convert from int to String? - Stack Overflow
    }
}