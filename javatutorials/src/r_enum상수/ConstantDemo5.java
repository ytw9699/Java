package r_enum상수;

interface FRUIT{//이렇게 문법적인걸로해결하면 더좋은거
    int APPLE=6, PEACH=2, BANANA=3;
    /*
    public final static int APPLE = 6;
    public final static int PEACH = 2;
    public final static int BANANA = 3;
    */
    //이것과 같은 의미 인터페이스에서 변수선언은 이렇게 생략됨
}
/*접미사(FRUIT_, COMPANY_)로 이름을 구분했던 부분이 인터페이스로 
구분되기 때문에 언어의 특성을 보다 잘 살린 구조가 되었다. 인터페이스를 
이렇게 사용할 수 있는 것은 인터페이스에서 선언된 변수는 무조건 
public static final의 속성을 갖기 때문이다.*/
interface COMPANY{
    int GOOGLE=1, APPLE=6, ORACLE=3;
}
 
public class ConstantDemo5 {
     
    public static void main(String[] args) {
    	 
        int type = FRUIT.APPLE;//이렇게 문법적인걸로해결하면 더좋은거
        switch(type){
            case FRUIT.APPLE:
                System.out.println(57+" kcal");
                break;
            case FRUIT.PEACH://COMPANY.APPLE하면 예외발생 
                System.out.println(34+" kcal");
                break;
            case FRUIT.BANANA:
                System.out.println(93+" kcal");
                break;
        }
        if(FRUIT.APPLE == COMPANY.APPLE) { 
        	//그런데 문제는 말도안되게 이렇게 같다는결과가 나와버린다
 			System.out.println("과일애플과 기업애플은 같습니다");
 			//이렇게 비교하면안되는걸 비교못하게할수없을까..
    	 }
	}
    }