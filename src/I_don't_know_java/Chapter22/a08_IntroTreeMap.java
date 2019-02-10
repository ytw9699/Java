package Chapter22;
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
		
		NavigableSet<Integer> navi=tMap.navigableKeySet();//키의 값들을 가져오는 콜렉션 인터페이스를 구현하는 NavigableSet형 
		
		System.out.println("오름차순 출력...");
		Iterator<Integer> itr=navi.iterator();//이 이터레이터가 오른차순으로 정렬해줌
		while(itr.hasNext())
			System.out.println(tMap.get(itr.next()));
		
		System.out.println("내림차순 출력...");
		itr=navi.descendingIterator();//이 이터레이터가 내림차순으로 정렬
		while(itr.hasNext())
			System.out.println(tMap.get(itr.next()));	
	}
}