package k_overriding;
/*상속은 기본적으로 부모클래스에 있는걸 받고 , 부모클래스에 없는걸 자식클래스에서 더 추가한다는게 개념이었다.
	그리고 오버라이딩은 상속받은 메소드를 재정의 하는것이다. */

class Calculator {
	
    int left, right;
    
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    
    public void sum() {
        System.out.println(this.left + this.right);
    }
    
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
    
}

class SubstractionableCalculator extends Calculator {
	
    public void sum() {//오버라이딩 새롭게 메소드 재정의!!
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }
    
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class a_오버라이딩 {
	
    public static void main(String[] args) {
    	
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}