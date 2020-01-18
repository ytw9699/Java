package q_2예외던지기1;
import java.io.*;
public class CheckedExceptionDemo {
   /* public static void main(String[] args) {
        BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
        String input = bReader.readLine();
        System.out.println(input); 
    }*/
}
/*Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	Unhandled exception type FileNotFoundException
	Unhandled exception type IOException*/

/*Throws는 한국어로는 '던지다'로 번역된다. 
위의 내용은 생성자 FileReader의 인자 fileName의 
값에 해당하는 파일이 디렉토리이거나 어떤 이유로 사용할 수 없다면
FileNotFoundException을 발생시킨다는 의미다.
이것은 FileReader의 생성자가 동작할 때 파일을 열 수 없는 경우가 생길 수 있고, 
이런 경우 생성자 FileReader에서는 이 문제를 처리할 수 없기 때문에 이에 대한
처리를 생성자의 사용자에게 위임하겠다는 의미다. 그것을 던진다(throw)고 표현하고 있다.
따라서 API의 사용자 쪽에서는 예외에 대한 처리를 반드시 해야 한다는 의미다. 
따라서 아래와 같이 해야 FileReader 클래스를 사용할 수 있다.*/