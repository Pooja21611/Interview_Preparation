public class PayPalPayment extends Payment {
    public PayPalPayment(double amount) {
        super(amount);
    }

    @Override
    public void makePayment() {
        System.out.println("Paid ₹" + getAmount() + " using PayPal.");
    }
}
