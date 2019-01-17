package r_enum상수;
//상수는 변하지 않는 값이다. 아래에서 좌항이 변수이고 우항이 상수이다.
//int x = 1;//상수는 변하지 않는 특성 그걸 이용해보자
public class ConstantDemo {
    public static void main(String[] args) {
        /*//이설명서를 지워버리면..숫자가 의미하는걸 모르게됨
         * 1. 사과
         * 2. 복숭아
         * 3. 바나나
         */
    	//위코드와 아래코드가 멀리떨어져있다면 문제발생
        int type = 1;//사과
        switch(type){
            case 1:
                System.out.println(57);//칼로리57이출력
                break;
            case 2:
                System.out.println(34);
                break;
            case 3:
                System.out.println(93);
                break;
        }
    }
}
/*위와 같은 로직에서 숫자 1에 해당하는 과일은 언제나 사과여야 한다. 
그러므로 변하지 않는 값인 상수값에 따라서 그 값에 해당하는 과일의 의미를 고정하고 있다.
그런데 주석으로 상수의 의미를 전달하고 있지만 주석이 없어졌거나, 
주석이 상수를 사용하는 코드와 멀어진다면 각 숫자에 해당하는 과일이 무엇을 나타내는지 
알아보기거 어렵거나 불가능해질 수 있다.*/