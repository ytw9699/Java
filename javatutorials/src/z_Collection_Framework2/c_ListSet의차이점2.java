package z_Collection_Framework2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class c_ListSet의차이점2 {
   public static void main(String[] args) {
       ArrayList<String> al = new ArrayList<String>();
       al.add("one");
       al.add("two");
       al.add("two");
       al.add("three");
       al.add("three");
       al.add("five");
       System.out.println("array");
       Iterator ai = al.iterator();
       while(ai.hasNext()){
           System.out.println(ai.next());
       }
       HashSet<String> hs = new HashSet<String>();
       hs.add("one");
       hs.add("two");
       hs.add("two");
       hs.add("three");
       hs.add("three");
       hs.add("five");
       Iterator hi = hs.iterator();
       System.out.println("\nhashset");
       while(hi.hasNext()){
           System.out.println(hi.next());
/*   위의 결과를 통해서 알 수 있는 것처럼 Set는 중복을 허용하지 않고 순서가 없지만!
 * 그래서 인덱스를 활용한 get메소드가없다, 
   List는 중복을 허용하고 저장되는 순서가 유지된다는 것을 알 수 있다.get메소드있음 
   이러한 특징을 고려해서 컬렉션을 선택해야 한다*/
       }
   }
}