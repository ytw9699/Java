package Chapter20;
import java.math.*;

class D_SoBigInteger
{
	public static void main(String[] args)
	{
		System.out.println("�ִ� ����: " + Long.MAX_VALUE);
		System.out.println("�ּ� ����: " + Long.MIN_VALUE);
		
		BigInteger bigValue1=new BigInteger("100000000000000000000");
		BigInteger bigValue2=new BigInteger("-99999999999999999999");
		
		BigInteger addResult=bigValue1.add(bigValue2);
		BigInteger mulResult=bigValue1.multiply(bigValue2);
		
		System.out.println("ū ���� �������: "+addResult);
		System.out.println("ū ���� �������: "+mulResult);
	}
}