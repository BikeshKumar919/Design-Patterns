public class Main {
    public static void main(String[] args) {
        Magazine magazine = new Magazine();
        Subscriber subscriber1 = new Subscriber(magazine);
        Subscriber subscriber2 = new Subscriber(magazine);
        magazine.setName("Magazine 1");
        magazine.setName("Magazine 2");
        magazine.unsubscribe(subscriber1);
        magazine.setName("Magazine 3");
    }
}
