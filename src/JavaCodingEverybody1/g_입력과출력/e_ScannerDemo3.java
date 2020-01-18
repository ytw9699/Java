package g_입력과출력;

import java.util.Scanner;
import java.io.*;
 
public class e_ScannerDemo3 {
 
    public static void main(String[] args) {
        try {
            File file = new File("out.txt");
            Scanner sc = new Scanner(file);//file객체를 주면
            //out.txt가 가지고있는 값을 입력값으로 가져오라는것
            while(sc.hasNextInt()) {
                System.out.println(sc.nextInt()*1000); 
            }
            sc.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
         
    }
 
}