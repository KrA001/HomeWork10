package nomeOne;

public class Main {
    public static void main(String[] args) throws LimitException {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        bankAccount.setWithDraw(6000);
        bankAccount.setWithDraw(6000);
        bankAccount.setWithDraw(6000);
        bankAccount.setWithDraw(6000);

        System.out.println(bankAccount.getAmount());

    }
}
