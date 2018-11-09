package x_참조1;
//기본데이터 타입 vs 참조형 데이터타입 (new를 통해 데이터를 생성하는것)
public class a복제_ReferenceDemo1 {
	 
    public static void runValue(){
        int a = 1;//int는 기본데이터형
        int b = a;//복제
        b = 2;
        System.out.println("runValue,"+a); //1
    }
 
    public static void main(String[] args) {
        runValue();
    }
 
}