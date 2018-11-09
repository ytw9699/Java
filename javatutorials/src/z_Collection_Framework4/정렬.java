package z_Collection_Framework4;//����� �ٽ��غ���..�˰���,�ڷᱸ���� �������ȵ�..
import java.util.*;//�ݷ��� �����ӿ�ũ���� �����ϴ¹�
class Computer implements Comparable{
    int serial;//�ν��Ͻ� ����
    String owner;//�ν��Ͻ� ����
    Computer(int serial, String owner){//������
        this.serial = serial;
        this.owner = owner;
    }
    public int compareTo(Object test) {//Comparable�������̽��� compareTo�� �����ϵ��� ����
        return this.serial - ((Computer)test).serial;
    }//�޼ҵ� sort�� �����ϸ� ���������� compareTo�� �����ϰ� �� ����� ���� ��ü�� ���� ���踦 �Ǻ��ϰ� �ȴ�.
    public String toString(){//��Ʈ�� ����
        return serial+" "+owner;//�ø���� �����ǰ� ����
    }
}
public class ���� {
    public static void main(String[] args) {
        List<Computer> computers2 = new ArrayList<Computer>();
        computers2.add(new Computer(500, "egoing"));//3���� ��ü�� ��̸���Ʈ �����̳ʿ�����
        computers2.add(new Computer(200, "leezche"));
        computers2.add(new Computer(3233, "graphittie"));
        Iterator i = computers2.iterator();
        System.out.println("before");
        while(i.hasNext()){
            System.out.println(i.next());//��̸���Ʈ�� �������־ ����������
        }//�������ڰ� �������� �����غ��� �׷����� Comparable�ϴ� �������̽��� ����ؾ���
        Collections.sort(computers2);//Collections��� Ŭ���� �����̳� �����ͿͰ��õ� �۾��������ִ� Ŭ���� �׾ȿ� �޼ҵ��
        //���� static�̶� ��ü�������� �ٷ�����//sort��� �޼ҵ忡 ����ƮŸ���� �����ϸ� ��������//����Ʈ������
        //public static <T extends Comparable<? super T>> void sort(List<T> list) {//����Ʈ��� �Ű�����
        //���׸��� T�ε� �� T��� computers2�� Comparable�������̽��� �������Ѵٴ°�
        //�ᱹ  Comparable�������̽��� �����ϴ� ����Ʈ�� �������شٴ°�
        System.out.println("\nafter");
        i = computers2.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}