package m_접근제어자;

class A {
    public String y(){//은행고객창구
        return "public void y()";
    }
    private String z(){//금고임, private이 붙은거는 같은 클래스안에서만 접근 가능하고
    	//다른 클래스에서는 직접적으로 접근 불가
        return "public void z()";
    }
    public String x(){//은행고객창구
        return z();
    }
}
public class b_AccessDemo1 {//이클래스가 a클래스에 대한 고객
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y());
        // 아래 코드는 오류가 발생한다.
        //System.out.println(a.z());//private이라 접근불가 
        System.out.println(a.x());//하지만 돌려서 접근 가능 
    }
}