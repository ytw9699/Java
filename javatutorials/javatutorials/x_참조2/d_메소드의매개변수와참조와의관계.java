package x_참조2;
public class d_메소드의매개변수와참조와의관계 {
   static void _value(int b){
       b = 2;
   }
   public static void runValue(){
       int a = 1;//기본데이터타입이라이것은 바뀌지않는다
       _value(a);
       System.out.println("runValue, "+a);//1출력
   }
   static void _reference1(A b){
       b = new A(2);
   }
   public static void runReference1(){
       A a = new A(1);
       _reference1(a);
       //A b=a;     //b변수에 a를 주고서
       //b=new A(2);  //다시 b변수에 new A(2)를 주니까//이건 새로운 인스터스를 참조하는것
       System.out.println("runReference1, "+a.id);//1출력      
   }
   static void _reference2(A b){
       b.id = 2;//b는 a와 같은거라고 봐야함
   }
   public static void runReference2(){
       A a = new A(1);
       _reference2(a);//A b=a;     //b변수에 a를 주고서
       System.out.println("runReference2, "+a.id);//2출력     
   }
   public static void main(String[] args) {
       runValue(); // runValue, 1
       runReference1(); // runReference1, 1
       runReference2(); // runReference2, 2
   }
}