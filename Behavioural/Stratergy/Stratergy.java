/**
 * Stratergy
 */
public class Stratergy {

    public static void main(String[] args) {
        String selMode="Car";
        PathCal c=Factory.getPathCal(selMode);
        c.calPath();
    }
}