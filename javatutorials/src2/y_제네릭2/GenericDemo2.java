package y_���׸�2;

class StudentInfo{
    public int grade;
    StudentInfo(int grade){ this.grade = grade; }
}
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person{//�ߺ�����
    public Object info;//������Ʈ�� �ع����� �ٶ���
    Person(Object info){ this.info = info; }
    //Ŭ���� Person�� �����ڴ� �Ű����� info�� ������ Ÿ���� Object�̴�
    //���� ��� ��ü�� �� �� �ִ�. �׷��� ������ ���� EmployeeInfo�� ��ü�� �ƴ϶� 
    //String�� �͵� ������ ������ �߻����� �ʴ´�.
    //��� ��Ÿ�� ������ �߻��Ѵ�. 
    //������ ����� �⺻�� ��� ������ �������� �߻��� �� �ֵ��� �����ؾ� �Ѵٴ� ���̴�. 
}//���� ���� ������ Ÿ�Կ� ���ؼ� �������� �ʴٰ� �Ѵ�. �� ��� Ÿ���� �� �� �ֱ� 
//������ Ÿ���� �����ϰ� ���� �� �� ���� �Ǵ� ���̴�
//�׷��� Ÿ���� �������� �ߺ��� �����ϴ� 2���� �䳢�� �������� ���׸��� �˾ƺ���
public class GenericDemo2 {
public static void main(String[] args) {
Person p1 = new Person("����");//��Ʈ���� Ÿ���� ���࿡ �޴� �Ǽ��� �Ѵٸ�
EmployeeInfo ei = (EmployeeInfo)p1.info;//���⼭ �ᱹ ������������
System.out.println(ei.rank);
}
}