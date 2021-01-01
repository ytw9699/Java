﻿package k_상속과생성자;

public class b_매개변수가있는생성자의경우 {
	
   public b_매개변수가있는생성자의경우(){
	   System.out.println("기본생성자");
   }
   
    
    public b_매개변수가있는생성자의경우(int param1) {
    	System.out.println(param1);
    }
   
    public static void main(String[] args) {
    	
    	b_매개변수가있는생성자의경우 c = new b_매개변수가있는생성자의경우();
    	b_매개변수가있는생성자의경우 d = new b_매개변수가있는생성자의경우(1);
    	/*
    	 * 매개변수가 있는 생성자가 있을 경우에, 매개변수에 값을 집어넣지 않고 객체를 생성하면 에러가 발생한다.
    	왜냐하면 기본생성자를 호출 해야하는데, 매개변수가 있는 생성자가 있기 때문에, 기본 생성자를 자동으로 안만들어준다.
    	그래서 방법은 2가지다. 기본생성자를 만들어주거나, 아니면 매개변수가 들어간 객체를 생성하거나
    	그리고 기본생성자를 안만들고 매개변수가 있는 생성자에 값을 넣어 객체생성을 하면 기본생성자가 알아서 만들어지고 자동으로 호출된다.
    	*/
    }
}