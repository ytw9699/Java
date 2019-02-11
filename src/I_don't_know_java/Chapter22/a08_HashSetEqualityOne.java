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
		return String.valueOf(num);//int�� ��Ʈ������
		//String Ŭ������ static �޼ҵ��� valueOf �� �⺻ �ڷ��� �����͸� String �ν��Ͻ��� ��ȯ�� �ش�.
	}
}

class a08_HashSetEqualityOne
{
	public static void main(String[] args)
	{
		HashSet<SimpleNumber> hSet=new HashSet<SimpleNumber>();
		hSet.add(new SimpleNumber(10));
		hSet.add(new SimpleNumber(20));
		hSet.add(new SimpleNumber(20));//�ν��ͽ����� �ٸ��ּҰ��̴ϱ� �ٸ� �ɷ� �ν��ؼ� �ߺ����� ���
		//HashSet�� equals�޼ҵ�� ����񱳸� �Ѵ� equals�޼ҵ�� �ּҰ��� ���Ѵ�.
		//���������� �ν��ϱ� ���Ѵٸ� ���� equals�޼ҵ带 �������̵��ؾ��Ѵ�
		
		System.out.println("����� ������ ��: "+hSet.size());
		
		Iterator<SimpleNumber> itr=hSet.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}