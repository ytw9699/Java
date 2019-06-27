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
    public void showData()
    {
    	System.out.printf("%s %d \n", name, age);
    }
    //Comparable 클래스의 compareTo메소드를 오버라이딩해서 정렬의 기준을 정하자
    public int compareTo(Person p) //정렬의 기준을 나이가 많고 적음으로 표현한거지 오름차순인지 내림차순인지는 정하지않음
    {
        if(age>p.age) //인자로 전달된 p의  키가 더 작다면 1반환
            return 1;
        else if(age<p.age)//크다면 -1
            return -1;
        else	
            return 0;//같다면 0
    }
}
class a11_ComparablePerson 
{
	public static void main(String[] args)
	{
		TreeSet<Person> sTree=new TreeSet<Person>();
		sTree.add(new Person("Lee", 24));
		sTree.add(new Person("Hong", 29));
		sTree.add(new Person("Choi", 21));
		
		Iterator<Person> itr=sTree.iterator();//이터레이터가 오름차순으로 참조한다
		
		while(itr.hasNext())
			itr.next().showData();
	}
}