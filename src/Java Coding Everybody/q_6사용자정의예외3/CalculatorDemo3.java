package q_6사용자정의예외3;
//직접 DivideException이라고 이름지어서 만들어보자
class DivideException extends Exception {
	public int left;
	public int right;
    DivideException(String message){
        super(message);
    }
    DivideException(String message, int left, int right){//이렇게 추가적인 정보를 준다
    	super(message);
    	this.left= left;
    	this.right= right;
    }
}
class Calculator{
    int left, right;
    public void setOprands(int left, int right){        
        this.left = left;
        this.right = right;
    }
    public void divide()throws DivideException{//2.여기서 발생한 예외를 던져서
        if(this.right == 0){
        throw new DivideException("0으로 나눌수없습니다.",this.left,this.right);//1.
        //이렇게 추가적인 정보를 준다
        }
        System.out.print(this.left/this.right);//발생안하면 이게실행되는듯
    }
}
public class CalculatorDemo3 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        try {
			c1.divide();//3.여기서잡히는거임
		} catch (DivideException e) {
			e.printStackTrace();
			 System.out.print(e.left);//이렇게 추가적인 정보를 준다
			 System.out.print("/");//이렇게 추가적인 정보를 준다
			 System.out.print(e.right);//이렇게 추가적인 정보를 준다
		}
    }
}