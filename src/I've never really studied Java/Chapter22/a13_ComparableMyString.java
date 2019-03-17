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
		if(getLength()>mStr.getLength())//���ڷ� ���޵� ���ڿ��� ���̰� ���۴ٸ� 1��ȯ
			return 1;
		else if(getLength()<mStr.getLength())
			return -1;
		else
			return 0;

		//return getLength()-mStr.getLength();//���� �䷸�� ǥ���ص���
		 
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
		
		Iterator<MyString> itr=tSet.iterator();//������������ ���̰�ª���ͺ���
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}