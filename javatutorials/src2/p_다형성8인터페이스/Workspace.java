package p_������8�������̽�;

interface father{}
interface mother{}
interface believer{}

interface programmer{
    public void coding();
}

class Steve implements father, programmer, believer{
    public void coding(){
        System.out.println("fast");//������
    }
}
class Rachel implements mother, programmer{
    public void coding(){
        System.out.println("elegance");//����ϰ�
    }
}
public class Workspace{
    public static void main(String[] args){
        programmer employee1 = new Steve();
        programmer employee2 = new Rachel();
         
        employee1.coding();
        employee2.coding();
    }
}//����������� ��û������ �ٸ������ ������ ������