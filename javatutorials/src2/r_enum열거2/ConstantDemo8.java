package r_enum����2;//enum�� ��� Ŭ������. �׷��� ������ �����ڸ� ���� �� �ִ�.
/*class Fruit{
public static final Fruit APPLE  = new Fruit();
public static final Fruit PEACH  = new Fruit();
public static final Fruit BANANA = new Fruit();
}*/
enum Fruit{
    APPLE, PEACH, BANANA;//��ü���鶧���� ������ ȣ��
    Fruit(){//������   //public Fruit�� �ȵ� private��!
    System.out.println("Call Constructor "+this);//this�� �����ڸ� ��ǥ�Ҽ��ִ� ����
    }
}
enum Company{
    GOOGLE, APPLE, ORACLE;
}
public class ConstantDemo8 {
    public static void main(String[] args) {
        /*
        if(Fruit.APPLE == Company.APPLE){
            System.out.println("���� ���ð� ȸ�� ������ ����.");
        }
        */
        Fruit type = Fruit.APPLE;
        switch(type){
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