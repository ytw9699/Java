package Chapter21;
class Orange1
{
	int sugarContent;	// ��� �Է�
	public Orange1(int sugar) { sugarContent=sugar; }
	public void showSugarContent() { System.out.println("�絵 "+sugarContent); }
}

class OrangeBox1
{
    Orange1 item;
    
    public void store(Orange1 item){ 
    	this.item=item; 
    }
    
    public Orange1 pullOut() { 
    	return item; 
    	}
    
}

class A_OrangeBaseOrangeBox
{	
	public static void main(String[] args)
	{
		OrangeBox1 fBox1=new OrangeBox1();
		fBox1.store(new Orange1(10));
		Orange1 org1=fBox1.pullOut();
		org1.showSugarContent();
		
		OrangeBox1 fBox2=new OrangeBox1();
		fBox2.store("������");//�����߻�����//��Ʈ��Ÿ���̶� �ȵȴ�//���������� �ڷ������� ������ �����̴�
		Orange1 org2=fBox2.pullOut();
		org2.showSugarContent();	
	}
}