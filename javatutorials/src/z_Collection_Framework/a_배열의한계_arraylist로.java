package z_Collection_Framework;

import java.util.ArrayList;//����Ʈ�ؾ���

public class a_�迭���Ѱ�_arraylist�� {
	
public static void main(String[] args) {
	
    String[] arrayObj = new String[2];//2���� ���� ����
    arrayObj[0] = "one";
    arrayObj[1] = "two";
    // arrayObj[2] = "three"; ������ �߻��Ѵ�. �迭�� �Ѱ�
    
    for(int i=0; i<arrayObj.length; i++){
        System.out.println(arrayObj[i]);
    }
    System.out.println();
    
    ArrayList al = new ArrayList();//��� ���� ���� �������
    //��̸���Ʈ Ŭ������ �̿�
    al.add("one");
    al.add("two");
    al.add("three");
    System.out.println(al.get(0));
    System.out.println(al.get(1));
    System.out.println(al.get(2));
    System.out.println();
    //��̸���Ʈ Ŭ�������� add�޼ҵ�
    /* public void add(Object element){//"one"�� objectŸ������ ����
    //�� ������ ������Ÿ���� ������Ʈ������ ������Ʈ�� ��� ������
	//Ÿ���� �����̱⶧���� � ������Ÿ�Ե� �����Ϸ��� �̷��� �ؾ���
	}*/
    
    for(int i=0; i<al.size(); i++){
        String value = (String)al.get(i);//������Ʈ�� ��Ʈ������ ����ȯ>>>
        System.out.println(value);
        }
    
    System.out.println();
    
    for(int i=0; i<al.size(); i++){
        System.out.println(al.get(i));
    }
    }
}