package r_enum���;

interface FRUIT{//�̷��� �������ΰɷ��ذ��ϸ� ��������
    int APPLE=6, PEACH=2, BANANA=3;
    /*
    public final static int APPLE = 6;
    public final static int PEACH = 2;
    public final static int BANANA = 3;
    */
    //�̰Ͱ� ���� �ǹ� �������̽����� ���������� �̷��� ������
}
/*���̻�(FRUIT_, COMPANY_)�� �̸��� �����ߴ� �κ��� �������̽��� 
���еǱ� ������ ����� Ư���� ���� �� �츰 ������ �Ǿ���. �������̽��� 
�̷��� ����� �� �ִ� ���� �������̽����� ����� ������ ������ 
public static final�� �Ӽ��� ���� �����̴�.*/
interface COMPANY{
    int GOOGLE=1, APPLE=6, ORACLE=3;
}
 
public class ConstantDemo5 {
     
    public static void main(String[] args) {
    	 
        int type = FRUIT.APPLE;//�̷��� �������ΰɷ��ذ��ϸ� ��������
        switch(type){
            case FRUIT.APPLE:
                System.out.println(57+" kcal");
                break;
            case FRUIT.PEACH://COMPANY.APPLE�ϸ� ���ܹ߻� 
                System.out.println(34+" kcal");
                break;
            case FRUIT.BANANA:
                System.out.println(93+" kcal");
                break;
        }
        if(FRUIT.APPLE == COMPANY.APPLE) { 
        	//�׷��� ������ �����ȵǰ� �̷��� ���ٴ°���� ���͹�����
 			System.out.println("���Ͼ��ð� ��������� �����ϴ�");
 			//�̷��� ���ϸ�ȵǴ°� �񱳸��ϰ��Ҽ�������..
    	 }
	}
    }