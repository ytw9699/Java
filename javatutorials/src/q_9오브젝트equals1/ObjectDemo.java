package q_9������Ʈequals1;
//������Ʈ Ŭ������ equals�޼ҵ��  ��ü�� ��ü�� ���� �������� ���ϴ� API�̴�.
//2���� ��ü,�ν��Ͻ��� ���ΰ��� �ν��Ͻ����� �����ִ� �������� ����
//�������� ���� ��������,�������̵����䵵!
//���⼭ equals�� ������ƮŬ������ equals�޼ҵ带 �������̵��Ѱ��̴�
class Student{
    String name;
    Student(String name){
        this.name = name;
    }
    public boolean equals(Object obj) {//�������̵� ������
    	//Object obj�� �������� ������� ����
    	//Object obj=s2(new Student("egoing");)�� �ڽ��� �θ��༼�� �ϴ��Ŷ� �����ϴ�
    	// A obj = new B();
    	Student s = (Student)obj;//�̷��� ����� ����ȯ�ϴ� ������ ������ name������ �����ϱ����ؼ� 
        return this.name == s.name;//�̰� �񱳿����� ���װ� ������ ���� ���ؼ� ����
    }
}
class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student("egoing");
        Student s2 = new Student("egoing");
        System.out.println(s1 == s2);//flase s1�� s2�� ���� �ٸ� ��ü�̱� �����̴�
        System.out.println(s1.equals(s2));//�̰��� false����  true�� �ٲ۰�
        //String name="egoing"; //�� ���ٸ� �������̵��ؼ� �ٲ۰�
    }
 //���߿� hashcode�����ؼ��� �˾ƺ� �̰Ŷ�����
 //��������� equals�� ������Ʈ Ŭ������ ������ �״�� ����ϴ°� ����
}