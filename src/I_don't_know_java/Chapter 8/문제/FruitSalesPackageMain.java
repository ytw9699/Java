	import orange.seller.FruitSeller;
	import orange.buyer.FruitBuyer;
	
	class FruitSalesPackageMain
	{
		public static void main(String[] args)
		{
			FruitSeller seller1 = new FruitSeller(0, 30, 1500);
			FruitSeller seller2 = new FruitSeller(0, 20, 1000);
			
			FruitBuyer buyer = new FruitBuyer(10000);
			buyer.buyApple(seller1, 2000);
			buyer.buyApple(seller2, 4500);
			
			System.out.println("���� �Ǹ���1�� ���� ��Ȳ");
			seller1.showSaleResult();
		
			System.out.println("���� �Ǹ���2�� ���� ��Ȳ");
			seller2.showSaleResult();
			
			System.out.println("���� �������� ���� ��Ȳ");
			buyer.showBuyResult();
		}
	}
