package m_����������;

class A {
    public String y(){//�����â��
        return "public void y()";
    }
    private String z(){//�ݰ���, private�� �����Ŵ� ���� Ŭ�����ȿ����� ���� �����ϰ�
    	//�ٸ� Ŭ���������� ���������� ���� �Ұ�
        return "public void z()";
    }
    public String x(){//�����â��
        return z();
    }
}
public class b_AccessDemo1 {//��Ŭ������ aŬ������ ���� ��
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y());
        // �Ʒ� �ڵ�� ������ �߻��Ѵ�.
        //System.out.println(a.z());//private�̶� ���ٺҰ� 
        System.out.println(a.x());//������ ������ ���� ���� 
    }
}