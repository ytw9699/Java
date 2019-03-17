package Chapter22;
import java.util.Iterator;
import java.util.TreeSet;

class a10_SortTreeSet
{
	public static void main(String[] args)
	{
		TreeSet<Integer> sTree = new TreeSet<Integer>();
		sTree.add(1);
		sTree.add(2);
		sTree.add(4);
		sTree.add(3);
		sTree.add(2);//중복 허용안함	
		
		System.out.println("저장된 데이터 수: "+sTree.size());
		
		Iterator<Integer> itr=sTree.iterator();//이터레이터는 정렬된 데이터를 항상 오름차순으로 참조
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}