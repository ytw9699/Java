package n_abstract추상화;
/*abstract란 한국어로는 추상으로 번역된다. 
상속을 강제하는 일종의 규제라고 생각하자. 
즉 클래스나 메소드를 사용하기 위해서는 반드시
상속해서 사용하도록 강제하는 것이 abstract다.
그리고 추상메소드를 반드시 오버라이드 해야함
*/
abstract class A{
    public abstract int b();
    //추상 메소드란 메소드의 시그니처만이 정의된 비어있는 메소드를 의미한다. 
    //이 메소드의 구체적인 구현은 하위 클래스에서 오버라이딩 해야 한다는 의미다.
    //추상 메소드를 하나라도 포함하고 있는 클래스는 추상 클래스가 되고, 
    //자연스럽게 클래스의 이름 앞에 abstract가 붙는다
    //public abstract int c(){System.out.println("Hello")}
    //본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
    public void d(){ //추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다. 
        System.out.println("world");
    }
}
class B extends A{//1.클래스 B는 클래스 A를 반드시! 상속했다.상속은 하나만 가능!
	//그리고 2.클래스 A의 추상 메소드인 메소드 b를 반드시 오버라이딩하고 있다. 
	//그 결과 클래스 A를 사용할 수 있었다.
    public int b(){
    return 1;
 }
}
public class AbstractDemo {
    public static void main(String[] args) {
    	B obj = new B();
        System.out.println(obj.b());
    }
}