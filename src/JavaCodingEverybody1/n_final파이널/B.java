package n_final파이널;

class A{
	
    final void b(){}

    void aa() {}
}

class B extends A{
	
    //void b(){}  //final 메소드 b를 오버라이드 하려하기 때문에 오류가 발생한다.
	void aa() {}
}

final class C{
	
    final void b(){
    }
}

//class D extends C{ }  //final 클래스를 상속하려하고 있다. 따라서 오류가 발생한다.