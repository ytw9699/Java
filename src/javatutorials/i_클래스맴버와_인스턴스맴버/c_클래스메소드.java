package i_Ŭ�����ɹ���_�ν��Ͻ��ɹ�;
class Calculator3{
	  
    public static void sum(int left, int right){//static�� ���̸� Ŭ���� �Ҽ��� �޼ҵ尡 �ȴ�!!
        System.out.println(left+right);
    }
     
    public static void avg(int left, int right){
        System.out.println((left+right)/2);
    }
}
public class c_Ŭ�����޼ҵ� {
     
    public static void main(String[] args) {
        Calculator3.sum(10, 20);//��ü�������� Ŭ������ ���� �����ؼ� ���డ��!
        Calculator3.avg(10, 20);
        //���� �޼ҵ尡 �ν��Ͻ� ������ �������� �ʴ´ٸ� Ŭ���� �޼ҵ带 ����ؼ�
        //���ʿ��� �ν��Ͻ��� ������ ���� �� �ִ�.
        Calculator3.sum(20, 40);
        Calculator3.avg(20, 40);
    }
 
}