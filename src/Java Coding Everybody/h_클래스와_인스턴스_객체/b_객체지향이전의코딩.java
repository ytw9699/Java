package h_클래스와_인스턴스_객체;

public class b_객체지향이전의코딩 {
	public static void avg(int left, int right) {
        System.out.println((left + right) / 2);
    }
    public static void sum(int left, int right) {
        System.out.println(left + right);
    }
    public static void main(String[] args) {
        int left, right;
 
        left = 10;
        right = 20;
 
        sum(left, right);
        avg(left, right);
 
        left = 20;
        right = 40;
 
        sum(left, right);
        avg(left, right);
    }
}
