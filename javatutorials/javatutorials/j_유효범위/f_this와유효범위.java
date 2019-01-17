package j_유효범위;

class Calculator{
    int left, right;
   /* public void setOprands(int left, int right){
        this.left = left; //this는 c1의 인스턴스를 가리키는거,인스턴스 자신//결국 전역변수인건데
        this.right = right;
    }*/
    public void setOprands(int _left, int _right){
        left = _left; //여기서 left도 전역변수인거다!왜냐면 메소드안에 지역변수가 선언되지않았기때문에!
        right = _right;
        //이러한 범위에대한 눈을 키우자라는 의미에서 접근
    }
    //위 두가지 메소드 처럼 두가지로 만들수있는거다
    public void sum(){
        System.out.println(this.left+this.right);
    }
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}
public class f_this와유효범위 {
    public static void main(String[] args) {
     
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();       
        Calculator c2 = new Calculator();
        c2.setOprands(20, 40);
        c2.sum();       
        c2.avg();
    }
}