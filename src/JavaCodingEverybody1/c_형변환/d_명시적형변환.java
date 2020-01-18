package c_형변환;

public class d_명시적형변환 {

	public static void main(String[] args) {
		//float a = 100.0; //오류 자동형변환 안됨
		//int b = 100.0F; //오류 자동형변환 안됨
		
		float c = (float)100.0;//이게 명시적 형변환 강제적으로 
		int d = (int)100.0F;//이게 명시적 형변환 강제적으로
		int e = (int)100.1F;//하지만 손실이 발생 0.1날라감//
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
