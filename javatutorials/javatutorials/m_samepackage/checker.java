package m_samepackage;
import m_otherpackage.*;
public class checker {}

class SameClassChecker{//1.���� Ŭ������ ���
	public SameClassChecker() {//�����ڰ���
		//���� Ŭ������ �����ϴ� ��� �޼ҵ�,����  ���� ����
		this._public();//�ڱ��ڽſ��� ���ǵ� �޼ҵ� ȣ��
		this._protected();
		this._default();
		this._private();
	}
	private void _private() {
		System.out.println("private");
	}
	void _default() {//���������� ��þ��ϸ� default ���������
		System.out.println("default");
	}
	protected void _protected() {
		System.out.println("protected");
	}
	public void _public() {
		System.out.println("public");
	}
}
class SamePackageChecker{//2.���� ��Ű���ΰ��
	public SamePackageChecker() {
	
		Same same = new Same();	
		//���� ��Ű���� Ŭ������ ��ü�����ؼ� �޼ҵ忡 ���ٰ���
		same._public();
		same._protected(); 
		same._default();
		//same._private();//������ ���� �����ڰ����� �޼ҵ常 ���� �Ұ�
	}
}
class SamePackageChecker2 extends Same{//2.���� ��Ű���� ��ӹ޴� Ŭ������ �����Ҷ�
	public SamePackageChecker2() {
		//���� ��Ű�� ��Ӱ����϶� Same Ŭ������ �޼ҵ忡 �����ϸ� �������
		this._public();//this�� 1�������� Ŭ���� �ڽ���
		//SamePackageChecker�� �ǹ�������
		//��ӹ�������̰� ��ü������ ���� �޼ҵ峪 �ʵ尡 ������ϸ� �θ�Ŭ�������� 
		//�޼ҵ带 ��ȸ��
		this._protected();
		this._default();
		//this._prviate();
	}
}
class otherpackagechecker extends other{//3.�ٸ���Ű��
	public otherpackagechecker() {
		nothing nothing = new nothing();//3-3�ٸ���Ű��  Ŭ���� ��ü�����ؼ�
		nothing._public();
		//nothing._protected();
		//nothing._default();
		//nothing._private();
		
		other other = new other();//3-1 �ٸ���Ű���̰� ��Ӱ����̴���
		//��ü�� ������ �����Ҷ�
		other._public();//���������ڰ� �ۺ��θ޼ҵ常 ���ٰ���
		//other._protected();//��Ӱ��� ���� ��ü�����ϸ� ���ٺҰ�������
		//other._default();
		//other._private();
		
		this._public();//3-2�ٸ���Ű�������� ��Ӱ����� �θ�Ŭ������ this������ �����Ҷ�
		this._protected();	//������ other��� Ŭ������ ����ϸ鰡��
		//this._default();
		//this._private();	
	}
}

