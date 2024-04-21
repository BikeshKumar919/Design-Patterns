public class Main {
    public static void main(String[] args) {
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        Single s3 = Single.getInstance();
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                Single s4 = Single.getInstance();
                if(s4 == s3){
                    System.out.println("Same instance");
                }
                else{
                    System.out.println("Different instance");
                }
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable(){
            public void run(){
                Single s5 = Single.getInstance();
                if(s5 == s3){
                    System.out.println("Same instance");
                }
                else{
                    System.out.println("Different instance");
                }
            }
        });
        t2.start();
        if(s1 == s2 && s2 == s3){
            System.out.println("All instances are the same");
        }
        else{
            System.out.println("Instances are different");
        }
    }
}
