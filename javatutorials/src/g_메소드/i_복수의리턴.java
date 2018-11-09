package g_메소드;
public class i_복수의리턴 {
 
    public static String[] getMembers() {//리턴값이 String[] 배열
        String[] members = { "최진혁", "최유빈", "한이람" };
        //members변수는 문자열을 담을수있는 배열
        return members;//리턴한번하지만 배열안에 여러개의 값이 들어감
    }
  //메소드 getMembers가 리턴한 배열을 members 변수에 담았다. 
    //이 변수를 이용해서 여러 개의 데이터를 처리 할 수 있게 된다.
 
    public static void main(String[] args) {
        String[] members2 = getMembers();//
        //String[]배열의 데이터타입을 가지고 있는 members2라는 변수에
        //반환한 members라는 값이 담긴다
        
        for(int i=0; i<members2.length; i++ ) {//length는 3
        	String member = members2[i];// 0 1 2
        System.out.println(member);
        }
     
    }
 
}