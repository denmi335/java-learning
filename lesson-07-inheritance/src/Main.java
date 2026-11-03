public class Main {
    public static void main(String[] args) {
        BankAccount sasha = new BankAccount("Саша", 1000);
        SavingsAccount masha = new SavingsAccount("Маша", 2000, 5.0);
        CreditAccount petya = new CreditAccount("Петя", 0, 1000);

        sasha.deposit(500);
        masha.addInterest();
        petya.withdraw(500);

        System.out.println("=== До полиморфизма ===");
        sasha.printInfo();
        masha.printInfo();
        petya.printInfo();

        BankAccount[] accounts = {sasha, masha, petya};

        System.out.println("\n=== Полиморфизм ===");
        for (BankAccount acc : accounts) {
            acc.printInfo();
        }
    }
}