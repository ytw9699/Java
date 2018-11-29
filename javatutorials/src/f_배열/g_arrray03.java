package f_배열;
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
        System.out.println(numbers1[3]);//결과는 0이 됩니다. 숫자 형식의 배열에는 값이 지정되지 않은 엘리먼트의 값은 0 입니다. 
                         //	만약 배열의 데이터 타입이 문자열과 같은 객체라면 null이 됩니다
         
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