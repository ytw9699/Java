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
	}
}

class a03_HashSetEqualityOne
{
	public static void main(String[] args)
	{
		HashSet<SimpleNumber> hSet=new HashSet<SimpleNumber>();
		hSet.add(new SimpleNumber(10));
		hSet.add(new SimpleNumber(20));
		hSet.add(new SimpleNumber(20));//인스터스마다 다른주소값이니까 다른 걸로 인식해서 중복값이 출력
		//같은값으로 인식하길 원한다면 내가 커스토마이징해야한다
		
		System.out.println("저장된 데이터 수: "+hSet.size());
		
		Iterator<SimpleNumber> itr=hSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}