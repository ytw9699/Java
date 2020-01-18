package f_반복문;
public class d_반복문의제어break {
public static void main(String[] args) {
 for (int i = 0; i < 10; i++) {
    if (i == 5)//if문안에 한줄짜리가오면 중괄호 생략해도됨{}
        break;//반복문 빠져나감 종료
    System.out.println("Coding Everybody " + i);
}
}
}
