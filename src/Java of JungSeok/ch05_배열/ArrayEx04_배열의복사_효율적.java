﻿package ch05_배열;
class ArrayEx04_배열의복사_효율적 {
	public static void main(String[] args) {
		
		char[] abc = { 'A', 'B', 'C', 'D'};
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		System.out.println(abc);
		System.out.println(num);

		// 배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
		char[] result = new char[abc.length+num.length];
		
		System.arraycopy(abc, 0, result, 0, abc.length);
		//abc의 배열의 0번째부터 length만큼 result의 배열의 0번째부터 length만큼 복사 
		System.out.println(result);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);

		System.arraycopy(abc, 0, num, 0, abc.length);	
		// 배열 abc을 배열 num의 첫 번째 위치부터 배열 abc의 길이만큼 복사
		System.out.println(2);
		System.out.println(num);

	     // number의 인덱스6 위치에 3개를 복사 // 678위치에 복사하는것
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
	}
}
