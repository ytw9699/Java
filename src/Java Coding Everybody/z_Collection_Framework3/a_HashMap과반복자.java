package z_Collection_Framework3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class a_HashMap���ݺ��� {
    public static void main(String[] args) {
    	
        HashMap<String, Integer> a = new HashMap<String, Integer>();
        //key �� value�� ��� ������������ ���׸����� ����
        a.put("one", 1);//put�޼ҵ��  �� �������̽����� ����
        a.put("two", 2);//ù��° ���ڴ� key,�ι�°�� value
        a.put("three", 3);
        a.put("four", 4);
        System.out.println(a.get("one"));
        System.out.println(a.get("two"));
        System.out.println(a.get("three"));
        System.out.println(a.get("four"));
        
        System.out.println(a);
        
        Set set = a.keySet();
        System.out.println(set);
        
        System.out.println(a.values());
        
        a.remove("two");
        System.out.println(a);
        
        //�ʿ� ����� ������ �ϳ��� �����ؼ� ������ �ݺ�ó������� ���� �˾ƺ���
        iteratorUsingForEach(a);//2���� ����� �ݺ� ó�� ���
        iteratorUsingIterator(a);
    }
    //����ü���� interation����� ��� �̷��� ��ȸ�������ϴ°�
    static void iteratorUsingForEach(HashMap map){
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        							//���������̽���  entrySet()�̶�� �޼ҵ尡 ����
        //entrySet()�� set������Ÿ���� ��ü�� �����ؼ� entrise��� ������ ��´�
        //�� ������ ���͵��� Map.Entry������Ÿ���� ��ü���̴���ִ°� //�ᱹ �ʾ��� ��ü���� ������ �Űܴ�����
        //Map�������̽��� �������ִ� Entry��� �������̽��� �����ϰ��ִ� ��� ��ü���� �������̳ʾȿ����ٴ°�
        for (Map.Entry<String, Integer> entry : entries) {// entries�� �� �����̳��� �װ� �ϳ��ϳ������� entry����°�
            System.out.println(entry.getKey() + " : " + entry.getValue());
            //Map.Entry(���������̽����� entry�������̽�)��� �������̽����� �޼ҵ� 2�������ִ� getKey(), getValue()
            //String�� getKey()�� ������Ÿ�� ,Integer�� getValue()�� ������Ÿ������ ���׸����� ����
            //Entry�������̽��� �ᱹ �ʰ� ���� ������ �ϴ°��̴�
        }
    }
    static void iteratorUsingIterator(HashMap map){//���� ���ͷ����Ͱ���� set�� ��� ���ͷ����͸� ����
        /*Set entries = map.entrySet();*/
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> i = entries.iterator();//���� iterator�� ����������
        while(i.hasNext()){
            Map.Entry<String, Integer> entry = i.next();//Iterator i��� ���������̳ʿ��� �ϳ��ϳ������� 
            //Map.Entry������Ÿ���� entry��� �ν��Ͻ������� 
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
/*Iterator hi2 = B.iterator();
while(hi2.hasNext()){
    System.out.println(hi2.next());   
}    */