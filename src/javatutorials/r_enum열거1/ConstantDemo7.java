package r_enum����1;
/*enum�� ������(enumerated type)�̶�� �θ���.��� ������ �����Ҽ��ִ�
�������� ���� ������ ������� �����̶�� �� �� �ִ�.�ٲ����ʴ� ������ ���� 
�迭�� ���� ������ ������ ����
���� ���������� Fruit�� Company�� �����ڸ� ������ ���̴�
���Ŷ�� Ư���� �ڹٿ��� ���������� �����ϴ� ���°�  enum�̴�
*/
//enum�� class, interface�� ������ ������ ������ ������. ������ enum�� ��ǻ� class�̴�
/*class Fruit{
public static final Fruit APPLE  = new Fruit();
public static final Fruit PEACH  = new Fruit();
public static final Fruit BANANA = new Fruit();
}*/
//���� �Ʒ��� ���� �� ������ ���־��ϱ� �ڹٿ��� ���������� �����ϰ� enum����
enum Fruit{//Fruit�̰� �� Ŭ������
    APPLE, PEACH, BANANA;
}
/*class Fruit{
private Fruit(){}//�������� ���� �����ڰ� private�̴�. 
//�װ��� Ŭ���� Fruit�� �ٸ�Ŭ�������� �ν��Ͻ��� ���� �� ���ٴ� ���� �ǹ��Ѵ�.
// �ٸ� �뵵�� ����ϴ� ���� >�����ϰ� �ִ� ���̴�. 
public static final Fruit APPLE  = new Fruit();
public static final Fruit PEACH  = new Fruit();
public static final Fruit BANANA = new Fruit();
}*/
enum Company{
    GOOGLE, APPLE, ORACLE;
}
public class ConstantDemo7 {
    public static void main(String[] args) {
    	/*
    	if(Fruit.APPLE == Company.APPLE){//�����Ͽ����߻�
    	    System.out.println("���� ���ð� ȸ�� ������ ����.");
    	}
    	*/
        Fruit type = Fruit.APPLE;
        switch(type){
            case APPLE://Fuit.APPLE�ε� �տ� Fuit. �����ϵ��� ��� , �� ����
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
/*enum�� ����ϴ� ������ �����ϸ� �Ʒ��� ����.
�ڵ尡 �ܼ�������.
�ν��Ͻ� ������ ����� �����Ѵ�.public static final Fruit PEACH  = new Fruit();
Ű���� enum�� ����ϱ� ������ ������ �ǵ��� �������� �и��ϰ� ��Ÿ�� �� �ִ�.*/
