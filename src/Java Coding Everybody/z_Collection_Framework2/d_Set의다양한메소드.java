package z_Collection_Framework2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class d_Set의다양한메소드 {
public static void main(String[] args) {
	//수학에서의 집합(밴다이어그램)과 이 set의 의미는 같다 프로그래밍화한것
	//집합안에들어가는 값은 중복을 허용안함
    HashSet<Integer> A = new HashSet<Integer>();
    A.add(1);
    A.add(2);
    A.add(3);
     
    HashSet<Integer> B = new HashSet<Integer>();
    B.add(3);
    B.add(4);
    B.add(5);
     
    HashSet<Integer> C = new HashSet<Integer>();
    C.add(1);
    C.add(2);
     
    System.out.println(A.containsAll(B));
    // false//B는A의 부분집합(SUBSET)이아니다//A안에 B전체가 들어있지않아서 FALSE
    //A의 메소드 containsAll
    //A라는 집합에 B라는 집합의 전체 원소가 담겨있는가
    System.out.println(A.containsAll(C));
    // true//C는 A의 부분집합이다//A안에C전체가 들어있어서 TRUE
     
    A.addAll(B);//B전체를 A에 합한다 합집합
    //A.retainAll(B);//retain은 간직하다라는뜻 A에도 있고 B에도있는거를 A에 담겠다 교집합
    //A.removeAll(B);//차집합//A집합에있는값중에 B에 있는거를 빼겠다
    Iterator hi = A.iterator();
    while(hi.hasNext()){
        System.out.println(hi.next());
    }
}
}
//https://prashantgaurav1.files.wordpress.com/2013/12/java-util-collection.gif
