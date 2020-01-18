package i_클래스맴버와_인스턴스맴버;

class C1{//여기 의문이다 생코가 설명잘못한듯? 밑에 로직은 맞는데 설명은..?좀 이상?
    static int static_variable = 1;//스테이틱이 붙어서 스테이틱변수!클래스 변수!
    int instance_variable = 2;//인스턴스 변수! 
    static void static_static(){//클래스 메소드에서
        System.out.println(static_variable);//클래스 변수에 접근!1이출력
    }
    static void static_instance(){//클래스 메소드에서는 인스턴스 변수에 접근 할 수 없다.★★
         // System.out.println(instance_variable);//★★
    }
    void instance_static(){
        // 인스턴스 메소드에서는 클래스 변수에 접근 할 수 있다.
        System.out.println(static_variable);
    }
    void instance_instance(){//인스턴스 메소드에서 인스턴스 변수에 접근  
        System.out.println(instance_variable);
    }
}
public class d_클래스맴버와인스터맴버의관계 {  
    public static void main(String[] args) {
        C1 a = new C1();

        a.static_static();//인스턴스를 통해 클래스 메소드에 접근 가능 하고 다시 클래스 변수에 접근 가능
        
        a.static_instance();//★★인스턴스를 통해 클래스 메소드에는 접근 가능 하지만 인스턴스 변수에 접근 불가
        
        a.instance_static();//인스턴스를 통해 인스턴스 메소드에 접근 가능 하고 다시 클래스 변수에 접근 가능
    
        a.instance_instance();//인스턴스를 통해 인스턴스 메소드 접근가능 하고 다시 인스턴스 변수에 접근  가능
        
       /////////////////////////////////////////////////////////////////////////////////////
        
        C1.static_static();//클래스를 통해서 클래스 메소드에 접근 가능 하고 다시 클래스 변수에 접근 가능
     
        C1.static_instance();//★★클래스를 통해서 클래스 메소드에  접근 가능 하지만 인스턴스 변수에 접근 할 수 없다.
        
        //C1.instance_static();//★★클래스를 통해서 인스턴스 메소드에 접근 불가
      
        //C1.instance_instance();//★클래스를 통해서 인스턴스 메소드에 접근 불가하기때문에 
        						//당연히 그뒤에 인스턴스 변수에도 접근 불가
        
        //인스턴스 변수는 인스턴스가 만들어지면서 생성되는데, 
        //클래스 메소드는 인스턴스가 생성되기 전에 만들어지기 때문에 클래스 메소드가 인스턴스 맴버에 
        //접근하는 것은 존재하지 않는 인스턴스 변수에 접근하는 것과 같다.
        
        //인스턴스 변수와 클래스 변수는 아래와 같이 부르기도 한다.
        //인스턴스 변수 -> Non-Static Field > 논 스테이틱 변수
        //클래스 변수 -> Static Field > 스테이틱 변수
    }
 
}