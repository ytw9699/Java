package Chapter22;
import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person>//Comparable을 구현해야함
{
    String name;
    int age;

    public Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public void showData()//투스트링으로 printf을 표현못해서 이걸로 대시하는듯
    {
    	System.out.printf("%s %d \n", name, age);
    }
    public int compareTo(Person p) //누가 누구보다 크다 작다만 알려주는것 오름차순인지 내림차순인지는 정하지않음
    {//Comparable 클래스의 compareTo메소드를 오버라이딩해서 정렬의 기준을 정하자
    	//기존의 age랑 비교하는것
        if(age>p.age) //키가더 크다면 1
            return 1;
        else if(age<p.age)//작다면 -1
            return -1;
        else	
            return 0;//같다면 0
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