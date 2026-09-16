public class CardPayment implements PaymentMethod{
    private double balance;
    private String cardNumber;

    public CardPayment(String cardNomber, double balance){
        this.cardNumber = cardNomber;
        this.balance = balance;
    }

    @Override
    public void pay(double amount){
        if (amount <= 0 ) {
            System.out.println("Ошибка: сумма должна быть положительной");
            return;
        }
        else if( amount > balance){
            System.out.println("Ошибка: недостаточно средств");
            return;
        }
        balance -= amount;
        System.out.println("Оплата прошла успешно. Остаток " +balance +"$");

    }

    @Override
    public String getMethodName() {
        return"Способ оплаты - банковская карта";
    }

    @Override
    public boolean isAvailable() {
        return balance>0;
    }
}
