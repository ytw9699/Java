package r_enum����3;
/*class Fruit{
public static final Fruit APPLE  = new Fruit();
public static final Fruit PEACH  = new Fruit();
public static final Fruit BANANA = new Fruit();
}*/

enum Fruit{
    APPLE("red"), PEACH("orange"), BANANA("yellow");
	//�ʵ尪�� �������ִ� 
	//����� ��� ���� ������ �Ҽ��ִ°� �̳����� ����
	public String color;
	
    Fruit(String color){
    System.out.println("Call Constructor "+this);
    this.color=color;
    }
}
enum Company{
    GOOGLE, APPLE, ORACLE;
}
public class ConstantDemo9 {
    public static void main(String[] args) {
        /*
        if(Fruit.APPLE == Company.APPLE){
            System.out.println("���� ���ð� ȸ�� ������ ����.");
        }
        */
        Fruit type = Fruit.APPLE;
        switch(type){
            case APPLE:
                System.out.println(57+" kcal, color "+Fruit.APPLE.color);
                break;
            case PEACH:
                System.out.println(34+" kcal, color "+Fruit.PEACH.color);
                break;
            case BANANA:
                System.out.println(93+" kcal, color "+Fruit.BANANA.color);
                break;
        }
    }
}