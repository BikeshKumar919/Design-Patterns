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


/---------------------------------------------------------------------------------------------------------------------------------------------------------------/


Definition : 

“Observer Pattern defines a one-to-many relationship: when the Subject changes, all Observers are automatically notified. It’s commonly used in event handling, like YouTube channel–subscriber notifications.”


This is the easy example to understand


// Observer interface
interface Observer {
    void update(String message);
}

// Concrete Observer
class Subscriber implements Observer {
    private String name;
    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}

// Subject interface
interface Subject {
    void subscribe(Observer o);
    void unsubscribe(Observer o);
    void notifyObservers(String message);
}

// Concrete Subject
class Channel implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer o) {
        observers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    // Business logic
    public void uploadVideo(String title) {
        System.out.println("Channel uploaded: " + title);
        notifyObservers("New video uploaded: " + title);
    }
}

// Client
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Channel channel = new Channel();

        Observer sub1 = new Subscriber("Alice");
        Observer sub2 = new Subscriber("Bob");

        channel.subscribe(sub1);
        channel.subscribe(sub2);

        channel.uploadVideo("Observer Design Pattern in Java");
    }
}
