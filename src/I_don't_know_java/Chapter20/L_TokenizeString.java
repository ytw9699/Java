package Chapter20;
import java.util.StringTokenizer;

class L_TokenizeString
{	
	public static void main(String[] args)
	{
		String strData="11:M22:33:44M55";
		StringTokenizer st=new StringTokenizer(strData, ":;M");// :M�� �����ڰ� �Ǳ⵵�ϰ� :�� �����ڰ� �Ǳ⵵�ϰ� M�� �����ڰ��Ǳ⵵��
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());

		strData="11:22:33:44:55";
		st=new StringTokenizer(strData, ":");
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
	}
	
}