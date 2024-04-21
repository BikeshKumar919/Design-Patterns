public class Single{
    private static Single instance = null;
    private Single(){
        System.out.println("Single instance created");
    }
    public static Single getInstance(){
        if(instance == null){//saves time by not entering synchronized block if instance is already created
            synchronized(Single.class){//synchronized block to prevent multiple threads from creating multiple instances
                if(instance == null){
            instance = new Single();
                }
            }
        }
        return instance;
    }
}