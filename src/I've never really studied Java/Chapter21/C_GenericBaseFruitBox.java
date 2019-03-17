package Chapter21;
class Orange
{
	int sugarContent;	// ��� �Է�
	public Orange(int sugar) { sugarContent=sugar; }
	public void showSugarContent()
	{ 
		System.out.println("�絵 "+sugarContent);
	}
}

class Apple
{
	int weight;	// ����� ����
	public Apple(int weight) { this.weight=weight; }
	public void showAppleWeight()
	{ 
		System.out.println("���� "+weight);
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
		apBox.store(new Apple(20));//�ڷ����� �������� ���Ǽ��� �Ѵ� ���� ���׸�����
		Apple app=apBox.pullOut();
		app.showAppleWeight();
	}
}