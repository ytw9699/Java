package z_Collection_Framework2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class d_Set�Ǵپ��Ѹ޼ҵ� {
public static void main(String[] args) {
	//���п����� ����(����̾�׷�)�� �� set�� �ǹ̴� ���� ���α׷���ȭ�Ѱ�
	//���վȿ����� ���� �ߺ��� ������
    HashSet<Integer> A = new HashSet<Integer>();
    A.add(1);
    A.add(2);
    A.add(3);
     
    HashSet<Integer> B = new HashSet<Integer>();
    B.add(3);
    B.add(4);
    B.add(5);
     
    HashSet<Integer> C = new HashSet<Integer>();
    C.add(1);
    C.add(2);
     
    System.out.println(A.containsAll(B));
    // false//B��A�� �κ�����(SUBSET)�̾ƴϴ�//A�ȿ� B��ü�� ��������ʾƼ� FALSE
    //A�� �޼ҵ� containsAll
    //A��� ���տ� B��� ������ ��ü ���Ұ� ����ִ°�
    System.out.println(A.containsAll(C));
    // true//C�� A�� �κ������̴�//A�ȿ�C��ü�� ����־ TRUE
     
    A.addAll(B);//B��ü�� A�� ���Ѵ� ������
    //A.retainAll(B);//retain�� �����ϴٶ�¶� A���� �ְ� B�����ִ°Ÿ� A�� ��ڴ� ������
    //A.removeAll(B);//������//A���տ��ִ°��߿� B�� �ִ°Ÿ� ���ڴ�
    Iterator hi = A.iterator();
    while(hi.hasNext()){
        System.out.println(hi.next());
    }
}
}
//https://prashantgaurav1.files.wordpress.com/2013/12/java-util-collection.gif
