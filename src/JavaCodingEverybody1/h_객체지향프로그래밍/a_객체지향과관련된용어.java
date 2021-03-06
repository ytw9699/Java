﻿package h_객체지향프로그래밍;
public class a_객체지향과관련된용어 {
/*
===================================================================
0.객체지향 프로그래밍(Object-Oriented Programming)은 oop는
좀 더 나은 프로그램을 만들기 위한 프로그래밍 패러다임으로
로직을 상태(state)와 행위(behave)로 이루어진 객체로 만드는 것이다.

 상태는 객체가 가진 변수,
 행위는 메소드를 호출하는것
서로 연관되어있는 상태와 행위를 그룹핑해둔 카테고라이징한것을 일종의 객체라할수있다

오픈튜토리얼 사이트는 아래처럼 구성된다.
글목록 객체: 변수,메소드
본문 객체: 변수,메소드
댓글 객체: 변수,메소드

규모가 커지면 복잡해지고 그래서 객체지향이 나온거

변수와 메소드를 서로연관된 기능별로 그룹핑 하는 기능을 프로그래밍 차원에서 객체로 제공하게되는것
그룹핑된 하나하나의 단위를 객체라한다. 

이렇게 3가지로 그룹화시켜서 분류하는것
이렇게 분류해두면 다른곳에서도 재활용성 이높아짐

이 객체들을 마치 레고 블럭처럼 조립해서 하나의 프로그램(완제품)을 만드는 것이 
객체지향 프로그래밍이라고 할 수 있다.분류화시키는것이야
 다시 말해서 객체지향 프로그래밍은 객체를 만드는 것이다. 
따라서 객체지향 프로그래밍의 시작은 객체란 무엇인가를 이해하는 것이라고 할 수 있다. 
 
쉽게 생각하자. 객체는 연관되어있는 변수와 메소드를 그룹핑한 것이다.

정라하자면
객체지향 프로그래밍은 객체를 만드는것이고
하나의 객체안에는 그 객체가 가지고있는 취지,본문인지,댓글인지에따라서 취지,또는 기능과 연관된 변수와 메소드를
객체라는 단단한껍데기안에 가둬둔것이고 연관성이없는 다른 로직과 구분해준느것을 하는 역할이 객체라 할수 있다.

객체지향이란 어떤 프로그래밍 방식, 방법론이다.
만들어진 이유는 프로그래밍을 더쉽게 그리고 더잘하기 위해서
데이터와 기능이 클래스로 캡슐화된 컴퓨터 자원의 묶음을 객체라한다.
밀가루 반죽과 팥이 클래스란 붕어빵 틀에 찍혀서 붕어빵이 나오게됨
클래스라는 모양틀에 흙을 넣고 구우면 벽돌이 나옴

객체지향은 은닉성이라는 특성을 가짐 : 내부구조는  private으로 감춰두고 외부에서 조작할수있는 명령어만 public으로 공개
이로써 바깥의 간섭으로 발생하는 오류를 방지하고, 남이만든 클래스를 일일이 뜯어볼 필요없이 제공되는 기능들을 그대로 사용
===================================================================
1.추상화: 해결해야할문제 ,반영해야할 복잡한 현실을,
소프트웨어적으로 단순화시켜서 만드는 행위를 추상화라고한다
오른쪽 하단의 지도는 지하철 탑승자의 관심사만을 반영하고 있다. 
역 간의 거리나 실제 위치와 같은 요소들은 모두 배제하고 있다
복잡함 속에서 필요한 관점만을 추출하는 행위를 추상화라고 한다.
지하철 노선도가 디자인의 추상화라고 한다면 
프로그램을 만든다는 것은 소프트웨어의 추상화라고 할 수 있다
===================================================================
2.부품화 :객체 지향과 부품화를 동일시 할 수는 없지만 부품화라고 하는 
소프트웨어의 큰 흐름은 객체 지향이 만들어지는데 지대한 공헌을 했다고 할 수 있다.
모니터와 본체와 컴퓨터를 분리했다. 다시 말해서 부품화 시킨 것이다.
 또 문제가 생겼을 때 그 문제가 어디에서 발생한 것인지 파악하고 해결하기가 훨씬 쉬워진다.
이 완제품들을 부품으로 조합하면 컴퓨터라는 하나의 완제품이 만들어진다.
 객체 지향은 부품화의 정점이라고 할 수 있다.
메소드는 부품화의 예라고 할 수 있다
그리고 이 메소드들을 부품으로 해서 하나의 완제품인 독립된 프로그램을 만드는 것이다. 
메소드를 사용하면 코드의 양을 극적으로 줄일 수 있고,
 메소드 별로 기능이 분류되어 있기 때문에 필요한 코드를 찾기도 쉽고 문제의 진단도 빨라진다.
 그런데 프로그램이 커지면 엄청나게 많은 메소드들이 생겨나게 된다. 
 메소드와 변수를 관리하는 것은 점점 어려운 일이 되기 시작한다. 
 그 도약 중의 하나가 객체 지향 프로그래밍이다. 
 이것의 핵심은 연관된 메소드와 그 메소드가 사용하는 변수들을 분류하고 그룹핑하는 것이다. 
 바로 그렇게 그룹핑 한 대상이 객체(Object)다. 
 비유하자면 파일과 디렉토리가 있을 때 메소드나 변수가 파일이라면 
 이 파일을 그룹핑하는 디렉토리가 객체라고 할 수 있다
 이를 통해서 더 큰 단위의 부품을 만들 수 있게 되었다
===================================================================
3.은닉화=캡슐화 
부품화라고 하는 목표는 단순히 동일한 기능을 하는 메소드와 변수를 그룹핑한다고 달성되는 것은 아니다. 
제대로된 부품이라면 그것이 어떻게 만들어졌는지 모르는 사람도 그 부품을 사용하는 방법만 알면 쓸 수 있어야 한다.
 이를테면 모니터가 어떻게 동작하는지 몰라도 
 컴퓨터와 모니터를 연결하는 방법만 알면 화면을 표시 할 수 있는 것과 같은 이치다
 즉 내부의 동작 방법을 단단한 케이스(객체) 안으로 숨기고
 사용자에게는 그 부품의 사용방법만을 노출하고 있는 것이다. 
이러한 컨셉을 정보의 은닉화(Information Hiding), 또는 캡슐화(Encapsulation)라고 부른다. 
자연스럽게 사용자에게는 그 부품을 사용하는 방법이 중요한 것이 된다.  
===================================================================
4.인터페이스
잘 만들어진 부품이라면 부품과 부품을 서로 교환 할 수 있어야 한다.
 집에 있는 컴퓨터에 A사의 모니터를 연결하다가 B사의 모니터를 연결 할 수 있다. 
 이것은 모니터와 컴퓨터를 연결하는 케이블의 규격이 표준화 되어 있기 때문에 가능한 일이다. 
  각각의 부품은 미리 정해진 약속에 따라서 신호를 입, 출력하고, 연결점의 모양을 표준에 맞게 만들면 된다. 
 이러한 연결점을 인터페이스(interface)라고 한다. 
 위의 그림을 보면 HDMI 케이블의 연결점은 특유의 생김새가 있다. 
 만약 HDMI 케이블을 랜선을 연결하는 구멍에 연결하려고 한다면 어떻게 될까? 
 동작하지 않을 뿐 아니라 연결 자체가 되지 않는다.
  인터페이스란 이질적인 것들이 결합하는 것을 막아주는 역할도 하는 것이다. 
*/
}


	
