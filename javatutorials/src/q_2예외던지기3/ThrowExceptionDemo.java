package q_2���ܴ�����3;

public class ThrowExceptionDemo {//���ο� ���� ����ڴ� �츮
    public static void main(String[] args) {
         C c = new C();
         c.run();
    }   
}
class C{
    void run(){//�̸޼ҵ� ����ڴ� ����
        B b = new B();
        b.run();
    }
}
class B{
    void run(){//�̸޼ҵ� ����ڴ� C
    }
}
