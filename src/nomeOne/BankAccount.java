package nomeOne;

public class BankAccount {
    private double amount;

    public void setWithDraw(int sum) throws LimitException{
        if (sum > amount) {
            throw new LimitException("у вас на счету меньше денег - ",amount);
        }else{
            this.amount -= sum;
        }
    }

    public void deposit(double sum){
        amount += sum;
    }
    public double getAmount() {
        return amount;
    }
}
