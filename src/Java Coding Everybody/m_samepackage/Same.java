package m_samepackage;

public class Same {

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