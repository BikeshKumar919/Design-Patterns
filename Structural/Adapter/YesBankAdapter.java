public class YesBankAdapter implements Bank {
    YesBank yesBank;
    public YesBankAdapter(YesBank yesBank) {
        // TODO Auto-generated constructor stub
        this.yesBank = new YesBank();
    }

    @Override
    public void createAccount() {
        // TODO Auto-generated method stub
        yesBank.openAccount();
    }

    @Override
    public int getBalance() {
        // TODO Auto-generated method stub
        return yesBank.fetchBalance();
    }
    
}
