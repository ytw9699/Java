package g_메소드;
public class b_매개변수와인자 {
    public static void numbering(int limit) {
        int i = 0;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }
    public static void main(String[] args) {
        numbering(5);
    }
}
/* 동일한 의미
  public static void numbering() {
    int limit = 5;
    int i = 0;
    while (i < limit) {
        System.out.println(i);
        i++;
    }*/
