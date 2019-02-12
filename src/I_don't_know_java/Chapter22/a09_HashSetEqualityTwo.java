package Chapter22;
import java.util.Iterator;
import java.util.HashSet;

class SimpleNumber2
{
	int num;
	public SimpleNumber2(int n)
	{
		num=n;
	}
	public String toString()
	{
		return String.valueOf(num);
	}
	public int hashCode()//해시코드는 성능을 개선해주는것이다 num 값을 3으로 나눠서 분류해둔다
	{
		return num%3;
	}
	public boolean equals(Object obj) // 이 메소드의 리턴값으로 해시셋의 중복여부를 결정한다
	{
		SimpleNumber2 comp=(SimpleNumber2)obj;
		if(comp.num==num)//인스턴스 변수 num이 같을때 동일 인스턴스로 간주
			return true;
		else
			return false;		
	}
}

class a09_HashSetEqualityTwo
{
	public static void main(String[] args)
	{
		HashSet<SimpleNumber2> hSet=new HashSet<SimpleNumber2>();
		hSet.add(new SimpleNumber2(10));
		hSet.add(new SimpleNumber2(20));
		hSet.add(new SimpleNumber2(20));
		
		System.out.println("저장된 데이터 수: "+hSet.size());
		
		Iterator<SimpleNumber2> itr=hSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}