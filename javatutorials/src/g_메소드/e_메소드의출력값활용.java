package g_�޼ҵ�;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/*���� �̷��� �����ϰ� �����͸� �����ϴ� ������ �����ϱ�?
������ ȭ�鿡 ����ϴ� ���� �������� ������?
��������� ���ϸ� ��ǰ���μ��� ��ġ�� ���̱� ���ؼ���� �� �� �ִ�. 
���� �������� �� �޼ҵ尡 ����� ���� ȭ�鿡 ����ϴ� ���� �ƴ϶� ���Ͽ� ����ϰ� �ʹٸ� ��� �ؾ� �ұ�?
�Ǵ� �̸��Ϸ� ������ �ʹٸ� ��� �ؾ� �ұ�?
3���� �޼ҵ带 ����� �뵵�� ���� �ڵ带 ���ۼ��ϴ� �͵� ���� ����̴�. 
������ �� ���� ����� ���ڸ� ����ϰ�, ���ڸ� ���Ͽ� ����ϰ�, 
���ڷ� �̸����� ������ �۾����κ��� ���ڸ� ����ϴ� ������ �и��ϴ� ���̴�.
numbering�� �ڽ��� ��� ������ �𸥴�. 
�������� numbering�̶�� �޼ҵ带 ȣ���� �� �ʱⰪ�� ������ ���� �Է��ϸ�
numbering�� ���ڸ� ���ڿ��� ���·� ��ȯ�ϸ� �Ǵ� ���̴�. */
public class e_�޼ҵ�����°�Ȱ�� {
    public static String numbering(int init, int limit) {
        int i = init;
        String output = "";
        while (i < limit) {
            output += i;
            i++;
        }
        return output;
    }
    public static void main(String[] args) {
        String result = numbering(1, 5);
        System.out.println(result);
        try { 
            // ���� ���� out.txt ��� ���Ͽ� numbering�̶�� �޼ҵ尡 ��ȯ�� ���� �����մϴ�.
        	//�̷��� �پ��ϰ� ����� �����ϴϱ� return�� �ʿ��Ѱ�
            BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));//Ư����ΰ������� src�ؿ�����µ�
            out.write(result);
            out.close();
        } catch (IOException e) {
        }
    }
}
