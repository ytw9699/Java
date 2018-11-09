package g_메소드;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/*굳이 이렇게 복잡하게 데이터를 리턴하는 이유는 무엇일까?
내용을 화면에 출력하는 것은 동일하지 않은가?
결론적으로 말하면 부품으로서의 가치를 높이기 위해서라고 할 수 있다. 
만약 여러분이 이 메소드가 출력한 값을 화면에 출력하는 것이 아니라 파일에 기록하고 싶다면 어떻게 해야 할까?
또는 이메일로 보내고 싶다면 어떻게 해야 할까?
3개의 메소드를 만들고 용도에 따라서 코드를 재작성하는 것도 좋은 방법이다. 
하지만 더 좋은 방법은 숫자를 출력하고, 숫자를 파일에 기록하고, 
숫자로 이메일을 보내는 작업으로부터 숫자를 계산하는 로직을 분리하는 것이다.
numbering은 자신이 어떻게 사용될지 모른다. 
누구든지 numbering이라는 메소드를 호출할 때 초기값과 마지막 값을 입력하면
numbering은 숫자를 문자열의 형태로 반환하면 되는 것이다. */
public class e_메소드의출력값활용 {
    public static String numbering(int init, int limit) {
        int i = init;
        String output = "";
        while (i < limit) {
            output += i;
            i++;
        }
        return output;
    }
    public static void main(String[] args) {
        String result = numbering(1, 5);
        System.out.println(result);
        try { 
            // 다음 행은 out.txt 라는 파일에 numbering이라는 메소드가 반환한 값을 저장합니다.
        	//이렇게 다양하게 사용이 가능하니까 return이 필요한거
            BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));//특정경로가없으면 src밑에생기는듯
            out.write(result);
            out.close();
        } catch (IOException e) {
        }
    }
}
