 package e_���ǹ�;
public class g_switch2 {
	public static void main(String[] args) {
		System.out.println("switch(1)");
        switch(1){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        }
    	System.out.println("val");
        //���Ʒ� ���ٰ����ִ�
        int val = 1;
        if(val == 1){
            System.out.println("one");
        } else if(val == 2){
            System.out.println("two");
        } else if(val == 3){
            System.out.println("three");
        } 
        System.out.println("switch(2)");
        switch(2){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        }
        System.out.println("switch(3)");
        switch(3){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        }
        System.out.println("switch(4)");
        switch(4){//��𿡵� �������ʴ´� 4�� �׷��� ����Ʈ������
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        default://�ᱹ if���� else�� �Ȱ�����!
            System.out.println("default");
            break;
        }
        System.out.println("switch(5)");
        switch(5){//��𿡵� �������ʴ´�
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        }
        System.out.println("switch(6)");
       // switch(new String("d")){
        switch("d"){
        case "d":
            System.out.println("d");
            break;
        case "e":
            System.out.println("e");
            break;
        case "f":
            System.out.println("f");
            break;
        }
        System.out.println("switch(7)");
        switch("dd"){
        case "dd":
            System.out.println("dd");
            break;
        case "ee":
            System.out.println("e");
            break;
        case "ff":
            System.out.println("f");
            break;
        }
        /*switch ���� ����� �� �Ѱ��� ���� �� ���� switch�� �������δ� 
		��� ���ѵ� ������ Ÿ�Ը��� ����� �� �ִ�. ����Ŭ������
		byte, short, char, int, enum, String, Character, Byte, Short, Integer*/
  }
}
