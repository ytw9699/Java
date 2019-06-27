package Chapter21;
class Fruit4
{
	public void showYou()
	{ 
		System.out.println("난 과일입니다.");
	}
}

class Apple4 extends Fruit4
{
	public void showYou()
	{
		super.showYou();
		System.out.println("난 붉은 과일입니다.");
	}	
}

class FruitBox4<T>
{
	T item;
	public void store(T item) { this.item=item; }
	public T pullOut() { return item; }
}

class H_IntroWildCard
{
	public static void openAndShowFruitBox(FruitBox4< ? extends Fruit4 > box)//Fruit4상속하는 모든 클래스
	{
		Fruit4 fruit=box.pullOut();
		fruit.showYou();
	}
	public static void main(String[] args)
	{
		FruitBox4<Fruit4> box1=new FruitBox4<Fruit4>();
		box1.store(new Fruit4());
		
		FruitBox4<Apple4> box2=new FruitBox4<Apple4>();
		box2.store(new Apple4());
		
		openAndShowFruitBox(box1);
		openAndShowFruitBox(box2);
	}
}