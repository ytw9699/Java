package Chapter20;
class A_BoxingUnboxing
{	
	public static void main(String[] args)
	{
		Integer iValue=new Integer(10);//�ڽ�
		Double dValue=new Double(3.14);//�ڽ�
		
		System.out.println(iValue);//����Ʈ�� �޼ҵ� ȣ��
		System.out.println(dValue);//����Ʈ�� �޼ҵ� ȣ��
		
		iValue=new Integer(iValue.intValue()+10);//��ڽ��� �ٽ� �ڽ�
		dValue=new Double(dValue.doubleValue()+1.2);//��ڽ��� �ٽ� �ڽ�
		
		System.out.println(iValue);//����Ʈ�� �޼ҵ� ȣ��
		System.out.println(dValue);	//����Ʈ�� �޼ҵ� ȣ��	
	}
}