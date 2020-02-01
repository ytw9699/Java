package ch09_myapp2;
 
public class AccountingArrayLoopApp {
	 
    public static void main(String[] args) {
 
        double valueOfSupply = Double.parseDouble(args[0]);
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;
         
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + vat);
        System.out.println("Total : " + total);
        System.out.println("Expense : " + expense);
        System.out.println("Income : " + income);
         
        double[] dividendRates = new double[3];
        dividendRates[0] = 0.5;
        dividendRates[1] = 0.3;
        dividendRates[2] = 0.2;
             
        int i = 0;
        while(i < dividendRates.length) {//배열과 반복문으 조합으로 시너지 효과,만약 1억개를 반복해야한다면 실효성큼
            System.out.println("Dividend : " + (income*dividendRates[i]) );
            i = i + 1;
        }
         
 
    }
 
}