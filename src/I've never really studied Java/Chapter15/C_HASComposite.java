﻿package Chapter15;
class Gun
{
	int bullet;		// 장전된 총알의 수
	
	public Gun(int bnum){bullet=bnum;}
	public void shut()
	{
		System.out.println("BBANG!");
		bullet--;
	}
}

class Police
{
	int handcuffs;	// 소유한 수갑의 수
	Gun pistol;		// 소유하고 있는 권총//경찰은 총을 소유할수도있고 안할수도 있고
					//강한연결고리가없다
	public Police(int bnum, int bcuff)
	{
		handcuffs=bcuff;
		if(bnum!=0)//경찰은 총을 소유할수도있고 안할수도 있고
			pistol=new Gun(bnum);
		else
			pistol=null;
	}
	public void putHandcuff() 
	{
		System.out.println("SNAP!");
		handcuffs--;
	}
	public void shut()
	{
		if(pistol==null)
			System.out.println("Hut BBANG!");
		else
			pistol.shut();
	}
}

class HasComposite
{
	public static void main(String[] args)
	{
		Police haveGun=new Police(5, 3);	// 총알 5, 수갑 3
		haveGun.shut();
		haveGun.putHandcuff();
		
		Police dontHaveGun=new Police(0, 3);	// 총알 0, 수갑 3
		dontHaveGun.shut();
	}
}