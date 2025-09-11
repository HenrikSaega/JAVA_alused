package week5;

public class CashRegister {
    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven >= 2.50) {
            this.cashInRegister += 2.50;
            this.economicalSold += 1;
            cashGiven -= 2.50;
            return cashGiven;
        }
            return cashGiven;
    }
    public double payGourmet(double cashGiven) {
        if(cashGiven >= 4.00) {
            this.cashInRegister += 4.00;
            this.gourmetSold += 1;
            cashGiven -= 4.00;
            return cashGiven;
        }
        return cashGiven;
    }
    public String toString(){
        return "Money in register "+cashInRegister+" economial lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }
}
