package y_���׸�6����3;

abstract class Info{//�� �߻�Ŭ������ �ʿ������ �����
    public abstract int getLevel();
}
class EmployeeInfo extends Info{//��ӹ���
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
    public int getLevel(){//�������̵�
        return this.rank;
    }
}
class Person<T>{//class Person<T extends Object>�� ������
    public T info;
    Person(T info){ this.info = info; }
	//info.getLevel();//�̰ǺҰ�//������Ʈ Ŭ��������  getlevel�޼ҵ尡 ���ڳ�
}
public class GenericDemo8 {
    public static void main(String[] args) {
Person<EmployeeInfo>p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
   Person<String> p2 = new Person<String>("����");//��Ʈ���� �ü����ִµ�
}
}