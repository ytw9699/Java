package z_Collection_Framework2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class b_ListSet��������1 {
   public static void main(String[] args) {
	   ArrayList<Integer> A = new ArrayList<Integer>();//�ߺ��Ȱ��� ����Ѵ�
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
   HashSet<Integer> B = new HashSet<Integer>();//�ߺ��� ���� ������� �ʴ´�
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