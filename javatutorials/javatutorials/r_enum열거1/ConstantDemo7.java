package r_enum열거1;
/*enum은 열거형(enumerated type)이라고 부른다.어떠한 정보를 열거할수있다
열거형은 서로 연관된 상수들의 집합이라고 할 수 있다.바뀌지않는 값들의 집합 
배열은 서로 연관된 값들의 집합
위의 예제에서는 Fruit와 Company가 말하자면 열거인 셈이다
열거라는 특성을 자바에서 문법적으로 지원하는 형태가  enum이다
*/
//enum은 class, interface와 동급의 형식을 가지는 단위다. 하지만 enum은 사실상 class이다
/*class Fruit{
public static final Fruit APPLE  = new Fruit();
public static final Fruit PEACH  = new Fruit();
public static final Fruit BANANA = new Fruit();
}*/
//위와 아래는 같음 위 패턴을 자주쓰니까 자바에서 문법적으로 간단하게 enum만듬
enum Fruit{//Fruit이게 위 클래스임
    APPLE, PEACH, BANANA;
}
/*class Fruit{
private Fruit(){}//생성자의 접근 제어자가 private이다. 
//그것이 클래스 Fruit를 다른클래스에서 인스턴스로 만들 수 없다는 것을 의미한다.
// 다른 용도로 사용하는 것을 >금지하고 있는 것이다. 
public static final Fruit APPLE  = new Fruit();
public static final Fruit PEACH  = new Fruit();
public static final Fruit BANANA = new Fruit();
}*/
enum Company{
    GOOGLE, APPLE, ORACLE;
}
public class ConstantDemo7 {
    public static void main(String[] args) {
    	/*
    	if(Fruit.APPLE == Company.APPLE){//컴파일에러발생
    	    System.out.println("과일 애플과 회사 애플이 같다.");
    	}
    	*/
        Fruit type = Fruit.APPLE;
        switch(type){
            case APPLE://Fuit.APPLE인데 앞에 Fuit. 생략하도록 약속 , 더 간결
                System.out.println(57+" kcal");
                break;
            case PEACH:
                System.out.println(34+" kcal");
                break;
            case BANANA:
                System.out.println(93+" kcal");
                break;
        } 
    }
}
/*enum을 사용하는 이유를 정리하면 아래와 같다.
코드가 단순해진다.
인스턴스 생성과 상속을 방지한다.public static final Fruit PEACH  = new Fruit();
키워드 enum을 사용하기 때문에 구현의 의도가 열거임을 분명하게 나타낼 수 있다.*/
