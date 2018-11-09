package j_초기화와생성자;
/*아래는 초기화작업을 한번더 해줘야하는것인데 이걸 더 좋게바꾼거임
 public void setOprands(int left, int right){
    this.left = left; 
    this.right = right;
}*/
class Calculator {
int left, right;//전역변수
 
    public Calculator(int left, int right){
    //생성자는 이렇게 초기화작업을 해줌으로써 사용자가 수동적으로 초기화작업을 안해주도록함
	//이러한 절차를 기억해야 한다는 것은 사용자 입장에서는 불편할 뿐 아니라 잘못된 사용으로 
    //오류가 발생할 확률을 높이는 결과를 초래 할 수 있다.
	//사용자가 초기화작업을 빼먹는 경우를 없애버림 이렇게 api를 만드는것이다// 
	//Calculator객체 인스턴스가 생성될때 자동으로  생성자가 제일 먼저 실행되도록 약속됨
	//객체 생성을 할때 생성자가 없으면 기본생성자를 만들어서 
    //그것을 원래 먼저실행함 하지만 생성자가 있으면 있는걸 제일 먼저 실행함
    this.left = left;//this는 전역변수의 값을 세팅
    this.right = right;
}
/*생성자의 특징
생성자의 특징은 아래와 같이 정리할 수 있다.
값을 반환하지 않는다. 
생성자는 인스턴스를 생성해주는 역할을 하는 특수한 메소드라고 할 수 있다. 
그런데 반환 값이 있다면 엉뚱한 객체가 생성될 것이다. 따라서 반환 값을 필요로하는 작업에서는 생성자를 사용하지 않는다.
 반환 값이 없기 때문에 return도 사용하지 않고, 반환 값을 메소드 정의에 포함시키지도 않는다.
생성자의 이름은 클래스의 이름과 동일하다.
자바에서 클래스의 이름과 동일한 메소드는 생성자로 사용하기로 약속되어 있다.*/
public void sum() {
    System.out.println(this.left + this.right);
}
public void avg() {
    System.out.println((this.left + this.right) / 2);
}
}
public class a_생성자를통해변수초기화 {
public static void main(String[] args) {
    Calculator c1 = new Calculator(10, 20);//매개변수에 값을 넣어서 객체생성하기때문에 기본생성자 안만들어줘도됨
    //즉 " calculator(10, 20);" 이것이 생성자라고 봐야함-인스턴스,객체 c1을 생성하는 자 생성자라는 말이다!
    //결국 new Calculator(10, 20);이 메소드를 실행하는 것이다 그러한 실행을 통해 객체인 인스터를 생성해주기 때문에 생성자라한다
    c1.sum();
    c1.avg();
    Calculator c2 = new Calculator(20, 40);
    c2.sum();
    c2.avg();
}
}