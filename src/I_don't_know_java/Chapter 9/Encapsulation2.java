class SinivelCap   // �๰ óġ�� ĸ��
{
	public void take(){System.out.println("�๰�� ��~ ���ϴ�.");}
}

class SneezeCap   // ��ä�� óġ�� ĸ��
{
	public void take() {System.out.println("��ä�Ⱑ �ܽ��ϴ�.");}
}

class SnuffleCap   // �ڸ��� óġ�� ĸ��
{
	public void take() {System.out.println("�ڰ� �� �ո��ϴ�.");}
}

class CONTAC600 
{
	SinivelCap sin;
	SneezeCap sne;
	SnuffleCap snu;
	
	public CONTAC600()
	{
		sin=new SinivelCap();
		sne=new SneezeCap();
		snu=new SnuffleCap();
	}
	public void take()
	{
		sin.take();
		sne.take();
		snu.take();
	}
}

class ColdPatient
{
	public void takeCONTAC600(CONTAC600 cap){cap.take();}
}

class Encapsulation2
{
	public static void main(String args[])
	{
		ColdPatient sufferer = new ColdPatient();
		sufferer.takeCONTAC600(new CONTAC600());

	}
}