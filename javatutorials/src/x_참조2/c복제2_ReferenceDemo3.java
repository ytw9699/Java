package x_����2;
class A{
    public int id;
    A(int id){
        this.id = id;
    }
}
public class c����2_ReferenceDemo3 {
  
    public static void runReference(){
        A a = new A(1);
        A b = a;
        b = new A(2);//���ο� �ν��Ͻ��� �����ϴ°�
        System.out.println("runReference, "+a.id);
        //�׷��� ���� 2���ƴ� 1���     
        System.out.println("runReference, "+b.id);
    }
    public static void main(String[] args) {
        runReference();
    }
}
