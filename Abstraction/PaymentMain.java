public class PaymentMain {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment(1000);
        payment1.makePayment();  // Paid ₹1000 usitng Credit Card.

        Payment payment2 = new PayPalPayment(500);
        payment2.makePayment();  // Paid ₹500 using PayPal.
    }
}
