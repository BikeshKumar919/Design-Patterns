/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Role role=Factory.getRole("webdev");
        role.role();
        Role role2=Factory.getRole("free"); 
        role2.role();
    }
}

/--------------------------------------------------------------------------------------------------------------------------------------------------------------------/

Definition :

“Factory Pattern hides the object creation process and provides a method to create objects based on input or conditions.”
