package q_2예외던지기4;
import java.io.*;
class B{
    void run(){
        BufferedReader bReader = null;
        String input = null;
        try {
            bReader = new BufferedReader(new FileReader("out.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try{
            input = bReader.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }       
        System.out.println(input); 
    }
}
class C{
    void run(){
        B b = new B();
        b.run();//여기서 예외처리하게 넘길수있음
    }
}
public class ThrowExceptionDemo {
    public static void main(String[] args) {
         C c = new C();
         c.run();//여기서도 예외처리하게 넘길수있음
    }   
}