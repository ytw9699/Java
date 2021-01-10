package p_다형성8인터페이스;

interface I{}

class C implements I{}

public class 인터페이스도다형성 {
	
    public static void main(String[] args) {
    	
        I obj = new C();//같은개념
    }
}