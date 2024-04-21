public class Subscriber implements getUpdates{
    Magazine magazine;
    public Subscriber(Magazine magazine){
        this.magazine = magazine;
        magazine.subscribe(this);
    }
    public void update(){
        System.out.println("The magazine " + magazine.getName() + " has been added.");
    }
}
