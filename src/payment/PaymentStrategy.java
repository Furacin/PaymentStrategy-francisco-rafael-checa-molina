package payment;

public interface PaymentStrategy {

    default double pay(double amount,String strategyType) {
        double serviceCharge = 5.00;
        double creditCardFee = 10.00;

        switch (strategyType) {
            case "cash":
                return amount + serviceCharge;
            case "creditCard":
                return amount + serviceCharge + creditCardFee;
            default : return -1;
        }

    }

}
