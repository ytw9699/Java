package q_1���ܹ���5;
class A{
    private int[] arr = new int[3];
    A(){
        arr[0]=0;
        arr[1]=10;
        arr[2]=20;
    }
    public void z(int first, int second){
        try {//���� catch
            System.out.println(arr[first] / arr[second]);//���⼭ ���� ���ܿ�����
        } catch(ArrayIndexOutOfBoundsException e){//if else
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch(ArithmeticException e){//if else
            System.out.println("ArithmeticException");
        } catch(Exception e){//else�� ���ٰ���//���� ���ش�����ʴ´ٸ�
        	//�̰��� �׷��� �������οø���ȵ�//��翹�ܸ� �����ϴϱ�
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