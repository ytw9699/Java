package l_overloading규칙;

public class OverloadingDemo {
	
    void A (){
    System.out.println("void A()");
    }
    void A (int arg1){
    System.out.println("void A (int arg1)");
    }
   /* void A (int param1){
    System.out.println("void A (int arg1)");
    }인자값 이름만 다른건 안된다*/
    void A (String arg1){
    	System.out.println("void A (String arg1)");
    	}
/*  int A (){
    System.out.println("void A()");
    } 오버로딩은 리턴타입이 같아야 한다 
    
    */
    public static void main(String[] args) {
    	OverloadingDemo od = new OverloadingDemo();
        od.A();
        od.A(1);
        od.A("coding everybody");
    }
}
//결론적으로 말하면 메소드 오버로딩은 매개변수가 다르면 이름이 같아도 서로 다른 메소드가 되는 것이다.
//반면에 매개변수는 같지만 리턴타입이 다르면 오류가 발생한다.