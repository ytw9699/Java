package Chapter9;
class SinivelCap2   // �๰ óġ�� ĸ��
{
	public void take(){System.out.println("�๰�� ��~ ���ϴ�.");}
}

class SneezeCap2   // ��ä�� óġ�� ĸ��
{
	public void take() {System.out.println("��ä�Ⱑ �ܽ��ϴ�.");}
}

class SnuffleCap2   // �ڸ��� óġ�� ĸ��
{
	public void take() {System.out.println("�ڰ� �� �ո��ϴ�.");}
}

class CONTAC600 
{
	SinivelCap2 sin;
	SneezeCap2 sne;
	SnuffleCap2 snu;
	
	public CONTAC600()
	{
		sin=new SinivelCap2();
		sne=new SneezeCap2();
		snu=new SnuffleCap2();
	}
	public void take()
	{
		sin.take();//�̷��� ������ �����ִ°� �̰� ĸ��ȭ�� �����̴�
		sne.take();//�̷��� ������ �����ִ°� �̰� ĸ��ȭ�� �����̴�
		snu.take();//�̷��� ������ �����ִ°� �̰� ĸ��ȭ�� �����̴�
	}
}

class ColdPatient2
{
	public void takeCONTAC600(CONTAC600 cap){
		cap.take();//�� �޼ҵ� �ϳ��� �˸� �˾Ƽ����ִ� ����
		}
}

class Encapsulation2
{
	public static void main(String args[])
	{
		ColdPatient2 sufferer = new ColdPatient2();
		sufferer.takeCONTAC600(new CONTAC600());

	}
}