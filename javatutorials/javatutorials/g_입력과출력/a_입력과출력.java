package g_�Է°����;

class a_�Է°����{
    public static void main(String[] args){
	//3.������ ���θ޼ҵ�� �Է°����൵ ��������� �ຸ��
	//string[] args �Ű������� �޼ҵ尡 ȣ��� �� ���޵� �Է� ���� �޼ҵ� ���η� �����ϴ� ������ �ϴ� ������.
	//one two �̷��� �־��ָ� �迭�� ù��° �ε����δ� one �ι�°�� two��  �ִ°�
    //String[] args= {"one","two"};�̷��� �����ϰ� ���ذŶ� ������
    System.out.println(args.length);//�� �迭�� ���̴� 2����
    System.out.println(args);//[Ljava.lang.String;@7852e922
    
    testmethod("a");
  //testmethod();//�̰Ŵ� 2.�ƹ� �Է°��� ���������� �޼ҵ� ȣ��ȵ�
}
public static void testmethod(String a) {//1.�̷��� �Է°��� �޴´ٰ� �ϸ�
	System.out.println(a);
    }
}
