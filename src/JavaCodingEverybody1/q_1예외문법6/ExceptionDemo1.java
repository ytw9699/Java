package q_1예외문법6;
class A{
    private int[] arr = new int[3];
    A(){
        arr[0]=0;
        arr[1]=10;
        arr[2]=20;
    }
    public void z(int first, int second){
        try {
            System.out.println(arr[first] / arr[second]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        } catch(Exception e){
            System.out.println("Exception");
        } finally {//반드시 try catch뒤 위치
            System.out.println("finally");//예외여부와 관계없이 실행되는 로직
            //db와 접속을 끊어주는예시
        }
    }
}
public class ExceptionDemo1 {
    public static void main(String[] args) {
        A a = new A();
        a.z(10, 0);//ArrayIndexOutOfBoundsException
        a.z(1, 0);//ArithmeticException
        a.z(2, 1);
    }
}