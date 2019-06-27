package f_반복문;

public class e_반복문의제어continue {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue;//밑에 한줄은 멈추고 i++은 계속 실행되서 다음 진행
            System.out.println("Coding Everybody " + i);
        }

	}

}
