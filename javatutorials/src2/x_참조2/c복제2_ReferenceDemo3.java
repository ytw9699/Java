package x_참조2;
class A{
    public int id;
    A(int id){
        this.id = id;
    }
}
public class c복제2_ReferenceDemo3 {
  
    public static void runReference(){
        A a = new A(1);
        A b = a;
        b = new A(2);//새로운 인스턴스를 참조하는것
        System.out.println("runReference, "+a.id);
        //그래서 값이 2가아닌 1출력     
        System.out.println("runReference, "+b.id);
    }
    public static void main(String[] args) {
        runReference();
    }
}
