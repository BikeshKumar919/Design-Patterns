public class IciciBankAdapter implements Bank{
    IciciBank iciciBank;
    public IciciBankAdapter(IciciBank iciciBank) {
        // TODO Auto-generated constructor stub
        this.iciciBank = iciciBank;
    }
    @Override
    public void createAccount() {
        // TODO Auto-generated method stub
        iciciBank.generateAccount();

    }

    @Override
    public int getBalance() {
        // TODO Auto-generated method stub
        return iciciBank.showBalance();
    }
    
}
