package Chapter22;
import java.util.HashMap;
import java.util.Iterator;

class a15_IntroHashMap
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> hMap=new HashMap<Integer, String>();

		hMap.put(new Integer(3), "나삼번");		
		hMap.put(5, "윤오번");	
		hMap.put(8, "박팔번");	
		
		System.out.println("6학년 3반 8번 학생: "+hMap.get(new Integer(8)));
		System.out.println("6학년 3반 5번 학생: "+hMap.get(5));
		System.out.println("6학년 3반 3번 학생: "+hMap.get(3));
		
		hMap.remove(5);		/* 5번 학생 전학 감 */
		System.out.println("6학년 3반 5번 학생: "+hMap.get(5));	
		
		for (Integer key : hMap.keySet()) {

		    System.out.println(String.format("키 : %s, 값 : %s", key, hMap.get(key)));

		}
		
		Iterator<Integer> keys = hMap.keySet().iterator();

		while (keys.hasNext()) {

			Integer key = keys.next();

		    System.out.println(String.format("키 : %s, 값 : %s", key, hMap.get(key)));

		}
		
	}
}