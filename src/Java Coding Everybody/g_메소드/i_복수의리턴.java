package g_�޼ҵ�;
public class i_�����Ǹ��� {
 
    public static String[] getMembers() {//���ϰ��� String[] �迭
        String[] members = { "������", "������", "���̶�" };
        //members������ ���ڿ��� �������ִ� �迭
        return members;//�����ѹ������� �迭�ȿ� �������� ���� ��
    }
  //�޼ҵ� getMembers�� ������ �迭�� members ������ ��Ҵ�. 
    //�� ������ �̿��ؼ� ���� ���� �����͸� ó�� �� �� �ְ� �ȴ�.
 
    public static void main(String[] args) {
        String[] members2 = getMembers();//
        //String[]�迭�� ������Ÿ���� ������ �ִ� members2��� ������
        //��ȯ�� members��� ���� ����
        
        for(int i=0; i<members2.length; i++ ) {//length�� 3
        	String member = members2[i];// 0 1 2
        System.out.println(member);
        }
     
    }
 
}