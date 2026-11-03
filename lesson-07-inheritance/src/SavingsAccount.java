public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String owner, double initialBalance, double interestRate){
        super(owner , initialBalance);
        this.interestRate = interestRate;
    }
    public void addInterest(){
        double interest = getBalance() * interestRate/100;
       deposit(interest);

    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Ставка: %.2f%%%n", interestRate);
    }

}
