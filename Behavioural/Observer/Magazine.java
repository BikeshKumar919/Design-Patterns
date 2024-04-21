import java.util.ArrayList;
import java.util.List;

class Magazine {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
        notifySubscribers();
    }
    private List<Subscriber> subscribers = new ArrayList<>();
    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }
    public void notifySubscribers(){
        for(Subscriber subscriber : subscribers){
            subscriber.update();
        }
    }
}