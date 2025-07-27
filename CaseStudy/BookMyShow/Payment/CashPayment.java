package BookMyShow.Payment;

public class CashPayment implements Payment {
    @Override
    public void payAmount(double amount) {
        // Implementation for cash payment
        System.out.println("Payment of amount " + amount + " made using cash.");
    }

}
