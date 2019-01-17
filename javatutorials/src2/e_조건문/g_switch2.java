 package e_조건문;
public class g_switch2 {
	public static void main(String[] args) {
		System.out.println("switch(1)");
        switch(1){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        }
    	System.out.println("val");
        //위아래 같다고볼수있다
        int val = 1;
        if(val == 1){
            System.out.println("one");
        } else if(val == 2){
            System.out.println("two");
        } else if(val == 3){
            System.out.println("three");
        } 
        System.out.println("switch(2)");
        switch(2){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        }
        System.out.println("switch(3)");
        switch(3){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        }
        System.out.println("switch(4)");
        switch(4){//어디에도 속하지않는다 4는 그래서 디폴트가실행
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        default://결국 if문의 else랑 똑같은듯!
            System.out.println("default");
            break;
        }
        System.out.println("switch(5)");
        switch(5){//어디에도 속하지않는다
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        }
        System.out.println("switch(6)");
       // switch(new String("d")){
        switch("d"){
        case "d":
            System.out.println("d");
            break;
        case "e":
            System.out.println("e");
            break;
        case "f":
            System.out.println("f");
            break;
        }
        System.out.println("switch(7)");
        switch("dd"){
        case "dd":
            System.out.println("dd");
            break;
        case "ee":
            System.out.println("e");
            break;
        case "ff":
            System.out.println("f");
            break;
        }
        /*switch 문을 사용할 때 한가지 주의 할 것은 switch의 조건으로는 
		몇가지 제한된 데이터 타입만을 사용할 수 있다. 래퍼클래스인
		byte, short, char, int, enum, String, Character, Byte, Short, Integer*/
  }
}
