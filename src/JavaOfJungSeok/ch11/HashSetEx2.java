package ch11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class HashSetEx2 {
	public static void main(String[] args) {//로또번호
		Set set = new HashSet();

		for(int i=0; set.size()<6; i++) {
			set.add((int)(Math.random()*45+1));//중복된값은 저장안한다 왜냐면 위에서
			//set의 size로 판단하니까!
		}
		List list = new LinkedList(set);
		
		Collections.sort(list);//셋은 정렬이안됨 리스트쪽만됨 왜냐면 셋은 순서가없으니까
		
		System.out.println(list);	
	}
}
