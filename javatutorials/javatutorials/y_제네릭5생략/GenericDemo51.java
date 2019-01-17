package y_제네릭5생략;

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
    public <U> void printInfo(U info){//메소드에도 제네릭
    	//이렇게 두가지에 u를 적어주면 info매개변수의 데이터타입으로 u가들어오는거다
        System.out.println(info);  
    }
}
 public class GenericDemo51{
 public static void main(String[] args) {
 EmployeeInfo e = new EmployeeInfo(1);
 Integer i = new Integer(10);
 //Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, i);
 //밑에처럼 생략가능 
 Person p1 = new Person(e, i);

p1.<Integer>printInfo(i);//데이터타입은 Integer,매개변수는 new Integer(10);
p1.printInfo(i);//똑같이 생략가능
 	}
 	}