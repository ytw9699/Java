package f_배열;

//반복문과 + 배열 뗄수없는관계
public class d_배열과반복문의조화_foreach {
 
public static void main(String[] args) {
 
    String[] members = { "최진혁", "최유빈", "한이람" };
    System.out.println(members.length);
    for (int i = 0; i < members.length; i++) {//초기화,반복조건,반복실행
        /* String member = members[i];
        System.out.println(member + "이 상담을 받았습니다");*/
        System.out.println(members[i] + "이 상담을 받았습니다");
    }
    
	String[] members2 = { "최진혁2", "최유빈2", "한이람2" };
    for (String e : members2) {//콜론뒤 멤버스의 데이터에 담겨있는 값들을 하나씩 반복문이 동작할때마다
    	//꺼내서 e라고 하는 변수에 담아주도록 약속됨
        System.out.println(e + "이 상담을 받았습니다");
    }
    int[] member3= { 1,2,3 };
	for (int e : member3) {
		System.out.println(e);			
	}
  }
}
