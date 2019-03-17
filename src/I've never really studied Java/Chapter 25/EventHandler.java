import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseEventHandler implements MouseListener
{
	/* ���콺 ��ư�� Ŭ���Ǿ��� ��(���ȴ� Ǯ���� ��) ȣ��˴ϴ�.  */
	public void mouseClicked(MouseEvent e)
	{
		JButton button=(JButton)e.getComponent();
		button.setText("Clicked");
		System.out.println("Clicked Button"+e.getButton());
		System.out.println("���콺 ��ư ���ȴ� Ǯ��");
	}
	
	/* ���콺 Ŀ���� ��ư ���� �ö󰡸� ȣ��˴ϴ�. */
	public void mouseEntered(MouseEvent e) 
	{ 
		System.out.println("Ŀ�� ��ư �� ����");
	}
	
	/* ���콺 Ŀ���� ��ư�� ���������� ȣ��˴ϴ�. */
	public void mouseExited(MouseEvent e) 
	{
		System.out.println("Ŀ�� ��ư �� Ż��");
	}
	
	/* ���콺 ��ư�� ������ ���� ȣ��˴ϴ�. */
	public void mousePressed(MouseEvent e) 
	{ 
		System.out.println("���콺 ��ư ����");		
	}
	
	/* ���콺 ��ư�� Ǯ���� ���� ȣ��˴ϴ�. */
	public void mouseReleased(MouseEvent e) 
	{
		System.out.println("���콺 ��ư Ǯ��");	
	}	
}

class EventHandler
{	
	public static void main(String[] args)
	{
		JFrame frm=new JFrame("First Swing");
		frm.setBounds(120, 120, 400, 100);
		frm.setLayout(new FlowLayout());
		
		JButton btn1=new JButton("My Button");
		MouseListener listener=new MouseEventHandler();
		btn1.addMouseListener(listener);
		
		JButton btn2=new JButton("Your Button");
		btn2.addMouseListener(listener);
		
		JButton btn3=new JButton("Our Button");
		btn3.addMouseListener(listener);		
		
		frm.add(btn1);		
		frm.add(btn2);		
		frm.add(btn3);
		frm.setVisible(true);
	}
}