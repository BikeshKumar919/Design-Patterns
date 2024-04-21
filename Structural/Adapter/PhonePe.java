public class PhonePe {
    public static void main(String[] args) {
        Bank bank=Factory.getBank("yesbank");
        bank.createAccount();
        System.out.println("Balance in account is: "+bank.getBalance());
    }
}
