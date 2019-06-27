package Chapter22;
import java.util.Iterator;
import java.util.HashSet;

class SimpleNumber
{
	int num;
	public SimpleNumber(int n)
	{
		num=n;
	}
	public String toString()
	{
		return String.valueOf(num);//int를 스트링으로
		//String 클래스의 static 메소드인 valueOf 는 기본 자료형 데이터를 String 인스턴스로 변환해 준다.
	}
}

class a08_HashSetEqualityOne
{
	public static void main(String[] args)
	{
		HashSet<SimpleNumber> hSet=new HashSet<SimpleNumber>();
		hSet.add(new SimpleNumber(10));
		hSet.add(new SimpleNumber(20));
		hSet.add(new SimpleNumber(20));//인스터스마다 다른주소값이니까 다른 걸로 인식해서 중복값이 출력
		//HashSet은 equals메소드로 동등비교를 한다 equals메소드는 주소값을 비교한다.
		//같은값으로 인식하길 원한다면 내가 equals메소드를 오버라이딩해야한다
		
		System.out.println("저장된 데이터 수: "+hSet.size());
		
		Iterator<SimpleNumber> itr=hSet.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}