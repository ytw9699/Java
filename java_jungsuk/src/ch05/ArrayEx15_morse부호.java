package ch05;
class ArrayEx15_morse��ȣ {
	public static void main(String[] args) {
		
		String source = "SOSHELP";
		
		String[] morse = {//a~z����
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
