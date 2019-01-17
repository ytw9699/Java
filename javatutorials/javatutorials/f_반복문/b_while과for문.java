package f_반복문;//반복문(loop, iteration)이다.

public class b_while과for문 {
	public static void main(String[] args) {
	int i = 0;
	// i의 값이 10보다 작다면 true, 크다면 false가 된다. 현재 i의 값은 0이기 때문에 이 반복문은 실행된다. 
	while(i<10){  //이때 i<10의 값을 검사하게 된다.       
		System.out.println("Coding Everybody"+i); 
		i++;// i의 값에 1을 더한다. 반복문의 중괄호의 마지막 라인에 도달하면 반복문은 반복문을 재호출한다.
}
//for(초기화(가장먼저 한번만 실행); 종료(반복)조건; 반복실행){
	for (int a = 0; a < 10; a++) {
        System.out.println("Coding Everybody " + a);
    }
}
}
