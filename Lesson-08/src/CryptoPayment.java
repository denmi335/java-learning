public class CryptoPayment implements PaymentMethod {
    private double coins;
    private double exchangeRate;

    public CryptoPayment(double exchangeRate, double coins) {
        this.coins = coins;
        this.exchangeRate = exchangeRate;
    }

    @Override
    public void pay(double amount) {
        if (amount <= 0) {
            System.out.println("Ошибка: сумма должна быть положительной!");
            return;
        }
        if (amount / exchangeRate > coins) {
            System.out.println("Ошибка: недостаточно монет!");
            return;
        }
        coins -= amount / exchangeRate;
        System.out.printf("Оплата прошла успешно! Остаток: %.4f монет%n", coins);
    }

    @Override
    public String getMethodName() {
        return "Криптовалюта";
    }

    @Override
    public boolean isAvailable() {
        return coins > 0;
    }
}