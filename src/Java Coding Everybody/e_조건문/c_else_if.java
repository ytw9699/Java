package e_���ǹ�;

public class c_else_if {

	public static void main(String[] args) {
        if (false) {
            System.out.println(1);
        } else if (true) {
            System.out.println(2);//���⼭��������
        } else if (true) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
        
        if (false) {
            System.out.println(1);
        } else if (false) {
            System.out.println(2);
        } else if (false) {
            System.out.println(3);
          //else��������
        }
        if (false) {
            System.out.println(1);
        } else if (false) {
            System.out.println(2);
        } else if (true) {
            System.out.println(3);
          //else��������
        } 
        
        if (false) {
            System.out.println(1);
        } else if (false) {
            System.out.println(2);//���⼭��������
        } else if (false) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
	}
}
