﻿package ch05_배열;
class ArrayEx15_morse부호 {
	public static void main(String[] args) {
		
		String source = "SOSHELP";
		
		String[] morse = {//a~z까지
						   ".-", "-...", "-.-.","-..", "."
						,"..-.", "--.", "....","..",".---"
						, "-.-", ".-..", "--", "-.", "---"
						, ".--.", "--.-",".-.","...","-"
						, "..-", "...-", ".--", "-..-","-.--"
						, "--.." 
						};

		String result="";

		for (int i=0; i < source.length(); i++ ) {
			result += morse[source.charAt(i)-'A'];
		}
		
		System.out.println("source:"+ source);
		System.out.println("morse:"+result);
	}
}
