package c_형변환;

public class c_자동형변환 {

	public static void main(String[] args) {
		//캐릭터 데입터타입도 int형 변환가능 캐릭터도 내부적으로 숫자이기때문,
		//문자의 유니코드값으로 변환이 된다
		int f = 'a';//자신보다 낮은 타입이기때문 자동형변환
		//int f = "aa";//스트링은 안됨
		char d='d';
		System.out.println(f);//97 // 0~65,535
		///////////////////////////////////////
		System.out.println(d);
		int a = 3;
		float b = 1.0F;
		double c = a + b;//a는 int b는 플로트인데 더할려면 형을 같게해야함 
		//그러면 자동적으로 정수인 a가 실수인플로트 형으로 형변환될거임
		//즉 3.0F+1.0F가 될거임=4.0F가됨
		//그런데 그 4.0F를  더블형에 집어넣으니까 더블형으로 자동형변환됨
		System.out.println(c);
	}

}
