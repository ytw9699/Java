package r_enum상수;

public class ConstantDemo2 {//final은 바뀌지않는 상수이다라고 정의
    private final static int APPLE = 1;//전역변수이자 클래스(static)변수이자, 상수 바뀌지않음
    public final static int PEACH = 2;//private이나, public 나 상관없음
    private final static int BANANA = 3;
    public static void main(String[] args) {
        int type = APPLE;//상수를 사용
        switch(type){//주석이없더라도 이름만보면 대충알수있는장점
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
/*이런 때는 이름이 있다면 더 좋을 것이다. 
변수도 상수가 될 수 있다. 변수를 지정하고 
그 변수를 final로 처리하면 한번 설정된 변수의 값은 더 이상 바뀌지 않는다.
또한 바뀌지 않는 값이라면 인스턴스 변수가 아니라 클래스 변수(static)로 지정하는 것이 더 좋을 것이다.*/