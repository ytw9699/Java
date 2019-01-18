class Person
{
	private int perID;
	private int milID;
	
	public Person(int pID, int mID)
	{
		perID=pID;
		milID=mID;
	}
	public Person(int pID)
	{
		perID=pID;
		milID=0;
	}
	public void showInfo()
	{
		System.out.println("�ι�: "+perID);
		if(milID!=0)
			System.out.println("����: "+milID+'\n');
		else
			System.out.println("���� ���� ���� \n");
	}
}

class Overloading
{
	public static void main(String[] args)
	{
		Person man=new Person(950123, 880102);
		Person woman=new Person(941125);	
		man.showInfo();
		woman.showInfo();
	}
}