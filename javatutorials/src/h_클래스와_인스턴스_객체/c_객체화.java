package h_클래스와_인스턴스_객체;
class Calculator{
	//클래스는 연관되어 있는 변수와 메소드의 집합이다
	//이 클래스 전체가 객체의 설계도 -변수,메소드
    int left, right;//인스턴스 변수
      
    public void setOprands(int left, int right){
        this.left = left; //this는 c1의 인스턴스를 가리키는거,인스턴스 자신
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left+this.right);
    }
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}
public class c_객체화 {
    public static void main(String[] args) {
         //클래스 : 설계도
    	//인스턴스 : 제품
        Calculator c1 = new Calculator();//c1이라는 변수에 new Calculator()객체를 생성해서 담음
        //c1에 담긴 실제 객체의 내용을 인스턴스(구체적인 객체)라함
        //클래스를 만든다는 것은 사용자 정의 데이터 타입을 만드는 것과 같은 의미다 c1은 데이터타입이 calculator임
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();       
          
        Calculator c2 = new Calculator();//재활용
        c2.setOprands(20, 40);
        c2.sum();       
        c2.avg();
        
        c1.sum();       
        c1.avg(); 
    }
}
/*변수를 다른 말로는 상태(state)라고도 표현한다. 
c1.sum의 결과는 30, c2.sum의 결과는 60인 것을 통해서 알 수 있듯이 
상태가 다른 객체를 대상으로 메소스를 실행시키면 다른 결과를 나타내게 된다.
메소드를 다른 말로는 행동(behave)라고도 표현한다.

변수 : 상태
메소드 : 행동
즉 하나의 클래스를 바탕으로 서로 다른 상태를 가진 인스턴스를 만들면 
서로 다른 행동을 하게 된다는 것을 알 수 있다. 하나의 클래스가 여러개의 
인스턴스가 될 수 있다는 점이 객체 지향이 제공하는 가장 기본적인 재활용성이라고 할 수 있다.*/

