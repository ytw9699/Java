package ch05;
class ArrayEx13_16진수를2진수로 {
	public static void main(String[] args) {//16진수를 2진수로 바꾸는것
		
		char[] hex = { 'C', 'A', 'F', 'E'};//2진수로 변환할 대상 16진수들

		String[] binary = {   "0000", "0001", "0010", "0011"
						    , "0100", "0101", "0110", "0111"
						    , "1000", "1001", "1010", "1011"
						    , "1100", "1101", "1110", "1111" };
		//16진수에 해당하는 0~15까지의 2진수값을 미리 담아둠 
		//0123456789ABCDEF
		//하나의 16진수를 표현하려면 4자리의 2진수가필요

		String result="";

		for (int i=0; i < hex.length ; i++ ) {		
			if(hex[i] >='0' && hex[i] <='9') {//0~9이면
				result += binary[hex[i]-'0'];//50-48=2 //문자빼기 문자는 인티저
				//캐릭터타입의 문자가 숫자인(1~9)경우 문자0빼서 숫자로 변환(뺄셈 연산하면 
				//인티저보다 작은타입은 인티저로바뀜)
				// '2'-'0'의 결과는 2이다.
			} else {	// A~F이면
				result += binary[hex[i]-'A'+10]; // 'C'-'A'의 결과는 2 거기에 + 10을하면 12가 나온다 12는 1100
			}                  //67-65 = 2 // 문자에서 문자빼주는 연산하면 인티저 값나옴
		}
		System.out.println("hex:"+ new String(hex)); // String(char[] value)
		System.out.println(hex);
		System.out.println("binary:"+result);
		//System.out.println('C'-'A'+10);
	}
}
