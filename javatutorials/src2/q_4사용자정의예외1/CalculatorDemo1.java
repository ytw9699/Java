package q_4사용자정의예외1;
//직접 DivideException이라고 이름지어서 만들어보자
class DivideException extends RuntimeException {
	//상속받는 예외클래스가 런타임이셉션클래스라는것은 
	// 언체크트 이셉션이라 굳이 
 //trycatch나 throws를 사용해서 예외를 처리 안해도됨
    DivideException(){// 밑에 매개변수들어간 생성자 만들어서 기본 생성자 만들어줌
        super();//이건 부모클래스 생성자호출
    }
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
    public void divide(){
        if(this.right == 0){
            throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");//이건그냥 예외만발생시키고 잡은건아님!
        }
        System.out.print(this.left/this.right);
    }
}
public class CalculatorDemo1 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
    }
}