package ch05_배열;
import java.util.Arrays;  // Arrays.toString()을 사용하기 위해 추가
//[1,2,] 이런형식으로 배열을 출력하기위해
class ArrayEx02_배열의초기화_및_출력 {
	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[]{100, 95, 80, 70, 60};
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};

		for (int i=0; i < iArr1.length ; i++ ) {
			iArr1[i] = i + 1; // 1~10의 숫자를 순서대로 배열에 넣는다.
		}
		for (int i=0; i < iArr2.length ; i++ ) {
			iArr2[i] = (int)(Math.random()*10) + 1; // 1~10의 랜덤 값을 배열에 저장
		}
		for(int i=0; i < iArr1.length;i++) {// 배열에 저장된 값들을 출력한다.
			System.out.print(iArr1[i]+",");	
		}
		System.out.println();													
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		//[I’는 1차원 int배열이 라는 의미이고，‘@’뒤에 나오는 16진수는 배열의 주소인데 실제 주소가 아닌 내부 주소이다
		System.out.println(chArr);
		//예외적으로 char배열은 println메서드로 출력하면 각 요소가 구분자없이 그대로 출력되는 
		//데，이것은 println메서드가 char배열일 때만 이렇게 동작하도록 작성되었기 때문이다.
	}
}
