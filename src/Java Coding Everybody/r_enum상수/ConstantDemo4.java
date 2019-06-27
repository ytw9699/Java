package r_enum상수;

public class ConstantDemo4 {
    // fruit
    private final static int FRUIT_APPLE = 1;//접두사로 이름이충돌을해결
    private final static int FRUIT_PEACH = 2;
    private final static int FRUIT_BANANA = 3;
    // company
    private final static int COMPANY_GOOGLE = 1;
    private final static int COMPANY_APPLE = 2;
    private final static int COMPANY_ORACLE = 3;
/*   이름이 중복될 확률을 낮출 수 있다. 이러한 기법을 네임스페이스라고 한다. 
          그런데 상수가 너무 지저분하다
          좀 깔끔하게 바꿀 수 없을까? 이럴 때 인터페이스를 사용할 수 있다.*/
    public static void main(String[] args) {
        int type = FRUIT_APPLE;
        switch(type){
            case FRUIT_APPLE:
                System.out.println(57+" kcal");
                break;
            case FRUIT_PEACH:
                System.out.println(34+" kcal");
                break;
            case FRUIT_BANANA:
                System.out.println(93+" kcal");
                break;
        }
    }
}