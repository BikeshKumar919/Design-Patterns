/**
 * Stratergy
 */
public class Stratergy {

    public static void main(String[] args) {
        String selMode="Car";
        PathCal c=Factory.getPathCal(selMode);
        c.calPath();
    }
}

/---------------------------------------------------------------------------------------------------------------------------------------------------------------/

Definition : 

“The Strategy Pattern lets you choose an algorithm at runtime. Instead of hardcoding logic, you define multiple strategies and swap them as needed. For example, in a shopping cart, you can pay with Credit Card, PayPal, or UPI — each is a different strategy, but the checkout process stays the same.”




// Strategy interface
interface PaymentStrategy {
    void pay(int amount);
}

// Concrete strategies
class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

// Context
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // set strategy at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}

// Client
public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // choose Credit Card
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(500);

        // switch to PayPal
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(1000);
    }
}
