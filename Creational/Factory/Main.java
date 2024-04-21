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