public class Main {
    public static void main(String[] args) {
        // === Создание способов оплаты ===
        PaymentMethod card = new CardPayment("1234-5678-9012-3456", 5000);
        PaymentMethod cash = new CashPayment(2500);
        PaymentMethod crypto = new CryptoPayment(60000, 0.5);
        //                                  курс   монеты

        // === Массив всех способов (ПОЛИМОРФИЗМ!) ===
        PaymentMethod[] methods = {card, cash, crypto};

        // === Попытка оплаты 1000₽ каждым способом ===
        double purchaseAmount = 1000;
        System.out.println("=== Попытка оплаты " + purchaseAmount + "₽ ===\n");

        for (PaymentMethod method : methods) {
            System.out.println("[" + method.getMethodName() + "]");

            if (method.isAvailable()) {
                method.pay(purchaseAmount);
            } else {
                System.out.println("Способ оплаты недоступен!");
            }
            System.out.println();
        }

        // === Дополнительные проверки ошибок ===
        System.out.println("=== Проверка ошибок ===\n");

        // Попытка оплатить больше чем есть на карте
        System.out.println("Попытка оплатить 99999₽ картой:");
        card.pay(99999);
        System.out.println();

        // Отрицательная сумма наличными
        System.out.println("Попытка оплатить -100₽ наличными:");
        cash.pay(-100);
        System.out.println();

        // Оплата 0₽ криптой
        System.out.println("Попытка оплатить 0₽ криптой:");
        crypto.pay(0);
        System.out.println();

        // Попытка оплатить больше чем есть в крипте
        System.out.println("Попытка оплатить 50000₽ криптой:");
        crypto.pay(50000);
        System.out.println();

        // === Проверка isAvailable() после операций ===
        System.out.println("=== Доступность после операций ===\n");
        for (PaymentMethod method : methods) {
            System.out.println(method.getMethodName() + ": "
                    + (method.isAvailable() ? "доступен" : "недоступен"));
        }
    }
}