package r_enum상수;//과일이름뿐이아닌 기업이름에 대한 상수가 필요해졌을때 예시

public class ConstantDemo3 {
    // fruit
    private final static int APPLE = 1;
    private final static int PEACH = 2;
    private final static int BANANA = 3;
    // company
    private final static int GOOGLE = 1;
    //private final static int APPLE = 2;
    //final로 지정한 값을 못바꾼다는 의미로 보고싶은듯 뭐가永?이름이 충돌된다
    private final static int ORACLE = 3;
     
    public static void main(String[] args) {
        int type = APPLE;
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