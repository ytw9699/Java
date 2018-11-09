package q_7오브젝트클래스1;

class a {

}
//위의 코드는
//아래와 같다
// class O extends Object {} 

/*자바에서 모든 클래스는 사실 Object를 암시적으로 상속받고 있는 것이다. 
그런 점에서 Object는 모든 클래스의 조상이라고 할 수 있다. 
그 이유는 모든 클래스가 공통으로 포함하고 있어야 하는 기능을 제공하기 위해서다.
http://docs.oracle.com/javase/7/docs/api/java/lang/Object.html
위의 그림은 Object 클래스가 가지고 있는 메소드를 보여준다. 
다시 말해서 자바의 객체는 위의 메소드들을 반드시 가지고 있다고 할 수 있다.
 이 중에 중요하면서 입문 단계에서 이해할 수 있는 API들을 살펴보자
*/