package z_Collection_Framework2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
public class a_iterator���� {
   public static void main(String[] args) {
	   //ArrayList<Integer> A = new ArrayList<Integer>();
	   //HashSet<Integer> A = new HashSet<Integer>();
	   //Collection<Integer> A = new ArrayList<Integer>();
	   Collection<Integer> A = new HashSet<Integer>();
	   //Collection �������̽��� �����Ѱ��̶� ������ ����
       A.add(1);
       A.add(2);
       A.add(3); 
       Iterator hi = A.iterator();
       while(hi.hasNext()){//hi�����̳ʿ� ������ �����ϴ��� Ȯ��
           System.out.println(hi.next());//���������̳� ���߿� �ϳ��� �����ϰ� ����
       }
     //A=1,2,3�� ���� �����̳ʰ� 
     //hi�� �̰Ͱ� �Ȱ��� 1,2,3�� ���� ������ �����̳ʸ� �����Ѱ��̶�� ������
       
   /* iterator�� �ݺ���
   	iteration�� �ݺ�
    java.util.iterator//iterator�� �������̽�!
   	�����̳ʿ� ��䰪���� �ϳ��ϳ������� �ϳ��ϳ� �ó���� ���ֵ����ϴ� ����
     �޼ҵ� iterator�� �������̽� Collection�� ���ǵǾ� �ִ�. 
    ���� Collection�� �����ϰ� �ִ� ��� �÷����� �����ӿ�ũ�� �� �޼ҵ带 �����ϰ� ������ �����Ѵ�.
     �޼ҵ� iterator�� ȣ�� ����� �������̽� iterator�� ������ ��ü�� �����Ѵ�.
      �������̽� iterator�� �Ʒ� 3���� �޼ҵ带 �����ϵ��� �����ϰ� �ִµ� ������ ������ �Ʒ��� ����.
   hasNext: �ݺ��� �����Ͱ� �� ������ true, �� �̻� �ݺ��� �����Ͱ� ���ٸ� false�� �����Ѵ�.
   next: hasNext�� true��� ���� next�� ������ �����Ͱ� �����Ѵٴ� �ǹ̴�. 
   �̷��� ����� �����ϸ� for ���� �̿��ϴ� �Ͱ� �����ϰ� �����͸� ���������� ó���� �� �ִ�.
   */
   }
}