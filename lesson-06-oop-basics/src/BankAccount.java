public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double initialBalance){
        this.owner = owner;
        this.balance = initialBalance;
    }
    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Ошибка: сумма долна быть положительной");
            return;
        }
        balance += amount;
    }
    public void withdraw(double amount){
        if (amount <= 0){
            System.out.println("Ошибка: сумма должна быть положительной");
            return;
        }
        if(amount>balance){
            System.out.println("Ошибка: недостаточно средств");
            return;
        }
        balance -= amount;
    }
    public double getBalance(){
        return balance;
    }
    public String getOwner(){
        return owner;
    }
    public void printInfo(){
        System.out.printf("%s: %.2f%n", owner, balance);
    }
    public void transfer(BankAccount to, double amount){
        if(amount > this.balance){
            System.out.println("Ошибка: неверная сумма");
            return;
        }
        if (to == null){
            System.out.println("Ошибка: получатель не указан!");
            return;
        }
        if (this == to) {
            System.out.println("Ошибка: нельзя перевести самому себе!");
            return;
        }
        if (amount <= 0) {
            System.out.println("Ошибка: сумма перевода должна быть положительной!");
            return;
        }
        this.balance -= amount;
        to.balance += amount;
        System.out.printf("Перевод %.2f от %s к %s выполнен!%n", amount, this.owner, to.owner);

    }
}
