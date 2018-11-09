package q_9오브젝트equals1;
//오브젝트 클래스의 equals메소드는  객체와 객체가 같은 것인지를 비교하는 API이다.
//2개의 객체,인스턴스가 서로같은 인스턴스인지 비교해주는 연산자의 역할
//다형성의 개념 섞여있음,오버라이딩개념도!
//여기서 equals는 오브젝트클래스의 equals메소드를 오버라이드한것이다
class Student{
    String name;
    Student(String name){
        this.name = name;
    }
    public boolean equals(Object obj) {//오버라이딩 재정의
    	//Object obj는 다형성의 개념과도 같다
    	//Object obj=s2(new Student("egoing");)는 자식이 부모행세를 하느거라 가능하다
    	// A obj = new B();
    	Student s = (Student)obj;//이렇게 명시적 형변환하는 이유는 위에서 name변수에 접근하기위해서 
        return this.name == s.name;//이건 비교연산자 좌항과 우항의 값을 비교해서 리턴
    }
}
class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student("egoing");
        Student s2 = new Student("egoing");
        System.out.println(s1 == s2);//flase s1과 s2가 서로 다른 객체이기 때문이다
        System.out.println(s1.equals(s2));//이값을 false에서  true로 바꾼거
        //String name="egoing"; //로 같다면 오버라이딩해서 바꾼거
    }
 //나중에 hashcode에대해서도 알아봐 이거랑연관
 //결론적으로 equals는 오브젝트 클래스가 가진걸 그대로 사용하는걸 권장
}