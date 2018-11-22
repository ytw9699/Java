package z_Collection_Framework;

import java.util.ArrayList;//임포트해야함

public class a_배열의한계_arraylist로 {
	
public static void main(String[] args) {
	
    String[] arrayObj = new String[2];//2개의 값만 들어간다
    arrayObj[0] = "one";
    arrayObj[1] = "two";
    // arrayObj[2] = "three"; 오류가 발생한다. 배열의 한계
    
    for(int i=0; i<arrayObj.length; i++){
        System.out.println(arrayObj[i]);
    }
    System.out.println();
    
    ArrayList al = new ArrayList();//몇개의 값이 들어가도 상관없다
    //어레이리스트 클래스를 이용
    al.add("one");
    al.add("two");
    al.add("three");
    System.out.println(al.get(0));
    System.out.println(al.get(1));
    System.out.println(al.get(2));
    System.out.println();
    //어레이리스트 클래스안의 add메소드
    /* public void add(Object element){//"one"을 object타입으로 저장
    //이 인자의 데이터타입은 오브젝트여야함 오브젝트는 모든 데이터
	//타입의 조상이기때문에 어떤 데이터타입도 수용하려면 이렇게 해야함
	}*/
    
    for(int i=0; i<al.size(); i++){
        String value = (String)al.get(i);//오브젝트를 스트링으로 형변환>>>
        System.out.println(value);
        }
    
    System.out.println();
    
    for(int i=0; i<al.size(); i++){
        System.out.println(al.get(i));
    }
    }
}