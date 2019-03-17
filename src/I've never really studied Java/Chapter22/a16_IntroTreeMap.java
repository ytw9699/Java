package Chapter22;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.NavigableSet;

class a16_IntroTreeMap
{
	public static void main(String[] args)
	{
		TreeMap<Integer, String> tMap=new TreeMap<Integer, String>();

		tMap.put(1, "data1");		
		tMap.put(3, "data3");	
		tMap.put(5, "data5");	
		tMap.put(2, "data2");	
		tMap.put(4, "data4");	
		
		NavigableSet<Integer> navi=tMap.navigableKeySet();
		//TreeMap안의 키들을 모두 가져오는것
		//NavigableSet자료형은 콜렉션 인터페이스 Set<E>를 구현하고있고 정렬 해준다.
		//이 navi라는 인스턴스안에 키들이 들어있다.
		
		System.out.println("오름차순 출력...");
		Iterator<Integer> itr=navi.iterator();//이 이터레이터가 정렬된값들을 오른차순으로 참조해줌
		while(itr.hasNext())
			System.out.println(tMap.get(itr.next()));
		
		System.out.println("내림차순 출력...");
		itr=navi.descendingIterator();//이 이터레이터가 내림차순으로 참조해줌
		while(itr.hasNext())
			System.out.println(tMap.get(itr.next()));	
	}
}