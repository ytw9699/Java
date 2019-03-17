package q_9clone복제;//오브젝트 클래스의 클론메소드을 알아보자
//0.clone은 복제라는 뜻이다. 
//1어떤 객체가 있을 때 그 객체와 똑같은 객체를 복제해주는 
//2.기능이 clone 메소드의 역할이다. 예를 보자
class Student implements Cloneable{//5.복제하려면 인터페이스를 구현해서
	//복제가능한  객체라는 사실을 알려야함//그런데 Cloneable인터페이스는 비어있음
	//단지 복제가능하다는 구분자역할만할뿐
    String name;
    Student(String name){
        this.name = name;
    }
    // Cloneable인터페이스를 구현하는 클래스는 (protected 메소드인) 
    //Object.clone 메소드를 반드시 오버라이드해야 합니다. 
    public Object clone() throws CloneNotSupportedException{
    	//오버라이딩하면서
    	//접근제어자는 protected에서  public으로 바꿈 더 개방적으로 다른클래스에서 쓰기위해
    	//throws CloneNotSupportedException가 api에 명시되어있는건 
    	//런타임이 아니라//그냥이셉션이라 강제처리해야함,또는 던지기
        return super.clone();//오브젝트 클래스의 메소드 호출
        // //clone();메소드는 접근제어자가 protected
        //서로다른패키지에서는 호출안됨,하지만 상속일때 this.clone()로 가능은 하나 여기선 예외적으로 오버라이딩해서 써야함..
    }
}  
class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student("egoing");//3.s1과 똑같은 객체를 복제해보자
        //4.오브젝트에 클론이라는 메소드 있음
        try {
            Student s2 = (Student)s1.clone();//복제한결과를 s2에 담는다
           
            System.out.println(s1.name);//egoing
            System.out.println(s2.name);//egoing
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}