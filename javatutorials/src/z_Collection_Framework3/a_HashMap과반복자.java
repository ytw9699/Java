package z_Collection_Framework3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class a_HashMap과반복자 {
    public static void main(String[] args) {
    	
        HashMap<String, Integer> a = new HashMap<String, Integer>();
        //key 와 value로 어떠한 값을쓸것인지 제네릭으로 지정
        a.put("one", 1);//put메소드는  맵 인터페이스에만 존재
        a.put("two", 2);//첫번째 인자는 key,두번째는 value
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
        
        //맵에 저장된 값들을 하나식 열거해서 꺼내는 반복처리방법에 대해 알아보자
        iteratorUsingForEach(a);//2가지 방식의 반복 처리 방법
        iteratorUsingIterator(a);
    }
    //맵자체에는 interation기능이 없어서 이렇게 우회적으로하는거
    static void iteratorUsingForEach(HashMap map){
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        							//맵인터페이스에  entrySet()이라는 메소드가 있음
        //entrySet()은 set데이터타입의 객체를 리턴해서 entrise라는 변수에 담는다
        //그 변수에 담긴것들은 Map.Entry데이터타입의 객체들이담겨있는거 //결국 맵안의 객체들을 셋으로 옮겨담은거
        //Map인터페이스가 가지고있는 Entry라는 인터페이스를 구현하고있는 어떠한 객체들이 셋컨테이너안에들어간다는거
        for (Map.Entry<String, Integer> entry : entries) {// entries는 셋 컨테이너임 그걸 하나하나꺼내서 entry에담는거
            System.out.println(entry.getKey() + " : " + entry.getValue());
            //Map.Entry(맵인터페이스안의 entry인터페이스)라는 인터페이스에는 메소드 2가지가있다 getKey(), getValue()
            //String은 getKey()의 데이터타입 ,Integer는 getValue()의 데이터타입으로 제네릭으로 지정
            //Entry인터페이스가 결국 맵과 같은 역할을 하는것이다
        }
    }
    static void iteratorUsingIterator(HashMap map){//맵은 이터레이터가없어서 set을 얻고 이터레이터를 얻자
        /*Set entries = map.entrySet();*/
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> i = entries.iterator();//셋은 iterator를 가지고있음
        while(i.hasNext()){
            Map.Entry<String, Integer> entry = i.next();//Iterator i라는 가상컨테이너에서 하나하나꺼내서 
            //Map.Entry데아터타입의 entry라는 인스턴스에담음 
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
/*Iterator hi2 = B.iterator();
while(hi2.hasNext()){
    System.out.println(hi2.next());   
}    */