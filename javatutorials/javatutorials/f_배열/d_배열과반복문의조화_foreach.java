package f_�迭;

//�ݺ����� + �迭 �������°���
public class d_�迭���ݺ�������ȭ_foreach {
 
public static void main(String[] args) {
 
    String[] members = { "������", "������", "���̶�" };
    System.out.println(members.length);
    for (int i = 0; i < members.length; i++) {//�ʱ�ȭ,�ݺ�����,�ݺ�����
        /* String member = members[i];
        System.out.println(member + "�� ����� �޾ҽ��ϴ�");*/
        System.out.println(members[i] + "�� ����� �޾ҽ��ϴ�");
    }
    
	String[] members2 = { "������2", "������2", "���̶�2" };
    for (String e : members2) {//�ݷе� ������� �����Ϳ� ����ִ� ������ �ϳ��� �ݺ����� �����Ҷ�����
    	//������ e��� �ϴ� ������ ����ֵ��� ��ӵ�
        System.out.println(e + "�� ����� �޾ҽ��ϴ�");
    }
    int[] member3= { 1,2,3 };
	for (int e : member3) {
		System.out.println(e);			
	}
  }
}
