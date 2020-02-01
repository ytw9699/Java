package ch09_myapp2;
//객체지향의 양대산맥은 클래스와 인스터스이다. 
//인스턴스는 하나의 클래스를 복제해서 서로다른데이터의값과 메소드를 가진 복제본을 만드는것이다. 
//앞과 다르게 static 이제 안씀
class Accounting2{
    public double valueOfSupply;
    public double vatRate;
    public double expenseRate;
    public void print() {
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + getVAT());
        System.out.println("Total : " + getTotal());
        System.out.println("Expense : " + getExpense());
        System.out.println("Income : " + getIncome());
        System.out.println("Dividend 1 : " + getDiviend1());
        System.out.println("Dividend 2 : " + getDiviend2());
        System.out.println("Dividend 3 : " + getDiviend3());
    }
 
    public double getDiviend1() {
        return getIncome() * 0.5;
    }
    public double getDiviend2() {
        return getIncome() * 0.3;
    }
    public double getDiviend3() {
        return getIncome() * 0.2;
    }
 
    public double getIncome() {
        return valueOfSupply - getExpense();
    }
 
    public double getExpense() {
        return valueOfSupply * expenseRate;
    }
 
    public double getTotal() {
        return valueOfSupply + getVAT();
    } 
 
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
}
public class AccountingClassApp2 {
     
    public static void main(String[] args) {
        // instance 
    	//하나의 클래스를 복제하여 다른 값들을 넣어서 사용할 수 있게 만드는 것 : 인스턴스
    	//(인스턴스로 사용될 클래스의 변수와 메소드에는 static이 들어가면 안됨
        Accounting2 a1 = new Accounting2();//Accounting2를 복제하는것의 장점
        a1.valueOfSupply = 10000.0;
        a1.vatRate = 0.1;
        a1.expenseRate = 0.3;
        a1.print();
         
        Accounting2 a2 = new Accounting2();
        a2.valueOfSupply = 20000.0;
        a2.vatRate = 0.05;
        a2.expenseRate = 0.2;
        a2.print();
         
        a1.print();
    }
}