package BookMyShow.Payment;

public class UPIPayment  implements Payment {
    @Override
    public void payAmount(double amount) {
        // Implementation for UPI payment
        System.out.println("Payment of amount " + amount + " made using UPI.");
        
    }
}
