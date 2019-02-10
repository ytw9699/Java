package Chapter22;
import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person>//Comparable�� �����ؾ���
{
    String name;
    int age;

    public Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public void showData()//����Ʈ������ printf�� ǥ�����ؼ� �̰ɷ� ����ϴµ�
    {
    	System.out.printf("%s %d \n", name, age);
    }
    public int compareTo(Person p) //���� �������� ũ�� �۴ٸ� �˷��ִ°� ������������ �������������� ����������
    {//Comparable Ŭ������ compareTo�޼ҵ带 �������̵��ؼ� ������ ������ ������
    	//������ age�� ���ϴ°�
        if(age>p.age) //Ű���� ũ�ٸ� 1
            return 1;
        else if(age<p.age)//�۴ٸ� -1
            return -1;
        else	
            return 0;//���ٸ� 0
    }
}
class a06_ComparablePerson 
{
	public static void main(String[] args)
	{
		TreeSet<Person> sTree=new TreeSet<Person>();
		sTree.add(new Person("Lee", 24));
		sTree.add(new Person("Hong", 29));
		sTree.add(new Person("Choi", 21));
		
		Iterator<Person> itr=sTree.iterator();
		while(itr.hasNext())
			itr.next().showData();
	}
}