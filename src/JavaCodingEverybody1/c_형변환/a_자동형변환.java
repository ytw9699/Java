﻿package c_형변환;
//형 변환(Type Conversion)이란 데이터의 타입을 변경하는 것이다.
//int를 double 이나 float로 바꾸고 싶을때
//예를 들어 int 타입의 정수 200을 컴퓨터에서 실제로 다루는 
//숫자 0과1로 저장한 bit(비트는 0과1임) 값은 아래와 같다.
//이런식의 데이터가 만들어진다 00000000 00000000 00000000 11001000
//위의 데이터는 8X4개의 자릿수로 이루어져 있다. 이것을 32bit라고 부른다 int는 4byte 1byte는 8bit
//위의 데이터는 int 형으로 숫자 200을 저장했을 때 메모리상에 만들어지는 내용이다.
//실수형인 float 타입으로 정수 200.0을 저장하면 어떻게 될까?
//01000011 01001000 00000000 00000000
//이렇게 형식이 다른 데이터(정수와 실수)들을 더하려면
//한쪽의 데이터 타입을 다른 쪽의 데이터 타입으로 전환(Conversion)해야 한다. 
//자바는 이러한 형 변환을 자동으로 처리해주는데 이러한 전환작업을 
//자동(암시적) 형 변환(implicit Conversion)이라고 부른다.
public class a_자동형변환 {
	public static void main(String[] args) {
	double a = 3.0F;
	//3.0F라는 플로트형을 더블형의 변수에 대입하는데 에러가 발생하지않는다
	//이유는 더블형으로 자동으로 형변환 하기때문 왜냐면 플로트가 표현할수있는 정보의 범위가 더블이 표현할수있는
	//범위안에 포함되기때문, 즉 형 변환하여도 데이터 손실이 발생하지않기 때문
	//float a =3.0; 그러니까 이건 오류가 발생함 더 큰 범위의 더블형을 더작은 플로트안에 집어넣으려하니까
	//그 과정에 손실이 발생가능성이 있기때문
	//자동 형 변환의 원칙은 표현범위가 좁은 데이터 타입에서 넓은 데이터 타입으로의 변환만 허용된다는 것이다.
	//그런데 이와같은 법칙과는 예외적으로..?
	byte e = 100; //여기서 100이라는 상수는 int형인데도 byte형으로 안바꿔줘도 이거는 허용된다 
	//byte f = 200;//단 byte의 범위를 넘어서면 안된다 
	System.out.println(e);
		}
}


