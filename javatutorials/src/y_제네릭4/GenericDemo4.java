package y_���׸�4;
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person<T, S>{//������ ���׸�
	//�������� ������ ������Ÿ���� �����϶� 
	//<T, S>���� �⺻������Ÿ���� ������ ����������Ÿ�Ը��´�
	//�׷��� �⺻������Ÿ���� ����Ŭ����Ÿ������ �־������
	//�⺻������Ÿ���� ��ü�� �ƴϴ� �׷��� ��ü�ΰ�ó�� ����(wrapper)Ŭ������ �־������
	//�ᱹ ��ü�� ������ ����Ŭ����
    public T info;
    public S id;
    //Integer id = new Integer(1);
    Person(T info, S id){ 
        this.info = info; 
        this.id = id;
    }
}
public class GenericDemo4 {
 public static void main(String[] args) {
	 Integer id2 = new Integer(30);//30�� �����ڿ� �־��༭ 30�� �ǹ��ϴ� �ϳ��� �ν��Ͻ��� �����
Person<EmployeeInfo, Integer> p1 =
new Person<EmployeeInfo, Integer>(new EmployeeInfo(1), id2);
System.out.println(p1.id.intValue());
//intValue()�޼ҵ�� ����Ŭ������ ���� ������ ����1�� ���� �⺻������ intŸ������ �������� ������
    }
}