package a_숫자와문자;
public class b문자와문자열 {
	public static void main(String[] args) {
	/*자바는 문자(Character)와 문자열(String)을 구분한다.문자는 한 글자를 의미하고
	문자열은 여러 개의 문자가 결합한 것을 의미한다.*/
		System.out.println('생');//자바에서 문자는 '작은따옴표'로 감싸야 한다.
		System.out.println('A');
		char aaa = '가';
		System.out.println(aaa);
		System.out.println("생활코딩");//문자열은 "큰따옴표"로 감싸야 한다.
		System.out.println("AA");
		//System.out.println('생활코딩');
		// 만약 문자열을 작은 따옴표로 감싸면 에러가 발생한다.
		System.out.println("생");//하나의 문자를 큰따옴표로 감싼다고 에러가 발생하지는 않는다. 
		//한 글자도 문자열이 될 수 있기 때문이다.
		System.out.println("생활"+"코딩");//문자열의 연산
		System.out.println('생'+'딩');//95750
		System.out.println("1"+"1");//문자열의 연산
		System.out.println(1+1);
		System.out.println("egoing said \"Welcome programming world\"");//역슬래시=\"
		//만약 문자열 안에 큰 따옴표를 넣고 싶다면 어떻게 해야 할까?이러한 기법을 escape(이스케이프)라고 한다.
		System.out.println("HTML\nCSS\nJavaScript");//역슬래시=\n
		//여러 줄을 표시하고 싶을 때는 아래와 같이 하면 된다.
	}
}
