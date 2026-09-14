public class Main {
    public static void main(String[] args) {
        BankAccount sasha = new BankAccount("Саша", 1000);
        BankAccount masha = new BankAccount("Маша", 500);

        sasha.deposit(500);
        sasha.withdraw(200);
        masha.deposit(1000);

        sasha.printInfo();
        masha.printInfo();

        sasha.transfer(masha, 300);

        sasha.printInfo();
        masha.printInfo();

        sasha.transfer(masha, -100);
        sasha.transfer(masha, 99999);
        sasha.transfer(sasha, 100);
    }
}