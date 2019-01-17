package g_메소드;

public class g_return의특성2 {
    public static String num(int i) {
        if(i==0){
            return "zero";
        } else if(i==1){
            return "one";//여기서 종료
        } else if(i==2){
            return "two";
        }//else//를 여기 붙여도됨 
        return "none";//위에아무것도 안걸리면 이것이 리턴
    } //return "none";를 제거하면 컴파일이 되지 않을 것이다. 
    //스트링을 무조건 리턴하는 메소드니까
 
    public static void main(String[] args) {
        System.out.println(num(3));
        
        System.out.println("switch(5)");//여기는 위와 비교해봐
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
        default://결국 if문의 else랑 똑같은듯!
            System.out.println("default");
            break;
        }
    }
}