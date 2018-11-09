package q_3예외만들기5;

import java.io.IOException;

public class a{
    void throwArithmeticException(){
        throw new ArithmeticException();//이거는 빨간줄이안뜨는데..
        //왜냐면 부모중에 RuntimeException이 있어 언체크트 이셉션이라 굳이 
    }  //trycatch나 throws를 사용해서 예외를 처리 안해도됨
    void throwIOException(){
      //  throw new IOException();//하지만 이거는뜬다..왜일까 
    //	예외처리를 강제하기때문
    }//즉 IOException은 부모중에 RuntimeException이 없으면 checked이셉션이라함
    //checked는 반드시  trycatch나 throws를 사용해서 예외를 처리해야함,아니면 던지기하던가

}
class bb{
    void throwArithmeticException(){
        throw new ArithmeticException();
    }
    void throwIOException1(){
        try {
            throw new IOException();//예외발생시키고
        } catch (IOException e) {//잡고
            e.printStackTrace();
        }
    } 
    void throwIOException2() throws IOException{//1.미리 잡지않고 던지고
        throw new IOException();//2.예외발생시키고
    }
}
