package g_�޼ҵ�;
//�޼ҵ�� ���� ���α׷����μ� �Է°� ����� ���踦 �����ش�
//(1, 5)��� ���� �Ķ���� �Է°����ָ� !  output�� ��°��� �Ǵ°� 
//return�� �޼ҵ��� ��°� ����//�޼ҵ带  �����ؼ� �� ����� ������ �����شٴ� ����
public class d_�޼ҵ����Է°���� {
public static String numbering(int init, int limit) {
	//���⼭ String�� �� �޼ҵ尡 ������ ���� �ݵ�� ���ڿ��̴ٶ�°�
    //String a; ����a�� ���ڿ�Ÿ���̴� ��� �ϴ°Ͱ� ���� 
	//String numbering
	int i = init;
    // ��������� ���ڵ��� output�̶�� ������ ��� ���ؼ� ������ �� ���� �־���.���ָ� ����
    String output = "";
    while (i < limit) {
        // while�� ���ο��� ���ڸ� ȭ�鿡 ����ϴ� ��� ���� output�� ��Ҵ�.
    	//System.out.println(i);//�̷����ϴ°� ���
        output += i;//output=output+i;
        i++;
    }
    //�߿�!!! output�� ��� �ִ� ���ڿ��� �޼ҵ� �ܺη� ��ȯ�Ϸ���
    //�Ʒ��� ���� return Ű���� �ڿ� ��ȯ�Ϸ��� ����
    //��ġ�ϸ� �ȴ�.
    return output;//���Ͽ��� ���α׷� �ݵ�� ����!
    //���ϵڿ����� output�� ���� �޼ҵ��� ��°����� �ܺη� ��ȯ! 
}
    public static void main(String[] args) {//void�� �������, ���ϰ��� ������Ѵ�
    	//�׷��� �޼ҵ�ȿ��� return�̾��°�
        //�޼ҵ� numbering�� ������ ���� ���� result�� ����.
        String result = numbering(1, 5);//�Է°�
        //���� result�� ���� ȭ�鿡 ����Ѵ�.
        System.out.println(result);//1234 ���
    }
}
//�޼ҵ尡 ���� �� ���� ��������μ� numbering�̶�� �޼ҵ�� �ݵ�� ���ڿ��� ����
//�����Ѵٴ� ���� ������ �� �ִ� ������ �ִ�. ������ �������� ����
