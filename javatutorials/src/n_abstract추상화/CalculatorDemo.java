package n_abstract추상화;
/*추상 클래스는 상속을 강제하기 위한 것이다. 즉 부모 클래스에는 메소드의 시그니처만 정의해놓고
그 메소드의 실제 동작 방법은 이 메소드를 상속 받은 하위 클래스의 책임으로 위임하고 있다*/
abstract class Calculator{//추상클래스
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    } 
    public abstract void sum();//추상메소드 
    public abstract void avg();//추상메소드 
    public void run(){//추상메소드가 아님
        sum();
        avg();
    }
    int _sum() {//접근제어자가 존재안함 default 접근제어자임 같은패키지에서만 사용가능
    	return this.left + this.right;
    }
}
class CalculatorDecoPlus extends Calculator {
    public void sum(){//오버라이딩
        System.out.println("+ sum :"+ _sum());//중복의제거
    }
    public void avg(){//오버라이딩
        System.out.println("+ avg :"+(this.left+this.right)/2);
    }
} 
class CalculatorDecoMinus extends Calculator {
    public void sum(){//오버라이딩
        System.out.println("- sum :"+(this.left+this.right));//중복제거안함
    }
    public void avg(){//오버라이딩
        System.out.println("- avg :"+(this.left+this.right)/2);
    }
} 
public class CalculatorDemo {
    public static void main(String[] args) { 
        CalculatorDecoPlus c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);
        c1.run();
         
        CalculatorDecoMinus c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);
        c2.run();
    }
}