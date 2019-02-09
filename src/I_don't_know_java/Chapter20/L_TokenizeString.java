package Chapter20;
import java.util.StringTokenizer;

class L_TokenizeString
{	
	public static void main(String[] args)
	{
		String strData="11:M22:33:44M55";
		StringTokenizer st=new StringTokenizer(strData, ":;M");// :M이 구분자가 되기도하고 :이 구분자가 되기도하고 M이 구분자가되기도함
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());

		strData="11:22:33:44:55";
		st=new StringTokenizer(strData, ":");
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
	}
	
}