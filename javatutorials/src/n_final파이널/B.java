package n_final���̳�;

class A{
    final void b(){}

void aa() {}
}

class B extends A{
    //void b(){}  //final �޼ҵ� b�� �������̵� �Ϸ��ϱ� ������ ������ �߻��Ѵ�.
	void aa() {}
}

final class C{
    final void b(){
    }
}
//class D extends C{ }  //final Ŭ������ ����Ϸ��ϰ� �ִ�. ���� ������ �߻��Ѵ�.