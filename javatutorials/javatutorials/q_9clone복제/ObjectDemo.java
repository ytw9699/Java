package q_9clone����;//������Ʈ Ŭ������ Ŭ�и޼ҵ��� �˾ƺ���
//0.clone�� ������� ���̴�. 
//1� ��ü�� ���� �� �� ��ü�� �Ȱ��� ��ü�� �������ִ� 
//2.����� clone �޼ҵ��� �����̴�. ���� ����
class Student implements Cloneable{//5.�����Ϸ��� �������̽��� �����ؼ�
	//����������  ��ü��� ����� �˷�����//�׷��� Cloneable�������̽��� �������
	//���� ���������ϴٴ� �����ڿ��Ҹ��һ�
    String name;
    Student(String name){
        this.name = name;
    }
    // Cloneable�������̽��� �����ϴ� Ŭ������ (protected �޼ҵ���) 
    //Object.clone �޼ҵ带 �ݵ�� �������̵��ؾ� �մϴ�. 
    public Object clone() throws CloneNotSupportedException{
    	//�������̵��ϸ鼭
    	//���������ڴ� protected����  public���� �ٲ� �� ���������� �ٸ�Ŭ�������� ��������
    	//throws CloneNotSupportedException�� api�� ��õǾ��ִ°� 
    	//��Ÿ���� �ƴ϶�//�׳��̼����̶� ����ó���ؾ���,�Ǵ� ������
        return super.clone();//������Ʈ Ŭ������ �޼ҵ� ȣ��
        // //clone();�޼ҵ�� ���������ڰ� protected
        //���δٸ���Ű�������� ȣ��ȵ�,������ ����϶� this.clone()�� ������ �ϳ� ���⼱ ���������� �������̵��ؼ� �����..
    }
}  
class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student("egoing");//3.s1�� �Ȱ��� ��ü�� �����غ���
        //4.������Ʈ�� Ŭ���̶�� �޼ҵ� ����
        try {
            Student s2 = (Student)s1.clone();//�����Ѱ���� s2�� ��´�
           
            System.out.println(s1.name);//egoing
            System.out.println(s2.name);//egoing
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}