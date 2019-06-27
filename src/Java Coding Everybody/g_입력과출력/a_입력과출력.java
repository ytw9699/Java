package g_입력과출력;

class a_입력과출력{
    public static void main(String[] args){
	//3.하지만 메인메소드는 입력값안줘도 상관없지만 줘보면
	//string[] args 매개변수는 메소드가 호출될 때 전달된 입력 값을 메소드 내부로 전달하는 역할을 하는 변수다.
	//one two 이렇게 넣어주면 배열의 첫번째 인덱스로는 one 두번째는 two를  주는것
    //String[] args= {"one","two"};이렇게 선언하고 값준거랑 같은뜻
    System.out.println(args.length);//이 배열의 길이는 2가됨
    System.out.println(args);//[Ljava.lang.String;@7852e922
    
    testmethod("a");
  //testmethod();//이거는 2.아무 입력값을 주지않으면 메소드 호출안됨
}
public static void testmethod(String a) {//1.이렇게 입력값을 받는다고 하면
	System.out.println(a);
    }
}
