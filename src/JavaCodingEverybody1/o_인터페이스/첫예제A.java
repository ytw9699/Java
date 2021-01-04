﻿package o_인터페이스;
/*인터페이스도 abstract, final와 함께 대표적인 규제이다
 * 인터페이스를 구현한다면  반드시 인터페이스의  메소드들을 구현해야 한다.
만약 인터페이스에서 강제하고 있는 메소드를 구현하지 않으면 이 에플리케이션은 컴파일 조차 되지 않는다.*/

interface I{//이거는 마치 추상클래스 안에
    public void z();//본체가없는  추상메소드가 있는거랑 동일,이 메소드는 반드시 public이어야함
}
 
class 첫예제A implements I{//클래스A는 인터페이스 I를 구현하는것
    public void z(){} //1.이부분이 없이 클래스A를 만들면 오류남//2.반드시 본체를 만들어줘야함3.오버라이딩느낌?
  
}
//인터페이스와 상속은 다르다. 상속이 상위 클래스의 기능을 하위 클래스가 물려 받는 것이라고 한다면, 
//인터페이스는 하위 클래스에 특정한 메소드가 반드시 존재하도록 강제한다