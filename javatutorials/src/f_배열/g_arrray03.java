package f_�迭;
//https://opentutorials.org/module/1335/8810
public class g_arrray03 {
    public static void main(String[] args) {
         
        int[] numbers1 = new int[4];
         
        String[] strings = new String[4];
         
        numbers1[0]=10;
        numbers1[1]=20;
        numbers1[2]=30;
         
        int[] numbers2 = {10, 20, 30, 40};
        int[] numbers3 = new int[]{10, 20, 30, 40};
         
        System.out.println("System.out.println(numbers1[0]);");
        System.out.println(numbers1[0]);//10
         
        System.out.println("System.out.println(numbers1[3]);");
        System.out.println(numbers1[3]);//����� 0�� �˴ϴ�. ���� ������ �迭���� ���� �������� ���� ������Ʈ�� ���� 0 �Դϴ�. 
                         //	���� �迭�� ������ Ÿ���� ���ڿ��� ���� ��ü��� null�� �˴ϴ�
         
        System.out.println("System.out.println(numbers1.length);");
        System.out.println(numbers1.length);//4
         
        System.out.println("while");
        int i=0;
        while(numbers1.length > i){
            System.out.println(numbers1[i]);
            i++;
        }
         
        System.out.println("for");
        for(i=0; numbers1.length>i; i++){
            System.out.println(numbers1[i]);
        }
    }
 
}