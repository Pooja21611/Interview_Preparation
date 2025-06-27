public class PaymentMain {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment(1000);
        payment1.makePayment();  

        Payment payment2 = new PayPalPayment(500);
        payment2.makePayment();  
    }
}
