package h_Ŭ������_�ν��Ͻ�_��ü;
class Calculator{
	//Ŭ������ �����Ǿ� �ִ� ������ �޼ҵ��� �����̴�
	//�� Ŭ���� ��ü�� ��ü�� ���赵 -����,�޼ҵ�
    int left, right;//�ν��Ͻ� ����
      
    public void setOprands(int left, int right){
        this.left = left; //this�� c1�� �ν��Ͻ��� ����Ű�°�,�ν��Ͻ� �ڽ�
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left+this.right);
    }
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}
public class c_��üȭ {
    public static void main(String[] args) {
         //Ŭ���� : ���赵
    	//�ν��Ͻ� : ��ǰ
        Calculator c1 = new Calculator();//c1�̶�� ������ new Calculator()��ü�� �����ؼ� ����
        //c1�� ��� ���� ��ü�� ������ �ν��Ͻ�(��ü���� ��ü)����
        //Ŭ������ ����ٴ� ���� ����� ���� ������ Ÿ���� ����� �Ͱ� ���� �ǹ̴� c1�� ������Ÿ���� calculator��
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();       
          
        Calculator c2 = new Calculator();//��Ȱ��
        c2.setOprands(20, 40);
        c2.sum();       
        c2.avg();
        
        c1.sum();       
        c1.avg(); 
    }
}
/*������ �ٸ� ���δ� ����(state)��� ǥ���Ѵ�. 
c1.sum�� ����� 30, c2.sum�� ����� 60�� ���� ���ؼ� �� �� �ֵ��� 
���°� �ٸ� ��ü�� ������� �޼ҽ��� �����Ű�� �ٸ� ����� ��Ÿ���� �ȴ�.
�޼ҵ带 �ٸ� ���δ� �ൿ(behave)��� ǥ���Ѵ�.

���� : ����
�޼ҵ� : �ൿ
�� �ϳ��� Ŭ������ �������� ���� �ٸ� ���¸� ���� �ν��Ͻ��� ����� 
���� �ٸ� �ൿ�� �ϰ� �ȴٴ� ���� �� �� �ִ�. �ϳ��� Ŭ������ �������� 
�ν��Ͻ��� �� �� �ִٴ� ���� ��ü ������ �����ϴ� ���� �⺻���� ��Ȱ�뼺�̶�� �� �� �ִ�.*/

