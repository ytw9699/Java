package x_참조1;
class A{
    public int id;//인스턴스 변수
    A(int id){//생성자
        this.id = id;
    }
}
public class b참조_ReferenceDemo2 {
    public static void runValue(){
        int a = 1;
        //int는 기본 데이터형(원시 데이터형, Primitive Data Types)이다. 
        int b = a; //복제이지만
        b = 2;
        System.out.println("runValue, "+a); 
    }
    public static void runReference(){
        A a = new A(1);
        A b = a;//이것은 참조이다
        b.id = 2;//a와b에 담긴값들은 new A()를(원본) 통해 만든 인스턴스 주소값(참조값)이 담겨있는거라 같은것이고 
        //이 주소값을 참조한것이기때문에 같은것이 바뀌게 된다
        //변수 b와 변수 a에 담긴 인스턴스가 서로 같다는 것을 의미하다
        //마치 바로가기를 만든것과 비슷 원본텍스트파일을 참조해서 바로가기(symbolic link)를 만든것
        //a와b에는 new A(1)를(원본)통해 만든 인스턴스의 주소값이 들어있는것이다
        //new를 이용해서 만든 인스턴스의 데이터타입은 참조형,참조자료형,참조데이터형이라부른다
        //new를 사용해서 객체를 만드는 모든 데이터 타입이 참조 데이터형이라고 생각해도 된다(단 String은 제외다) 
        System.out.println("runReference, "+a.id);      
        System.out.println("runReference, "+b.id);      
    }
    public static void main(String[] args) {
        runValue();
        runReference();
    } //정리하면 변수에 담겨있는 데이터가 기본형이면 그 안에는 실제 데이터가 들어있고, 
}   //기본형이 아니면 변수 안에는 데이터에 대한 참조 방법이 들어있다고 할 수 있다.

