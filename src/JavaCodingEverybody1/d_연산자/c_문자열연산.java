package d_연산자;
public class c_문자열연산 {
public static void main(String[] args) {
    int a = 10;
    int b = 3;
      
    float c = 10.0F;
    float d = 3.0F;
      
    System.out.println(a/b);//손실이일어남  //3 
    System.out.println(c/d);// 3.3333333
    System.out.println(a/d);//a가 10.0으로 자동형변환되어 연산됨 3.3333333
    System.out.println(d/a);//0.3//자동형변환
    System.out.println(b/a);//0 손실인듯
    }
}
