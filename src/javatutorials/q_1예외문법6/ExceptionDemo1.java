package q_1���ܹ���6;
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
        } finally {//�ݵ�� try catch�� ��ġ
            System.out.println("finally");//���ܿ��ο� ������� ����Ǵ� ����
            //db�� ������ �����ִ¿���
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