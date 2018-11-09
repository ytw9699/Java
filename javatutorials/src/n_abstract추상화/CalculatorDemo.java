package n_abstract�߻�ȭ;
/*�߻� Ŭ������ ����� �����ϱ� ���� ���̴�. �� �θ� Ŭ�������� �޼ҵ��� �ñ״�ó�� �����س���
�� �޼ҵ��� ���� ���� ����� �� �޼ҵ带 ��� ���� ���� Ŭ������ å������ �����ϰ� �ִ�*/
abstract class Calculator{//�߻�Ŭ����
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    } 
    public abstract void sum();//�߻�޼ҵ� 
    public abstract void avg();//�߻�޼ҵ� 
    public void run(){//�߻�޼ҵ尡 �ƴ�
        sum();
        avg();
    }
    int _sum() {//���������ڰ� ������� default ������������ ������Ű�������� ��밡��
    	return this.left + this.right;
    }
}
class CalculatorDecoPlus extends Calculator {
    public void sum(){//�������̵�
        System.out.println("+ sum :"+ _sum());//�ߺ�������
    }
    public void avg(){//�������̵�
        System.out.println("+ avg :"+(this.left+this.right)/2);
    }
} 
class CalculatorDecoMinus extends Calculator {
    public void sum(){//�������̵�
        System.out.println("- sum :"+(this.left+this.right));//�ߺ����ž���
    }
    public void avg(){//�������̵�
        System.out.println("- avg :"+(this.left+this.right)/2);
    }
} 
public class CalculatorDemo {
    public static void main(String[] args) { 
        CalculatorDecoPlus c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);
        c1.run();
         
        CalculatorDecoMinus c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);
        c2.run();
    }
}