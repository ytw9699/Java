package q_1예외문법1;

import java.io.IOException;

//오류를 처리하는것이 예외라고 일단 생각
class Calculator2{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    } 
    public void divide(){
    	try {//계산결과는 오류가 발생했습니다 : / by zero
    		//try안에는 예외의 발생이 예상되는 로직을 배치
        System.out.print("계산결과는 ");
        System.out.print(this.left/this.right);
        System.out.print(" 입니다.");
    	}catch(Exception e){//예외가 try안에서 잡히면 그 에러에 대한정보를 담고있는 객체를 매개변수 e로전달함! 
    		//그 객체의 데이터타입은 exception이라는 클래스
    		//catch안에는 예외가발생했을때 실행되는 로직이 들어옴
    		System.out.println("오류가 발생했습니다 : "+e.getMessage());//이셉션 안에 겟메소드 호출하면
    		//에러에 대한 정보 리턴 : /by zero
    	}// Exception은 자바에서 기본적으로 제공하는 클래스로 java.lang에 소속
    }
} 


try {
	input = bReader.readLine();
} catch (IOException e) {//예외를 강제해서 내가처리하는것
	System.out.println("오류가 발생했습니다 : ");
	e.printStackTrace();
}//파일에 있는걸 읽어들임


public class CalculatorDemo2 {
    public static void main(String[] args) {
        Calculator2 c1 = new Calculator2();
        c1.setOprands(10, 0);
        c1.divide();
    }
}
//계산결과는 Exception in thread "main" java.lang.ArithmeticException: / by zero
												//수학적인 예외발생