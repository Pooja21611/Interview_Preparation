public class CreditCardPayment extends Payment {
    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    public void makePayment() {
        System.out.println("Paid ₹" + getAmount() + " using Credit Card.");
    }
}
