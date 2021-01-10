package p_다형성3;

class A{
	
    public String x(){return "A.x";}
}

class B extends A{
	
    public String x(){return "B.x";}
    public String y(){return "y";}
}

public class 다형성4 {
	
    public static void main(String[] args) {
    	
        A obj = new B();
        System.out.println(obj.x());//실행결과가 "B.x" 가된다!!
        //오버라이딩 했기때문에! 이게 적용된다는거
        B obj2 = new B();
        System.out.println(obj2.x());
    }
}