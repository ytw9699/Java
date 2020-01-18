package d_연산자;

public class e_단항연산자 {

public static void main(String[] args) {
		int i = 3;
        i++;
        System.out.println(i); // 4 출력
        ++i;
        System.out.println(i); // 5 출력
        System.out.println(++i); // 6 출력
        System.out.println(i++); // 6 출력,여기서 이 문장이 끝난즉시! i는 7이 된다
        System.out.println(i); // 7 출력
}
}


