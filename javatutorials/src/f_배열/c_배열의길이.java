package f_�迭;

public class c_�迭�Ǳ��� {
	
    public static void main(String[] args) {
    	//String[] classGroup = { "������", "������", "���̶�", "�̰���" }; //�̰Ͱ� ���� �ǹ�
        String[] classGroup = new String[4];//4���� ���Ҹ� �������ִ� �迭
        
        classGroup[0] = "������";//0�� �ε����� ������ ����
        System.out.println(classGroup.length);
        //length�� ����� ������ ������ �ƴ϶� �������ִ� ������ ���� length�� ����
        //.length�� �迭�� ���� ��� �������� ���ڸ� �ǹ��ϴ� ���� �ƴ϶� 
        //�迭�� ó�� ������ �� ������ �迭�� ũ�⸦ �ǹ��Ѵٴ� ���� ��������
        classGroup[1] = "������";
        System.out.println(classGroup.length);//4
        classGroup[2] = "���̶�";
        System.out.println(classGroup.length);
        classGroup[3] = "�̰���";
        System.out.println(classGroup.length);
    }
}