package Chapter15;
class Gun1
{
	int bullet;    	// 장전된 총알의 수
	
	public Gun1(int bnum){
		bullet=bnum;
		}
	public void shut()
	{
		System.out.println("BBANG!");
		bullet--;
	}
}

class Police1 extends Gun//경찰은 무조건 건을 소유하게된다
{							//강한연결고리
	int handcuffs;	     // 소유한 수갑의 수
	
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