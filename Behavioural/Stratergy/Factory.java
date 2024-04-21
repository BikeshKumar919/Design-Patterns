public class Factory {
    public static PathCal getPathCal(String selMode){
        if(selMode.equals("Bike")){
            return new Bike();
        }else if(selMode.equals("Car")){
            return new Car();
        }
        return null;
    }
}
