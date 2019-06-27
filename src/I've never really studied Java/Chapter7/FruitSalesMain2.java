﻿package Chapter7;
class FruitSeller2
{
	int numOfApple;
	int myMoney;
	int APPLE_PRICE;
	
	public int saleApple(int money)
	{
		int num=money/APPLE_PRICE;
		numOfApple-=num;
		myMoney+=money;
		return num;
	}
	public void showSaleResult()
	{
		System.out.println("남은 사과: " + numOfApple);
		System.out.println("판매 수익: " + myMoney);
	}
	public void initMembers(int money, int appleNum, int price)//이생성자는 한번이 아니라 여러번 가능하다는 단점이 있음
	{
		myMoney=money;
		numOfApple=appleNum;
		APPLE_PRICE=price;
	}
} 

class FruitBuyer2
{
	int myMoney=10000;   // 여기서도 클래스의 변경이 발생!
	int numOfApple=0;
	
	public void buyApple(FruitSeller2 seller, int money)
	{
		numOfApple+=seller.saleApple(money);
		myMoney-=money;
	}
	public void showBuyResult()
	{
		System.out.println("현재 잔액: " + myMoney);
		System.out.println("사과 개수: " + numOfApple);		
	}
}

class FruitSalesMain2
{
	public static void main(String[] args)
	{
		FruitSeller2 seller1 = new FruitSeller2();
		seller1.initMembers(0, 30, 1500);
		
		FruitSeller2 seller2 = new FruitSeller2();
		seller2.initMembers(0, 20, 1000);
		
		FruitBuyer2 buyer = new FruitBuyer2();
		buyer.buyApple(seller1, 4500);
		buyer.buyApple(seller2, 2000);
		
		System.out.println("과일 판매자1의 현재 상황");
		seller1.showSaleResult();
		
		System.out.println("과일 판매자2의 현재 상황");
		seller2.showSaleResult();
		
		System.out.println("과일 구매자의 현재 상황");
		buyer.showBuyResult();
	}
}