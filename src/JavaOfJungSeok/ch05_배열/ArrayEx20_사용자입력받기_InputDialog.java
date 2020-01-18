package ch05_배열;
import javax.swing.*;
class ArrayEx20_사용자입력받기_InputDialog {
	public static void main(String[] args) {
		String temp = "";
		int input = 0 ;
		
		do {
		temp = JOptionPane.showInputDialog("1~100사이의 숫자입력하세요."+"끝내려면-1을 입력하세요");
		
		if(temp==null || temp.equals("-1")) {
			break;
		}
		input = Integer.parseInt(temp);
		
		}while(input < 0 || input > 100);
		
		System.out.println(temp);
    
	}
}
