package p_������8�������̽�;
interface I2{
    public String A();
}
interface I3{
    public String B();
}
class D implements I2, I3{
    public String A(){
        return "A";
    }
    public String B(){
        return "B";
    }
}
public class �������̽���������2{
    public static void main(String[] args) {
        D obj = new D();
        I2 objI2 = new D();
        I3 objI3 = new D();
         
        System.out.println(obj.A());
        System.out.println(obj.B());
         
        System.out.println(objI2.A());// return "A";
        //objI2.B();//I3���ִ°Ŵϱ� ����
         
        //objI3.A();
        System.out.println(objI3.B());// return "B";
        
    }
}