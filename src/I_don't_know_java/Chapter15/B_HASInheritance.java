package Chapter15;
class Gun1
{
	int bullet;    	// ������ �Ѿ��� ��
	
	public Gun1(int bnum){
		bullet=bnum;
		}
	public void shut()
	{
		System.out.println("BBANG!");
		bullet--;
	}
}

class Police1 extends Gun//������ ������ ���� �����ϰԵȴ�
{							//���ѿ����
	int handcuffs;	     // ������ ������ ��
	
	public Police1(int bnum, int bcuff)
	{
		super(bnum);
		handcuffs=bcuff;
	}
	public void putHandcuff() 
	{
		System.out.println("SNAP!");
		bullet--;
	}
}

class B_HASInheritance
{
	public static void main(String[] args)
	{
		Police pman=new Police(5, 3);
		pman.shut();
		pman.putHandcuff();
	}
}