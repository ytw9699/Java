package z_Collection_Framework;

import java.util.ArrayList;
 
public class b_ArrayList��_���׸�Ȱ�� {
 
    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList<String>();//���׸�Ȱ��
        //Ÿ���� �������� ������
       /* public void add(String element){
        ArrayList.this.add(nextIndex++, element);
        }*/
        al.add("one");
        al.add("two");
        al.add("three");
        for(int i=0; i<al.size(); i++){
            String value = al.get(i);//(String)����ȯ �ʿ����
            //get�� ���� �������°� stringŸ���̱⶧��
            /*public String get(int index) {
            	return elementData[index];
            	}*/
            System.out.println(value);
        }
    }
}