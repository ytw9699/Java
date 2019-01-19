package Chapter7;
class FruitSeller3
{
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;//���̳ε� �̷��� �����ڸ� ���� �ʱ�ȭ�ϸ� ���� �����
	
	public FruitSeller3(int money, int appleNum, int price)
	{
		myMoney=money;
		numOfApple=appleNum;
		APPLE_PRICE=price;
	}
	
	public int saleApple(int money)
	{
		int num=money/APPLE_PRICE;
		numOfApple-=num;
		myMoney+=money;
		return num;
	}
	public void showSaleResult()
	{
		System.out.println("���� ���: " + numOfApple);
		System.out.println("�Ǹ� ����: " + myMoney);
	}
} 

class FruitBuyer3
{
	int myMoney;
	int numOfApple;
	
	public FruitBuyer3(int money)
	{
		myMoney=money;
		numOfApple=0;
	}
	
	public void buyApple(FruitSeller3 seller, int money)
	{
		numOfApple+=seller.saleApple(money);
		myMoney-=money;
	}
	public void showBuyResult()
	{
		System.out.println("���� �ܾ�: " + myMoney);
		System.out.println("��� ����: " + numOfApple);		
	}
}

class FruitSalesMain3
{
	public static void main(String[] args)
	{
		FruitSeller3 seller1 = new FruitSeller3(0, 30, 1500);
		FruitSeller3 seller2 = new FruitSeller3(0, 20, 1000);
		
		FruitBuyer3 buyer = new FruitBuyer3(10000);
		buyer.buyApple(seller1, 4500);
		buyer.buyApple(seller2, 2000);
		
		System.out.println("���� �Ǹ���1�� ���� ��Ȳ");
		seller1.showSaleResult();
		
		System.out.println("���� �Ǹ���2�� ���� ��Ȳ");
		seller2.showSaleResult();
		
		System.out.println("���� �������� ���� ��Ȳ");
		buyer.showBuyResult();
	}
}