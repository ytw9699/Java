package y_���׸�5����;

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
    public <U> void printInfo(U info){//�޼ҵ忡�� ���׸�
    	//�̷��� �ΰ����� u�� �����ָ� info�Ű������� ������Ÿ������ u�������°Ŵ�
        System.out.println(info);  
    }
}
 public class GenericDemo51{
 public static void main(String[] args) {
 EmployeeInfo e = new EmployeeInfo(1);
 Integer i = new Integer(10);
 //Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, i);
 //�ؿ�ó�� �������� 
 Person p1 = new Person(e, i);

p1.<Integer>printInfo(i);//������Ÿ���� Integer,�Ű������� new Integer(10);
p1.printInfo(i);//�Ȱ��� ��������
 	}
 	}