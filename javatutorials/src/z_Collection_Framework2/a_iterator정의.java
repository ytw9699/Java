package z_Collection_Framework2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
public class a_iterator정의 {
   public static void main(String[] args) {
	   //ArrayList<Integer> A = new ArrayList<Integer>();
	   //HashSet<Integer> A = new HashSet<Integer>();
	   //Collection<Integer> A = new ArrayList<Integer>();
	   Collection<Integer> A = new HashSet<Integer>();
	   //Collection 인터페이스를 구현한것이라 다형성 가능
       A.add(1);
       A.add(2);
       A.add(3); 
       Iterator hi = A.iterator();
       while(hi.hasNext()){//hi컨테이너에 값들이 존재하는지 확인
           System.out.println(hi.next());//가상컨테이너 값중에 하나를 리턴하고 삭제
       }
     //A=1,2,3을 가진 컨테이너고 
     //hi는 이것과 똑같이 1,2,3을 가진 가상의 컨테이너를 생성한것이라고 봐보자
       
   /* iterator는 반복자
   	iteration은 반복
    java.util.iterator//iterator는 인터페이스!
   	컨테이너에 담긴값들을 하나하나꺼내서 하나하나 어떤처리를 해주도록하는 역할
     메소드 iterator는 인터페이스 Collection에 정의되어 있다. 
    따라서 Collection을 구현하고 있는 모든 컬렉션즈 프레임웍크는 이 메소드를 구현하고 있음을 보증한다.
     메소드 iterator의 호출 결과는 인터페이스 iterator를 구현한 객체를 리턴한다.
      인터페이스 iterator는 아래 3개의 메소드를 구현하도록 강제하고 있는데 각각의 역할은 아래와 같다.
   hasNext: 반복할 데이터가 더 있으면 true, 더 이상 반복할 데이터가 없다면 false를 리턴한다.
   next: hasNext가 true라는 것은 next가 리턴할 데이터가 존재한다는 의미다. 
   이러한 기능을 조합하면 for 문을 이용하는 것과 동일하게 데이터를 순차적으로 처리할 수 있다.
   */
   }
}