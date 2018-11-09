package q_1예외문법3;

class A{
    private int[] arr = new int[3];
    A(){//생성자가호출될때 배열의 값을 지정
        arr[0]=0;
        arr[1]=10;
        arr[2]=20;
    }
    public void z(int first, int second){
        System.out.println(arr[first] / arr[second]);
    }
}
public class ExceptionDemo1 {
    public static void main(String[] args) {
        A a = new A();
        a.z(10, 1);//10은 존재하지않는 배열의 인덱스의값을 호출하는것
    }
}
/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
at q_예외3.A.z(ExceptionDemo1.java:11)
at q_예외3.ExceptionDemo1.main(ExceptionDemo1.java:18)*/