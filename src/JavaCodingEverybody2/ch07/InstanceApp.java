package ch07;
	import java.io.IOException;
	import java.io.PrintWriter;

public class InstanceApp {
 
    public static void main(String[] args) throws IOException{
         
        PrintWriter p1 = new PrintWriter("result1.txt");//PrintWriter의 복제본 인스턴스를 만들어 p1에 담음
        p1.write("Hello 1");
        p1.close();
         
        PrintWriter p2 = new PrintWriter("result2.txt");
        p2.write("Hello 2");
        p2.write("Hello 22");//이렇게 인스터스를 만들면 아래 주석처리한거과 같이 result2.txt를 계속해서 써넣을 필요가없다.
        //즉 어떤파일을 수정할지에 대한 상태를 계속 얘기할필요가없다.
        //Math와 달리 일회용이 아님 math는 생성자 없음 PrintWriter는 생성자있음!여러 생성자를 통해 인스터스를 만들수있음
        p2.close();
        
         
//      PrintWriter.write("result1.txt", "Hello 1");    
//      PrintWriter.write("result2.txt", "Hello 2");
//      PrintWriter.write("result1.txt", "Hello 1");    
//      PrintWriter.write("result2.txt", "Hello 2");
//      PrintWriter.write("result1.txt", "Hello 1");    
//      PrintWriter.write("result2.txt", "Hello 2");
//      PrintWriter.write("result1.txt", "Hello 1");    
//      PrintWriter.write("result2.txt", "Hello 2");
//      PrintWriter.write("result1.txt", "Hello 1");    
//      PrintWriter.write("result2.txt", "Hello 2");
//      PrintWriter.write("result1.txt", "Hello 1");    
//      PrintWriter.write("result2.txt", "Hello 2");
//      PrintWriter.write("result1.txt", "Hello 1");    
//      PrintWriter.write("result2.txt", "Hello 2");
    }
 
}