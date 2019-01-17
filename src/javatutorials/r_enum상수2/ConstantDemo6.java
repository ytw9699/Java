package r_enum상수2;
class Fruit{//인터페이스에서 클래스로 바꿨기때문에 아래처럼써준다
    public static final Fruit APPLE  = new Fruit();//자기자신의 인스턴스를 상수로지정
    public static final Fruit PEACH  = new Fruit();
    public static final Fruit BANANA = new Fruit();
//각각의 인스턴스르 넣음 그얘기는 apple,peach,BANANA가 모두 다른값인 데이터이다 다른인스턴스니까 
  //하지만 같은 Fruit라는 데이터타입을 가짐
}
class Company{
    public static final Company GOOGLE = new Company();
    public static final Company APPLE = new Company();
    public static final Company ORACLE = new Company();
    //private Company() {}//다른곳에서 이 클래스 객 체생성을 못하게함
}
public class ConstantDemo6 {
     
public static void main(String[] args) {
	
   /* if(Fruit.APPLE == Company.APPLE){//데이터타입이 다르기때문에 비교자체가불가능!
    System.out.println("과일 애플과 회사 애플이 같다.");
    }*/
/*int type = FRUIT.APPLE;
switch(type){//스위치문 조건에 들어가는 값은 내가만든 클래스 못집어넣는다 if문은 가능
    case FRUIT.APPLE:
        System.out.println(57+" kcal");
        break;
    case FRUIT.PEACH:
        System.out.println(34+" kcal");
        break;
    case FRUIT.BANANA:
        System.out.println(93+" kcal");
        break;*/
            
/*switch 문을 사용할 때 한가지 주의 할 것은 switch의 조건으로는 
몇가지 제한된 데이터 타입만을 사용할 수 있다. 래퍼클래스인
byte, short, char, int, enum, String, Character, Byte, Short, Integer*/
    }
}


