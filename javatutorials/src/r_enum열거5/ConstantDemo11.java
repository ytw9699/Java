package r_enum����5;
class Fruit2{
public static final Fruit2 APPLE  = new Fruit2();
public static final Fruit2 PEACH  = new Fruit2();
public static final Fruit2 BANANA = new Fruit2();
}
enum Fruit{//�������ؾȵ�..�ٽ� ó�����ʹ�..
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    private String color;
    Fruit(String color){
        System.out.println("Call Constructor "+this);
        this.color = color;
    }
    String getColor(){
        return this.color;
    }
}
enum Company{
    GOOGLE, APPLE, ORACLE;
}
public class ConstantDemo11 {
    public static void main(String[] args) {
    	System.out.println(Fruit2.APPLE);
    	System.out.println(Fruit.APPLE);
        for(Fruit f : Fruit.values()){//Fruit.values()�� �̳�Ŭ������ �޼ҵ�
            System.out.println(f+", "+f.getColor());//enum�� �ɹ� ��ü�� ���� �� �� �ִ� ��ɵ� �����Ѵ�.
        }
    }
}
/*String[] members2 = { "������2", "������2", "���̶�2" };
for (String e : members2) {//�ݷе� ������� �����Ϳ� ����ִ� ������ �ϳ��� �ݺ����� �����Ҷ�����
	//������ e��� �ϴ� ������ ����ֵ��� ��ӵ�
    System.out.println(e + "�� ����� �޾ҽ��ϴ�");
}*/
/*�������� Ư���� �����غ���.
��ġ �迭ó�� ��������͸� �������ִ� �迭�� ����°ͻӾƴ϶� �迭ó�� ������� �ϳ��ϳ�����������
�������� ������ ������ �����Ѵ�. 
�� �� ������ ������� �ʵ��� �����Ѵ�.
�Ӹ� �ƴ϶� ������ ��ü�� Ŭ�����̱� ������ ������ ���ο� ������, 
�ʵ�, �޼ҵ带 ���� �� �־ �ܼ��� ����� �ƴ϶� �� ���� ������ �� �� �ִ�.Ŭ��������+@*/