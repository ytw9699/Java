﻿package j_유효범위;
class C3 {
    int v = 10;//인스턴스 변수
 
    void m() {
    	int v =20;
        System.out.println(v);//지역변수 v를 쓰는것
       System.out.println(this.v);//전역변수 v를쓰는것 this는 인스턴스 자신을 의미
    }
}
public class e_유효범위3 {
 
    public static void main(String[] args) {
        C3 c1 = new C3();
        c1.m();
    }
}
/*유효범위란 변수를 전역변수, 지역변수 나눠서 좀 더 관리하기 편리하도록 한 것이다.
객체라는 개념이 존재하지 않는 절차지향 프로그래밍에서는 
모든 메소드에서 접근이 가능한 변수의 사용을 죄악시하는 경향이 있다. 
전역적인 사용의 효용이 분명한 데이터에 한해서 제한적으로 
전역변수를 사용하도록 하고 있는 것이다.
객체지향 프로그래밍은 바로 이런 문제를 극복하기 위한 노력이라도고 볼 수 있다.
즉 연관된 변수와 메소드를 그룹핑 할 수 있도록 함으로서
좀 더 마음놓고 객체 안에서 전역변수를 사용할 수 있도록 한 것이다.
전역변수는 더 이상 죄악시할 대상이 아닌 것이 된다. 이렇듯 도구와 사람의 마음은 밀접한 연관이 있다.
부품의 관점에서도 생각해볼 수 있다.
어떤 메소드가 전역변수를 사용하고 있다는 것은 그 메소드는 그 전역변수에 의존한다는 의미다.
전역변수에 의존한다는 것은 이 메소드가 다른 완제품의 부품으로서 사용될 수 없다는 의미다.
객체지향 덕분에 좀 더 안심하고 전역변수를 사용하게 되었지만,
객체도 크기가 커지면 관리의 이슈가 생겨난다. 
객체지향 프로그래밍에서도 가급적이면 전역변수의 사용을 자제하는 것이 좋고,
동시에 단일 객체가 너무 비대해지지 않도록 적절하게 규모를 쪼개는 것도 중요하다.
결국 적절히하되 전역변수보다는 지역변수를 쓰자는것*/