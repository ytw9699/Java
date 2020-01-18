package o_인터페이스;
interface I1{
    public void x();
}
interface I2{
    public void z();
}
class 두번째예제B implements I1, I2{
  //하나의 클래스가 여러개의 인터페이스를 구현 할 수 있다. 
  public void x(){}//클래스 B는 메소드 x나 z중 하나라도 구현하지 않으면 오류가 발생한다.
  public void z(){}//상속자체는 한 클래스만 받을수 있지만 인터페이스는 여러개 구현가능! 
}