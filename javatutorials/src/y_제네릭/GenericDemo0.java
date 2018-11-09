package y_제네릭;
//제네릭 : 포괄적인 기본뜻
//제네릭(Generic)은 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법을 의미한다 
class Person<T>{
    public T info;//인포변수의 데이터타입
    //T에는 String,StringBuilder이 들어가는것
}

public class GenericDemo0 {
 
public static void main(String[] args) {
    Person<String> p1 = new Person<String>();
    //Person<String>이 데이터타입이다
    Person<StringBuilder> p2 = new Person<StringBuilder>();
    }
 
}