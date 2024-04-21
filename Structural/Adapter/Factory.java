public class Factory {
    public static Bank getBank(String bankName) {
        if (bankName.equalsIgnoreCase("YesBank")) {
            return new YesBankAdapter(new YesBank());
        } else if (bankName.equalsIgnoreCase("IciciBank")) {
            return new IciciBankAdapter(new IciciBank());
        }
        return null;
    }
}
