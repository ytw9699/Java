package x_����1;
//�⺻������ Ÿ�� vs ������ ������Ÿ�� (new�� ���� �����͸� �����ϴ°�)
public class a����_ReferenceDemo1 {
	 
    public static void runValue(){
        int a = 1;//int�� �⺻��������
        int b = a;//����
        b = 2;
        System.out.println("runValue,"+a); //1
    }
 
    public static void main(String[] args) {
        runValue();
    }
 
}