package y_���׸�6����2;

interface Info{
    public abstract int getLevel();
}
class EmployeeInfo implements Info{//��ӹ���
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
    public int getLevel(){//�������̵�
        return this.rank;
    }
}
class Person<T extends Info>{//T�� ������Ÿ���� InfoŬ�����̰ų� �ڽ��� EmployeeInfo��
	//������ �ع����� Ÿ���� �������� ��������,�ߺ��� �����Ѵ�
    //���⼭ implements�� �Ⱦ���extends�� ������
	//extends�� ���⼭ ����Ѵٴ°� �ƴ϶� �θ�� �����Ķ�°�
	//super���ִµ� �̰� ���߿��˾ƺ� �̰� �θ� �����ϴ°�
	public T info;
    Person(T info){ 
    	this.info = info;
    	System.out.println(info.getLevel());//�̰� ����!
    }
}
public class GenericDemo7 {
    public static void main(String[] args) {
Person<EmployeeInfo>p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
   // Person<String> p2 = new Person<String>("����");//��Ʈ���� �����ԵǴ°�
}
}