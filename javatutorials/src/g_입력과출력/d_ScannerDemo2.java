package g_입력과출력;

import java.util.Scanner;
 
public class d_ScannerDemo2 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {//이메소드 역할3가지
        	//sc.hasNextInt()이메소드 실행시키면 1.실행을 일단 멈추고
        	//2.사용자가 입력한값에 엔터를쳤다면(공백이들어왔다면 다시 동작)
        	//3.사용자가 입력한 값이 int값을 가지고 있으면 true,
        	// int가 맞으면 밑에 구문 실행하고  다시 반복
        	//아니면 false리턴하고 sc.close로가게되서 종료됨
            System.out.println(sc.nextInt()*1000); 
        }
        sc.close();
    }
 
}
