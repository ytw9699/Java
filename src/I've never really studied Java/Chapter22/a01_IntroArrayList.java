package Chapter22;

import java.util.ArrayList;

class a01_IntroArrayList
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();//
		
		/* �������� ���� */
		list.add(new Integer(11));//������� ����
		list.add(new Integer(22));
		list.add(new Integer(33));
		
		/* �������� ���� */
		System.out.println("1�� ����");
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));//0�� ù��°
		
		/* �������� ���� */
		list.remove(0);//ù��° ���� ,�ν��Ͻ��� ���������������°���,�ν��Ͻ��� �Ҹ�Ǵ°��� �ƴϴ�
		System.out.println("2�� ����");
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));	
	}
}