public class PhonePe {
    public static void main(String[] args) {
        Bank bank=Factory.getBank("yesbank");
        bank.createAccount();
        System.out.println("Balance in account is: "+bank.getBalance());
    }
}


/-------------------------------------------------------------------------------------------------------------------------------------------------------------------/

Defintion :

“The Adapter Design Pattern is a structural pattern that allows two incompatible interfaces to work together. It acts as a bridge between an existing class and a new interface expected by the client.”
