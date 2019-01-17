package q_1예외문법5;
class A{
    private int[] arr = new int[3];
    A(){
        arr[0]=0;
        arr[1]=10;
        arr[2]=20;
    }
    public void z(int first, int second){
        try {//다중 catch
            System.out.println(arr[first] / arr[second]);//여기서 잡힌 예외에따라서
        } catch(ArrayIndexOutOfBoundsException e){//if else
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch(ArithmeticException e){//if else
            System.out.println("ArithmeticException");
        } catch(Exception e){//else와 같다고보자//위에 다해당되지않는다면
        	//이것을 그래서 제일위로올리면안됨//모든예외를 포함하니까
            System.out.println("Exception");
        }
    }
}
public class ExceptionDemo1 {
    public static void main(String[] args) {
        A a = new A();
        a.z(10, 0);
        a.z(1, 0);
        a.z(2, 1);
    }
}