package q_1���ܹ���3;

class A{
    private int[] arr = new int[3];
    A(){//�����ڰ�ȣ��ɶ� �迭�� ���� ����
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
        a.z(10, 1);//10�� ���������ʴ� �迭�� �ε����ǰ��� ȣ���ϴ°�
    }
}
/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
at q_����3.A.z(ExceptionDemo1.java:11)
at q_����3.ExceptionDemo1.main(ExceptionDemo1.java:18)*/