public class CreditAccount extends BankAccount{
    private double creditLimit;

    public CreditAccount(String owner, double initialBalance, double creditLimit){
        super(owner, initialBalance);
        this.creditLimit = creditLimit;

    }
    @Override
    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Ошибка: сумма должна быть положительной");
            return;
        }
        if (amount > getBalance()+creditLimit){
            System.out.println("Ошибка: превышен кредитный лимит");
            return;
        }
        changeBalance(-amount);
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Ставка: %.2f%n", creditLimit);
    }
}
