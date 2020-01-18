package r_enum열거2;//enum은 사실 클래스다. 그렇기 때문에 생성자를 가질 수 있다.
/*class Fruit{
public static final Fruit APPLE  = new Fruit();
public static final Fruit PEACH  = new Fruit();
public static final Fruit BANANA = new Fruit();
}*/
enum Fruit{
    APPLE, PEACH, BANANA;//객체만들때마다 생성자 호출
    Fruit(){//생성자   //public Fruit로 안됨 private만!
    System.out.println("Call Constructor "+this);//this는 생성자를 대표할수있는 정보
    }
}
enum Company{
    GOOGLE, APPLE, ORACLE;
}
public class ConstantDemo8 {
    public static void main(String[] args) {
        /*
        if(Fruit.APPLE == Company.APPLE){
            System.out.println("과일 애플과 회사 애플이 같다.");
        }
        */
        Fruit type = Fruit.APPLE;
        switch(type){
            case APPLE:
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