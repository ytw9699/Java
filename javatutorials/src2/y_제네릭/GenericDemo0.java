package y_���׸�;
//���׸� : �������� �⺻��
//���׸�(Generic)�� Ŭ���� ���ο��� ����� ������ Ÿ���� �ܺο��� �����ϴ� ����� �ǹ��Ѵ� 
class Person<T>{
    public T info;//���������� ������Ÿ��
    //T���� String,StringBuilder�� ���°�
}

public class GenericDemo0 {
 
public static void main(String[] args) {
    Person<String> p1 = new Person<String>();
    //Person<String>�� ������Ÿ���̴�
    Person<StringBuilder> p2 = new Person<StringBuilder>();
    }
 
}