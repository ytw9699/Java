package chap22;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.NavigableSet;

class a08_IntroTreeMap
{
	public static void main(String[] args)
	{
		TreeMap<Integer, String> tMap=new TreeMap<Integer, String>();

		tMap.put(1, "data1");		
		tMap.put(3, "data3");	
		tMap.put(5, "data5");	
		tMap.put(2, "data2");	
		tMap.put(4, "data4");	
		
		NavigableSet<Integer> navi=tMap.navigableKeySet();//Ű�� ������ �������� �ݷ��� �������̽��� �����ϴ� NavigableSet�� 
		
		System.out.println("�������� ���...");
		Iterator<Integer> itr=navi.iterator();//�� ���ͷ����Ͱ� ������������ ��������
		while(itr.hasNext())
			System.out.println(tMap.get(itr.next()));
		
		System.out.println("�������� ���...");
		itr=navi.descendingIterator();//�� ���ͷ����Ͱ� ������������ ����
		while(itr.hasNext())
			System.out.println(tMap.get(itr.next()));	
	}
}