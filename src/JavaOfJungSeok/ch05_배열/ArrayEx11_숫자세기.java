package ch05_배열;
class ArrayEx11_숫자세기 {
	public static void main(String[] args) {
		
		int[] numArr  = new int[10];
		int[] counter = new int[10];

		for (int i=0; i < numArr.length ; i++ ) {
			numArr[i] = (int)(Math.random() * 10); // 0~9의 임의의 수를 배열에 저장
			System.out.print(numArr[i]);
		}
		System.out.println();

		for (int i=0; i < numArr.length ; i++ ) {
			counter[numArr[i]]++;//카운터배열의 각요소(0으로초기화되어있는것)
			//들을 횟수를 1씩 증가시켜주는것
		}

		for (int i=0; i < numArr.length ; i++ ) {
			System.out.println( i +"의 개수 :"+ counter[i]);
		}
	} // main의 끝
}
