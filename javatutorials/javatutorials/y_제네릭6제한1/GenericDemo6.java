package y_���׸�6����1;

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
class Person<T extends Info>{//T�� ������Ÿ���� InfoŬ�����̰ų� �ڽ��� EmployeeInfo�� ����
    public T info;
    Person(T info){ this.info = info; }
}
public class GenericDemo6 {
    public static void main(String[] args) {
Person<EmployeeInfo>p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
//EmployeeInfo�� info�� �ڽ��̸� ����������
   // Person<String> p2 = new Person<String>("����");//�ڽ��̾ƴ϶� ��Ʈ���� �����ԵǴ°�
}
}