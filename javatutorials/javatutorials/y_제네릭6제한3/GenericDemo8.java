package y_제네릭6제한3;

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
class Person<T>{//class Person<T extends Object>와 같은뜻
    public T info;
    Person(T info){ this.info = info; }
	//info.getLevel();//이건불가//오브젝트 클래스에는  getlevel메소드가 없자나
}
public class GenericDemo8 {
    public static void main(String[] args) {
Person<EmployeeInfo>p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
   Person<String> p2 = new Person<String>("부장");//스트링은 올수가있는듯
}
}