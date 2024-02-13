package homework.homeworkX;

public class Vehiclefactory {
    private static Horse horse = new Horse();
    private Vehiclefactory(){}
    public static Horse getHorse(){
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }
    public static plane getPlane(){
        return new plane();
    }
}
