public class CashPayment implements PaymentMethod{
    private double cashAmount;

    public CashPayment(double cashAmount){
        this.cashAmount = cashAmount;
    }

    @Override
    public void pay(double amount) {
        if (amount <= 0) {
            System.out.println("Ошибка: сумма должна быть положительной!");
            return;
        }

        if (amount > cashAmount) {
            System.out.println("Ошибка: недостаточно наличных!");
            return;
        }
        cashAmount -= amount;

        System.out.printf("Оплата прошла успешно! Ваша сдача: %.2f₽%n", cashAmount);
    }

    @Override
    public String getMethodName() {
        return " Наличные";
    }

    @Override
    public boolean isAvailable() {
        return cashAmount>0;
    }
}
