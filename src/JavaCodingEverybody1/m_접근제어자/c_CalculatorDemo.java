package m_접근제어자;

class Calculator{
	
    private int left, right;//private을 붙임
     
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    
    private int _sum(){//private을 붙임
        return this.left+this.right;
    }
    
    public void sumDecoPlus(){
        System.out.println("++++"+_sum()+"++++"); 
    }
    
    public void sumDecoMinus(){
        System.out.println("----"+_sum()+"----");
    }
}

public class c_CalculatorDemo {
	
    public static void main(String[] args){  
    	
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sumDecoPlus();//sum메소드를 바로접근못함
        c1.sumDecoMinus();//sum메소드를 바로접근못함
    }
}