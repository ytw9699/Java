package g_메소드;

public class a_메소드정의와호출 {
    public static void numbering() {//메소드정의
    	//메소드(method)는 코드를 재사용할 수 있게 해준다.
        int i = 0;
        while (i < 4) {
            System.out.println(i);
            i++;
        }
    }
     public static void main(String[] args) {
        numbering();//메소드호출
        numbering();
     /*   int i = 0;
        while (i < 4) {
            System.out.println(i);
            i++;
        }*/
    }
}