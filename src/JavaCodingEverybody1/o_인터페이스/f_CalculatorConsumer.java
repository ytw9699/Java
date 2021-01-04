package o_인터페이스;

//이제 해야 할 일은 가짜 클래스인 CalculatorDummy를 실제 로직으로 교체하면 된다.

public class f_CalculatorConsumer {
	
    public static void main(String[] args) {
    	
        e_Calculator c = new e_Calculator();
        c.setOprands(10, 20, 30);
        System.out.println(c.sum()+c.avg());
    }
}

/*이렇게해서 인터페이스를 이용한 협업에 대해서 알아봤다. 
인터페이스를 이용해서 서로가 동일한 메소드를 만들도록 규약을 만들어서 공유한 결과 각자가
상대의 일정이나 구현하는 방식에 덜 영향을 받으면서 에플리케이션을 구축 할 수 있었다.*/