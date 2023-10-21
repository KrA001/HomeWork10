package nomeOne;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        double withdrawAmount = 6000;
        while (true) {
            try {
                bankAccount.setWithDraw((int) withdrawAmount);
                System.out.println("Вывод среств " + withdrawAmount + " som");
            } catch (LimitException e) {
                double remainingAmount = e.getRemainingAmount();
                System.out.println("Вывод среств " + remainingAmount + " som" + "\n" +
                        " на вашом счете больше нет денек ");
                break;
            }
        }
    }
}
