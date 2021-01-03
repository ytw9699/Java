package m_samepackage;

import m_otherpackage.*;

public class checker {
}

class SameClassChecker{//1.같은 클래스의 경우
	
	public SameClassChecker() {//생성자가짐
		//같은 클래스에 존재하는 모든 메소드,변수  접근 가능
		this._public();//자기자신에게 정의된 메소드 호출
		this._protected();
		this._default();
		this._private();
	}
	
	private void _private() {
		System.out.println("private");
	}
	
	void _default() {//접근제어자 명시안하면 default 접근제어가됨
		System.out.println("default");
	}
	
	protected void _protected() {
		System.out.println("protected");
	}
	
	public void _public() {
		System.out.println("public");
	}
}

class SamePackageChecker{//2.같은 패키지인경우
	
	public SamePackageChecker() {
	
		Same same = new Same();	
		//같은 패키지의 클래스를 객체생성해서 메소드에 접근가능
		same._public();
		same._protected(); 
		same._default();
		//same._private();//프라이 베잇 접근자가붙은 메소드만 접근 불가
	}
}

class SamePackageChecker2 extends Same{//2.같은 패키지의 상속받는 클래스에 접근할때
	
	public SamePackageChecker2() {
		//같은 패키지 상속관계일때 Same 클래스의 메소드에 접근하면 같은결과
		this._public();//this는 1차적으로 클래스 자신인
		//SamePackageChecker을 의미하지만
		//상속받은경우이고 자체적으로 가진 메소드나 필드가 존재안하면 부모클래스에서 
		//메소드를 조회함
		this._protected();
		this._default();
		//this._prviate();
	}
}

class otherpackagechecker extends other{//3.다른패키지
	
	public otherpackagechecker() {
		
		nothing nothing = new nothing();//3-3다른패키지  클래스 객체생성해서
		nothing._public();
		//nothing._protected();
		//nothing._default();
		//nothing._private();
		
		other other = new other();//3-1 다른패키지이고 상속관계이더라도
		//객체를 생성해 접근할때
		other._public();//접근제어자가 퍼블릭인메소드만 접근가능
		//other._protected();//상속관계 여도 객체생성하면 접근불가하지만
		//other._default();
		//other._private();
		
		this._public();//3-2다른패키지이지만 상속관계인 부모클래스에 this를통해 접근할때
		this._protected();	//하지만 other라는 클래스를 상속하면가능
		//this._default();
		//this._private();	
	}
}

