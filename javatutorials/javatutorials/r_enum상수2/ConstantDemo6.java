package r_enum���2;
class Fruit{//�������̽����� Ŭ������ �ٲ�⶧���� �Ʒ�ó�����ش�
    public static final Fruit APPLE  = new Fruit();//�ڱ��ڽ��� �ν��Ͻ��� ���������
    public static final Fruit PEACH  = new Fruit();
    public static final Fruit BANANA = new Fruit();
//������ �ν��Ͻ��� ���� �׾��� apple,peach,BANANA�� ��� �ٸ����� �������̴� �ٸ��ν��Ͻ��ϱ� 
  //������ ���� Fruit��� ������Ÿ���� ����
}
class Company{
    public static final Company GOOGLE = new Company();
    public static final Company APPLE = new Company();
    public static final Company ORACLE = new Company();
    //private Company() {}//�ٸ������� �� Ŭ���� �� ü������ ���ϰ���
}
public class ConstantDemo6 {
     
public static void main(String[] args) {
	
   /* if(Fruit.APPLE == Company.APPLE){//������Ÿ���� �ٸ��⶧���� ����ü���Ұ���!
    System.out.println("���� ���ð� ȸ�� ������ ����.");
    }*/
/*int type = FRUIT.APPLE;
switch(type){//����ġ�� ���ǿ� ���� ���� �������� Ŭ���� ������ִ´� if���� ����
    case FRUIT.APPLE:
        System.out.println(57+" kcal");
        break;
    case FRUIT.PEACH:
        System.out.println(34+" kcal");
        break;
    case FRUIT.BANANA:
        System.out.println(93+" kcal");
        break;*/
            
/*switch ���� ����� �� �Ѱ��� ���� �� ���� switch�� �������δ� 
��� ���ѵ� ������ Ÿ�Ը��� ����� �� �ִ�. ����Ŭ������
byte, short, char, int, enum, String, Character, Byte, Short, Integer*/
    }
}


