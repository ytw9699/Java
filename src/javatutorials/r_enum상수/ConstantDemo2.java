package r_enum���;

public class ConstantDemo2 {//final�� �ٲ����ʴ� ����̴ٶ�� ����
    private final static int APPLE = 1;//������������ Ŭ����(static)��������, ��� �ٲ�������
    public final static int PEACH = 2;//private�̳�, public �� �������
    private final static int BANANA = 3;
    public static void main(String[] args) {
        int type = APPLE;//����� ���
        switch(type){//�ּ��̾����� �̸������� ����˼��ִ�����
            case APPLE:
                System.out.println(57+" kcal");
                break;
            case PEACH:
                System.out.println(34+" kcal");
                break;
            case BANANA:
                System.out.println(93+" kcal");
                break;
        }
    }
}
/*�̷� ���� �̸��� �ִٸ� �� ���� ���̴�. 
������ ����� �� �� �ִ�. ������ �����ϰ� 
�� ������ final�� ó���ϸ� �ѹ� ������ ������ ���� �� �̻� �ٲ��� �ʴ´�.
���� �ٲ��� �ʴ� ���̶�� �ν��Ͻ� ������ �ƴ϶� Ŭ���� ����(static)�� �����ϴ� ���� �� ���� ���̴�.*/