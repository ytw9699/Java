package Chapter21;
class Orange
{
	int sugarContent;	// 당분 함량
	public Orange(int sugar) { sugarContent=sugar; }
	public void showSugarContent()
	{ 
		System.out.println("당도 "+sugarContent);
	}
}

class Apple
{
	int weight;	// 사과의 무게
	public Apple(int weight) { this.weight=weight; }
	public void showAppleWeight()
	{ 
		System.out.println("무게 "+weight);
	}	
}

class FruitBox<T>
{
	T item;
	public void store(T item) { this.item=item; }
	public T pullOut() { return item; }
}

class C_GenericBaseFruitBox
{	
	public static void main(String[] args)
	{
		FruitBox<Orange> orBox=new FruitBox<Orange>();
		orBox.store(new Orange(10));
		Orange org=orBox.pullOut();
		org.showSugarContent();
		
		FruitBox<Apple> apBox=new FruitBox<Apple>();
		apBox.store(new Apple(20));//자료형의 안정성과 편의성을 둘다 갖춘 제네릭구조
		Apple app=apBox.pullOut();
		app.showAppleWeight();
	}
}