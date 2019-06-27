package Chapter22;

import java.util.ArrayList;

class a01_IntroArrayList
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();//
		
		/* 데이터의 저장 */
		list.add(new Integer(11));//순서대로 저장
		list.add(new Integer(22));
		list.add(new Integer(33));
		
		/* 데이터의 참조 */
		System.out.println("1차 참조");
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));//0이 첫번째
		
		/* 데이터의 삭제 */
		list.remove(0);//첫번째 삭제 ,인스턴스의 참조값이지워지는거지,인스턴스가 소멸되는것은 아니다
		System.out.println("2차 참조");
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));	
	}
}