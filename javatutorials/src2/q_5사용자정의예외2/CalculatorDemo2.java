package q_5사용자정의예외2;
//직접 DivideException이라고 이름지어서 만들어보자
class DivideException extends Exception {
	//상속받는 예외클래스가 체크트 이셉션이라 trycatch나 throws를 사용해서 예외를 처리 해야함
  /*  DivideException(){//사실 기본생성자 없어도 상관없음  밑에서 객체를 만들때 생성자에 매개변수값집어넣기때문
        super();
    }*/
    DivideException(String message){
        super(message);//부모클래스 생성자호출 하면서 message값 매개변수로 전달
    }
}
class Calculator{
    int left, right;
    public void setOprands(int left, int right){        
        this.left = left;
        this.right = right;
    }
    public void divide(){//throws DivideException으로 넘겨버리거나 아래처럼하면됨
        if(this.right == 0){
            try {
				throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");
			} catch (DivideException e) {
				e.printStackTrace();
			}
        }
        System.out.print(this.left/this.right);
    }
}
public class CalculatorDemo2 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
    }
}