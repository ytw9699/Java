package y_제네릭6제한2;

interface Info{
    public abstract int getLevel();
}
class EmployeeInfo implements Info{//상속받음
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
    public int getLevel(){//오버라이드
        return this.rank;
    }
}
class Person<T extends Info>{//T의 데이터타입을 Info클래스이거나 자식인 EmployeeInfo로
	//제한을 해버려서 타입의 안정성을 가져오고,중복을 제거한다
    //여기서 implements를 안쓰고extends를 쓴것은
	//extends은 여기서 상속한다는게 아니라 부모는 누구냐라는것
	//super도있는데 이건 나중에알아봐 이건 부모를 제한하는거
	public T info;
    Person(T info){ 
    	this.info = info;
    	System.out.println(info.getLevel());//이게 가능!
    }
}
public class GenericDemo7 {
    public static void main(String[] args) {
Person<EmployeeInfo>p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
   // Person<String> p2 = new Person<String>("부장");//스트링은 못오게되는거
}
}