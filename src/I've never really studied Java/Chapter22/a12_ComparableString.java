package Chapter22;
import java.util.TreeSet;
import java.util.Iterator;

class a12_ComparableString
{
	public static void main(String[] args)
	{
		TreeSet<String> tSet=new TreeSet<String>();		
		tSet.add("Orange");
		tSet.add("Apple");
		tSet.add("Dog");
		tSet.add("Individual");
		
		Iterator<String> itr=tSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}