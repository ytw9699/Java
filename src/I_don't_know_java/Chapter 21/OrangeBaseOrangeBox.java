class Orange
{
	int sugarContent;	// ��� �Է�
	public Orange(int sugar) { sugarContent=sugar; }
	public void showSugarContent() { System.out.println("�絵 "+sugarContent); }
}

class OrangeBox
{
    Orange item;
    public void store(Orange item) { this.item=item; }
    public Orange pullOut() { return item; }
}

class OrangeBaseOrangeBox
{	
	public static void main(String[] args)
	{
		OrangeBox fBox1=new OrangeBox();
		fBox1.store(new Orange(10));
		Orange org1=fBox1.pullOut();
		org1.showSugarContent();
		
		OrangeBox fBox2=new OrangeBox();
		fBox2.store("������");
		Orange org2=fBox2.pullOut();
		org2.showSugarContent();	
	}
}