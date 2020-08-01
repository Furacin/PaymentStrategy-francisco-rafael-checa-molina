import payment.PaymentStrategy;

public class Main implements PaymentStrategy {

    public static void main(String[] args) {

        Main test = new Main();

        // We use the default method of the PaymentStrategy interface with each strategy type
        // Use of the "Cash" strategy
        System.out.println(test.pay(5,"cash"));

        // Use of the "CreditCard" strategy
        System.out.println(test.pay(5,"creditCard"));
        
        /*
        Output:
        10.0
        20.0
         */
    }

}
