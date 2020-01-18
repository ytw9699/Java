package y_제네릭2;

class StudentInfo{
    public int grade;
    StudentInfo(int grade){ this.grade = grade; }
}
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person{//중복제거
    public Object info;//오브젝트로 해버리는 바람에
    Person(Object info){ this.info = info; }
    //클래스 Person의 생성자는 매개변수 info의 데이터 타입이 Object이다
    //따라서 모든 객체가 될 수 있다. 그렇기 때문에 위와 EmployeeInfo의 객체가 아니라 
    //String이 와도 컴파일 에러가 발생하지 않는다.
    //대신 런타임 에러가 발생한다. 
    //컴파일 언어의 기본은 모든 에러는 컴파일이 발생할 수 있도록 유도해야 한다는 것이다. 
}//위와 같은 에러를 타입에 대해서 안전하지 않다고 한다. 즉 모든 타입이 올 수 있기 
//때문에 타입을 엄격하게 제한 할 수 없게 되는 것이다
//그래서 타입의 안정성과 중복을 제거하는 2가지 토끼를 잡으려고 제네릭을 알아보자
public class GenericDemo2 {
public static void main(String[] args) {
Person p1 = new Person("부장");//스트링을 타입을 만약에 받는 실수를 한다면
EmployeeInfo ei = (EmployeeInfo)p1.info;//여기서 결국 오류가나버림
System.out.println(ei.rank);
}
}