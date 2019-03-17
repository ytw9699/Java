package g_메소드;

public class c_복수의인자 {
 
    public static void numbering(int init, int limit) {
        int i = init;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }
    public static void main(String[] args) {
        numbering(1, 5);
    }
}