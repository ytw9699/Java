package z_Collection_Framework2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class b_ListSet의차이점1 {
   public static void main(String[] args) {
	   ArrayList<Integer> A = new ArrayList<Integer>();//중복된값을 허용한다
       A.add(1);
       A.add(2);
       A.add(2);
       A.add(2);
       A.add(2);
       A.add(3);
       
       Iterator hi = A.iterator();
       while(hi.hasNext()){
           System.out.println(hi.next());
       }
       System.out.println();
       
   HashSet<Integer> B = new HashSet<Integer>();//중복된 값을 허용하지 않는다
   B.add(1);
   B.add(2);
   B.add(2);
   B.add(2);
   B.add(2);
   B.add(3);
   
   /*Iterator<Integer> hi2 = B.iterator();*/
   Iterator hi2 = B.iterator();
   while(hi2.hasNext()){
       System.out.println(hi2.next());   
   }    
   }
}