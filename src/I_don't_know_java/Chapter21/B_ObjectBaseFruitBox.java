package Chapter21;
class Orange2
{
	int sugarContent;	// ��� �Է�
	public Orange2(int sugar) { sugarContent=sugar; }
	public void showSugarContent()
	{ 
		System.out.println("�絵 "+sugarContent);
	}
}

class FruitBox2
{
	Object item;
	public void store(Object item) { this.item=item; }
	public Object pullOut() { return item; }
}

class B_ObjectBaseFruitBox
{	
	public static void main(String[] args)
	{
		FruitBox2 fBox1=new FruitBox2();
		fBox1.store(new Orange2(10));
		Orange2 org1=(Orange2)fBox1.pullOut();
		org1.showSugarContent();
		
		FruitBox2 fBox2=new FruitBox2();
		fBox2.store("������");//�ڷ����� ������ ���°� �ƴϴ�
		Orange2 org2=(Orange2)fBox2.pullOut();//���� �߻�����	
		org2.showSugarContent();
	}
}