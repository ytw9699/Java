package p_다형성2;

class A{
	
    public String x(){
    	return "x";
	}
}

class B extends A{
   
	public String y(){
    	return "y";
	}
}

public class 다형성3 {
    
	public static void main(String[] args) {
    
		A obj = new B();
        System.out.println(obj.x());
        B obj2 = new B();
        System.out.println(obj2.x());
      //obj.y(); 타입이 A이기때문에 실행안되는거다
      //obj2.y(); 이건 됨
    }
}