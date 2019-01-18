class Orange
{
	int sugarContent;	// ��� �Է�
	public Orange(int sugar) { sugarContent=sugar; }
	public void showSugarContent()
	{ 
		System.out.println("�絵 "+sugarContent);
	}
}

class FruitBox
{
	Object item;
	public void store(Object item) { this.item=item; }
	public Object pullOut() { return item; }
}

class ObjectBaseFruitBox
{	
	public static void main(String[] args)
	{
		FruitBox fBox1=new FruitBox();
		fBox1.store(new Orange(10));
		Orange org1=(Orange)fBox1.pullOut();
		org1.showSugarContent();
		
		FruitBox fBox2=new FruitBox();
		fBox2.store("������");
		Orange org2=(Orange)fBox2.pullOut();
		org2.showSugarContent();	
	}
}