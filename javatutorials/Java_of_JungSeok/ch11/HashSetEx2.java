package ch11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class HashSetEx2 {
	public static void main(String[] args) {//�ζǹ�ȣ
		Set set = new HashSet();

		for(int i=0; set.size()<6; i++) {
			set.add((int)(Math.random()*45+1));//�ߺ��Ȱ��� ������Ѵ� �ֳĸ� ������
			//set�� size�� �Ǵ��ϴϱ�!
		}
		List list = new LinkedList(set);
		
		Collections.sort(list);//���� �����̾ȵ� ����Ʈ�ʸ��� �ֳĸ� ���� �����������ϱ�
		
		System.out.println(list);	
	}
}
