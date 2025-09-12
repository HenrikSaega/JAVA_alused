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
    public boolean payEconomical(LyyraCard  card){
        if(card.balance() >= 2.50){
            this.economicalSold += 1;
            card.loadMoney(2.50);
            return true;
        }
        return false;
    }
    public boolean payGourmet(LyyraCard  card){
        if(card.balance() >= 4.0){
            this.gourmetSold += 1;
            card.pay(4.0);
            return true;
        }
        return false;
    }

    public  void loadMoneyToCard(LyyraCard card, double addMoney){
        this.cashInRegister += addMoney;
        card.loadMoney(addMoney);
    }

    public String toString(){
        return "Money in register "+cashInRegister+" economial lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }
}
