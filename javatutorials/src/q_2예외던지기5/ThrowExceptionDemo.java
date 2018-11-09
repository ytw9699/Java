package q_2예외던지기5;
import java.io.*;
class B{
    void run() throws IOException, FileNotFoundException{
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input);
    }
}
class C{
    void run(){
        B b = new B();
        try {
			b.run();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
        catch(IOException e) {
			e.printStackTrace();
		}//여기서 예외처리하게 넘길수있음
    }
}
public class ThrowExceptionDemo {
    public static void main(String[] args) {
         C c = new C();
         c.run();//여기서도 예외처리하게 넘길수있음
    }   
}