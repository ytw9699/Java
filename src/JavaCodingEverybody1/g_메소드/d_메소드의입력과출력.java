package g_메소드;
//메소드는 작은 프로그램으로서 입력과 출력의 관계를 보여준다
//(1, 5)라는 인자 파라미터 입력값을주면 !  output이 출력값이 되는것 
//return은 메소드의 출력과 연관//메소드를  동작해서 그 결과를 밖으로 돌려준다는 개념
public class d_메소드의입력과출력 {
public static String numbering(int init, int limit) {
	//여기서 String은 이 메소드가 리턴할 값이 반드시 문자열이다라는것
    //String a; 변수a는 문자열타입이다 라고 하는것과 동일 
	//String numbering
	int i = init;
    // 만들어지는 숫자들을 output이라는 변수에 담기 위해서 변수에 빈 값을 주었다.안주면 오류
    String output = "";
    while (i < limit) {
        // while문 내부에서 숫자를 화면에 출력하는 대신 변수 output에 담았다.
    	//System.out.println(i);//이렇게하는거 대신
        output += i;//output=output+i;
        i++;
    }
    //중요!!! output에 담겨 있는 문자열을 메소드 외부로 반환하려면
    //아래와 같이 return 키워드 뒤에 반환하려는 값을
    //배치하면 된다.
    return output;//리턴에서 프로그램 반드시 종료!
    //리턴뒤에오는 output의 값을 메소드의 출력값으로 외부로 반환! 
}
    public static void main(String[] args) {//void는 빈공간뜻, 리턴값이 존재안한다
    	//그래서 메소드안에는 return이없는거
        //메소드 numbering이 리턴한 값이 변수 result에 담긴다.
        String result = numbering(1, 5);//입력과
        //변수 result의 값을 화면에 출력한다.
        System.out.println(result);//1234 출력
    }
}
//메소드가 리턴 할 값을 명시함으로서 numbering이라는 메소드는 반드시 문자열의 값을
//리턴한다는 것을 보장할 수 있는 장점이 있다. 단점은 유연성이 없음
