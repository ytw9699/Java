package Chapter6;
class InfRecul
{
	public static void main(String[] args)
	{
		showHi(3);
	}

	public static void showHi(int cnt)
	{
		System.out.println("Hi~ ");
		showHi(cnt--);//��Ͱ� �����������..--cnt�� �ٲ����
		if(cnt==1)  //�̰͵� �޼ҵ�� ��͸� �θ��� �߰��� ����������
			return;
	}
}