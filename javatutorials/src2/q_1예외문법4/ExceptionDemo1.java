package q_1예외문법4;

class A{
    private int[] arr = new int[3];
    A(){//생성자가호출될때 배열의 값을 지정
        arr[0]=0;
        arr[1]=10;
        arr[2]=20;
    }
    public void z(int first, int second){
        System.out.println(arr[first] / arr[second]);
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
    }
}
 
public class ExceptionDemo1 { 
    public static void main(String[] args) {
        A a = new A();
        a.z(1, 0);
}
}

