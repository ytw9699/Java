package Chapter22;
import java.util.HashMap;
import java.util.Iterator;

class a15_IntroHashMap
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> hMap=new HashMap<Integer, String>();

		hMap.put(new Integer(3), "�����");		
		hMap.put(5, "������");	
		hMap.put(8, "���ȹ�");	
		
		System.out.println("6�г� 3�� 8�� �л�: "+hMap.get(new Integer(8)));
		System.out.println("6�г� 3�� 5�� �л�: "+hMap.get(5));
		System.out.println("6�г� 3�� 3�� �л�: "+hMap.get(3));
		
		hMap.remove(5);		/* 5�� �л� ���� �� */
		System.out.println("6�г� 3�� 5�� �л�: "+hMap.get(5));	
		
		for (Integer key : hMap.keySet()) {

		    System.out.println(String.format("Ű : %s, �� : %s", key, hMap.get(key)));

		}
		
		Iterator<Integer> keys = hMap.keySet().iterator();

		while (keys.hasNext()) {

			Integer key = keys.next();

		    System.out.println(String.format("Ű : %s, �� : %s", key, hMap.get(key)));

		}
		
	}
}