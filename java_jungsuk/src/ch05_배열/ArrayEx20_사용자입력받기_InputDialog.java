package ch05_�迭;
import javax.swing.*;
class ArrayEx20_������Է¹ޱ�_InputDialog {
	public static void main(String[] args) {
		String temp = "";
		int input = 0 ;
		
		do {
		temp = JOptionPane.showInputDialog("1~100������ �����Է��ϼ���."+"��������-1�� �Է��ϼ���");
		
		if(temp==null || temp.equals("-1")) {
			break;
		}
		input = Integer.parseInt(temp);
		
		}while(input < 0 || input > 100);
		
		System.out.println(temp);
    
	}
}
