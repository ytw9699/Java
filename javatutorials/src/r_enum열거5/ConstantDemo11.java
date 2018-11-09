package r_enum열거5;
class Fruit2{
public static final Fruit2 APPLE  = new Fruit2();
public static final Fruit2 PEACH  = new Fruit2();
public static final Fruit2 BANANA = new Fruit2();
}
enum Fruit{//열거이해안됨..다시 처음부터다..
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    private String color;
    Fruit(String color){
        System.out.println("Call Constructor "+this);
        this.color = color;
    }
    String getColor(){
        return this.color;
    }
}
enum Company{
    GOOGLE, APPLE, ORACLE;
}
public class ConstantDemo11 {
    public static void main(String[] args) {
    	System.out.println(Fruit2.APPLE);
    	System.out.println(Fruit.APPLE);
        for(Fruit f : Fruit.values()){//Fruit.values()는 이넘클래스의 메소드
            System.out.println(f+", "+f.getColor());//enum은 맴버 전체를 열거 할 수 있는 기능도 제공한다.
        }
    }
}
/*String[] members2 = { "최진혁2", "최유빈2", "한이람2" };
for (String e : members2) {//콜론뒤 멤버스의 데이터에 담겨있는 값들을 하나씩 반복문이 동작할때마다
	//꺼내서 e라고 하는 변수에 담아주도록 약속됨
    System.out.println(e + "이 상담을 받았습니다");
}*/
/*열거형의 특성을 정리해보자.
마치 배열처럼 상수데이터를 가지고있는 배열을 만드는것뿐아니라 배열처럼 상수들을 하나하나꺼낼수있음
열거형은 연관된 값들을 저장한다. 
또 그 값들이 변경되지 않도록 보장한다.
뿐만 아니라 열거형 자체가 클래스이기 때문에 열거형 내부에 생성자, 
필드, 메소드를 가질 수 있어서 단순히 상수가 아니라 더 많은 역할을 할 수 있다.클래스역할+@*/