package y_제네릭4;
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person<T, S>{//복수의 제네릭
	//여러가지 변수의 데이터타입이 미지일때 
	//<T, S>에는 기본데이터타입이 못오고 참조데이터타입만온다
	//그래서 기본데이터타입은 래퍼클래스타입으로 넣어줘야함
	//기본데이터타입은 객체가 아니다 그래서 객체인것처럼 래퍼(wrapper)클래스를 넣어줘야함
	//결국 객체로 포장한 래퍼클래스
    public T info;
    public S id;
    //Integer id = new Integer(1);
    Person(T info, S id){ 
        this.info = info; 
        this.id = id;
    }
}
public class GenericDemo4 {
 public static void main(String[] args) {
	 Integer id2 = new Integer(30);//30을 생성자에 넣어줘서 30을 의미하는 하나의 인스턴스를 만든거
Person<EmployeeInfo, Integer> p1 =
new Person<EmployeeInfo, Integer>(new EmployeeInfo(1), id2);
System.out.println(p1.id.intValue());
//intValue()메소드는 래퍼클래스가 가진 원래의 숫자1을 원시 기본데이터 int타입으로 가진값을 돌려줌
    }
}