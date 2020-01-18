package y_제네릭5생략2;
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person<T, S>{
    public T info;
    public S id;
    Person(T info, S id){ 
        this.info = info;
        this.id = id;
    }
    public <U,K> void printInfo(U info,K infos){
        System.out.println(info);
        System.out.println(infos);
    }
}
 public class GenericDemo52{
 public static void main(String[] args) {
 EmployeeInfo e = new EmployeeInfo(1);
 Integer i = new Integer(10);
 Person p1 = new Person(e, i);

p1.<EmployeeInfo,Integer>printInfo(i,e);
p1.printInfo(i,e);
 	}
 	}