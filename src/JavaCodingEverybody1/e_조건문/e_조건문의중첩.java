package e_조건문;

public class e_조건문의중첩 {
	public static void main(String[] args) {
        String id = args[0];
        String password = args[1];//2개의 인자값필요
        if (id.equals("egoing")) {
            if (password.equals("111111")) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        } else {
            System.out.println("wrong");
        }
    }
}
