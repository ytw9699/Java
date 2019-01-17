package y_제네릭6제한1;

abstract class Info{//꼭 추상클래스일 필요없지만 만들고
    public abstract int getLevel();
}
class EmployeeInfo extends Info{//상속받음
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
    public int getLevel(){//오버라이드
        return this.rank;
    }
}
class Person<T extends Info>{//T의 데이터타입을 Info클래스이거나 자식인 EmployeeInfo로 제한
    public T info;
    Person(T info){ this.info = info; }
}
public class GenericDemo6 {
    public static void main(String[] args) {
Person<EmployeeInfo>p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
//EmployeeInfo가 info의 자식이면 문제가없음
   // Person<String> p2 = new Person<String>("부장");//자식이아니라 스트링은 못오게되는거
}
}