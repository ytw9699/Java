package x_����2;
public class d_�޼ҵ��ǸŰ��������������ǰ��� {
   static void _value(int b){
       b = 2;
   }
   public static void runValue(){
       int a = 1;//�⺻������Ÿ���̶��̰��� �ٲ����ʴ´�
       _value(a);
       System.out.println("runValue, "+a);//1���
   }
   static void _reference1(A b){
       b = new A(2);
   }
   public static void runReference1(){
       A a = new A(1);
       _reference1(a);
       //A b=a;     //b������ a�� �ְ�
       //b=new A(2);  //�ٽ� b������ new A(2)�� �ִϱ�//�̰� ���ο� �ν��ͽ��� �����ϴ°�
       System.out.println("runReference1, "+a.id);//1���      
   }
   static void _reference2(A b){
       b.id = 2;//b�� a�� �����Ŷ�� ������
   }
   public static void runReference2(){
       A a = new A(1);
       _reference2(a);//A b=a;     //b������ a�� �ְ�
       System.out.println("runReference2, "+a.id);//2���     
   }
   public static void main(String[] args) {
       runValue(); // runValue, 1
       runReference1(); // runReference1, 1
       runReference2(); // runReference2, 2
   }
}