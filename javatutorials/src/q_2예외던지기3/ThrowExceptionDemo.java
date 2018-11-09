package q_2예외던지기3;

public class ThrowExceptionDemo {//메인에 대한 사용자는 우리
    public static void main(String[] args) {
         C c = new C();
         c.run();
    }   
}
class C{
    void run(){//이메소드 사용자는 메인
        B b = new B();
        b.run();
    }
}
class B{
    void run(){//이메소드 사용자는 C
    }
}
