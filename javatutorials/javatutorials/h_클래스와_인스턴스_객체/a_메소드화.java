package h_클래스와_인스턴스_객체;

public class a_메소드화 {
	
public static void sum(int left, int right) {
    System.out.println(left + right);//메소드화 중복의제거
    }
public static void main(String[] args) {
	 // 아래의 로직이 1000줄 짜리의 복잡한 로직이라고 가정하자.
System.out.println(10 + 20);
System.out.println(20 + 40);
        
sum(10, 20);//메소드화 위에것을 이렇게 줄임!,가독성향상(문제가 생겼을 때 원인을 더 쉽게 찾을 수 있다. )
sum(20, 40);//메소드화,중복제거
//똑같은 결과를 출력하는데 중복을제거하고 ,효율적으로 코드를 만드는것 그게 리팩토링!
}
}
