package f_배열;
public class a_배열과그룹핑 {
    public static void main(String[] args) {
   //배열(Array)은 연관된 정보를 그룹핑 하는데 사용한다
   //배열은 연관된 데이터를 모아서 관리하기 위해서 사용하는 데이터 타입이다.
   //변수가 하나의 데이터를 저장하기 위한 것이라면 
   //배열은 여러 개의 데이터를 저장하기 위한 것이라고 할 수 있다.
   String classGroup1 = "최진혁";
  
   String a = new String("최진혁2");
   
   String[] classGroup2 = { "최진혁", "최유빈", "한이람", "이고잉" };
   //String[]은 classGroup2에 담을 배열에 담길 데이터의 타입이 문자열의 배열이라는 의미다. 
   //배열을 선언할 때는 데이터 타입 뒤에 []를 붙여야 한다.
   String classGroup3[] = { "최진혁", "최유빈", "한이람", "이고잉" };
   
   String[] classGroup4 = new String[] { "최진혁", "최유빈", "한이람", "이고잉" };
   	
   System.out.println(classGroup1);
   System.out.println(a);
   System.out.println(classGroup2);
   System.out.println(classGroup3);
   System.out.println(classGroup4);
    }
}