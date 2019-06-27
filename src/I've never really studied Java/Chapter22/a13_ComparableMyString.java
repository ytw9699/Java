package Chapter22;
import java.util.TreeSet;
import java.util.Iterator;

class MyString implements Comparable<MyString>
{
	String str;
	
	public MyString(String str)
	{
		this.str=str;
	}
	
	public int getLength()
	{
		return str.length();
	}
	
	public int compareTo(MyString mStr)
	{
		if(getLength()>mStr.getLength())//인자로 전달된 문자열의 길이가 더작다면 1반환
			return 1;
		else if(getLength()<mStr.getLength())
			return -1;
		else
			return 0;

		//return getLength()-mStr.getLength();//위를 요렇게 표현해도됨
		 
	}
	
	public String toString()
	{
		return str;
	}
}

class a13_ComparableMyString
{
	public static void main(String[] args)
	{
		TreeSet<MyString> tSet=new TreeSet<MyString>();		
		tSet.add(new MyString("Orange"));
		tSet.add(new MyString("Apple"));
		tSet.add(new MyString("Dog"));
		tSet.add(new MyString("Individual"));
		
		Iterator<MyString> itr=tSet.iterator();//오름차순정렬 길이가짧은것부터
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}