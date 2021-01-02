package i_클래스맴버와_인스턴스맴버;

class Calculator3{
	  
    public static void sum(int left, int right){//static을 붙이면 클래스 소속의 메소드가 된다!!
        System.out.println(left+right);
    }
     
    public static void avg(int left, int right){
        System.out.println((left+right)/2);
    }
}

public class c_클래스메소드 {
     
    public static void main(String[] args) {
    	
        Calculator3.sum(10, 20);//객체생성없이 클래스에 직접 접근해서 실행가능!
        Calculator3.avg(10, 20);
        //만약 메소드가 인스턴스 변수를 참조하지 않는다면 클래스 메소드를 사용해서
        //불필요한 인스턴스의 생성을 막을 수 있다.
        Calculator3.sum(20, 40);
        Calculator3.avg(20, 40);
    }
 
}