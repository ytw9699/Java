package b_변수;

public class a변수의선언과할당 {
	
	public static void main(String[] args) {
		
		
		 int int1 = 5;
		 int int2 = 6;
		 
		 System.out.println(int1); //출력결과 1
        System.out.println(int2); //출력결과 2
	        
		 int temp;
		 temp = int1;
		 int1 = int2;
		 int2 = temp;
		 
        System.out.println(int1); //출력결과 1
        System.out.println(int2); //출력결과 2
	}
}
