package g_�޼ҵ�;

public class g_return��Ư��2 {
    public static String num(int i) {
        if(i==0){
            return "zero";
        } else if(i==1){
            return "one";//���⼭ ����
        } else if(i==2){
            return "two";
        }//else//�� ���� �ٿ����� 
        return "none";//�����ƹ��͵� �Ȱɸ��� �̰��� ����
    } //return "none";�� �����ϸ� �������� ���� ���� ���̴�. 
    //��Ʈ���� ������ �����ϴ� �޼ҵ�ϱ�
 
    public static void main(String[] args) {
        System.out.println(num(3));
        
        System.out.println("switch(5)");//����� ���� ���غ�
        switch(5){//��𿡵� �������ʴ´�
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        default://�ᱹ if���� else�� �Ȱ�����!
            System.out.println("default");
            break;
        }
    }
}