package e_���ǹ�;

public class e_���ǹ�����ø {
	public static void main(String[] args) {
        String id = args[0];
        String password = args[1];//2���� ���ڰ��ʿ�
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
