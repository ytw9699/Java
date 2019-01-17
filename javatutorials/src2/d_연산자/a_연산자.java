package d_연산자;

public class a_연산자 {

	public static void main(String[] args) {
		// result 의 값은 3
        int result = 1 + 2;
        System.out.println(result);
        // result 의 값은 2
        result = result - 1;
        System.out.println(result);
        // result 의 값은 4
        result = result * 2;
        System.out.println(result);
        // result 의 값은 2
        result = result / 2;
        System.out.println(result);
        // result 의 값은 10
        result = result + 8;
        // result 의 값은 3
        result = result % 7;//7로 나눌때 나머지
        System.out.println(result);
    }
}
