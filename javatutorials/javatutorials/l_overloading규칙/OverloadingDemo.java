package l_overloading��Ģ;

public class OverloadingDemo {
	
    void A (){
    System.out.println("void A()");
    }
    void A (int arg1){
    System.out.println("void A (int arg1)");
    }
   /* void A (int param1){
    System.out.println("void A (int arg1)");
    }���ڰ� �̸��� �ٸ��� �ȵȴ�*/
    void A (String arg1){
    	System.out.println("void A (String arg1)");
    	}
/*  int A (){
    System.out.println("void A()");
    } �����ε��� ����Ÿ���� ���ƾ� �Ѵ� 
    
    */
    public static void main(String[] args) {
    	OverloadingDemo od = new OverloadingDemo();
        od.A();
        od.A(1);
        od.A("coding everybody");
    }
}
//��������� ���ϸ� �޼ҵ� �����ε��� �Ű������� �ٸ��� �̸��� ���Ƶ� ���� �ٸ� �޼ҵ尡 �Ǵ� ���̴�.
//�ݸ鿡 �Ű������� ������ ����Ÿ���� �ٸ��� ������ �߻��Ѵ�.