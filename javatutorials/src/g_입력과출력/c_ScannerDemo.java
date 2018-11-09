package g_입력과출력;

import java.util.Scanner;//스캐너클래스 로드해야함//자바 유틸이라는 패키지에있는

public class c_ScannerDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//System.in은 사용자가 입력할 값 InputStream
        //new Scanner(System.in)로 객체를 생성하면
        //사용자가 입력할 값을 알아내는 역할함, 그리고 그 객체를 sc라는 변수에 담는다
        //그렇게 입력할 값을 알아내는 역할을 하는 객체를 가지고 밑에 객체점 메소드 실행
        int i = sc.nextInt(); //이 메소드는 실행이 멈추고 내가 입력하는 값을 듣고 기다리는 상태
        //sc.nextInt()가 실행되면 자바는 사용자의 입력이 있을 때까지 변수 
        //i에 값을 할당하지 않고 대기상태에 있게 된다.
        //그 상태에서 엔터를 눌러주면 이 메소드가 실행되서 값을 i에 담아줌
        System.out.println(i*1000);
        sc.close();
    }
 }
