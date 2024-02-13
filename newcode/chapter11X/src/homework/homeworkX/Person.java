package homework.homeworkX;

public class Person {
    private String name;
    private Vehicles vehicles;

    //when setting a person object, previously give this person a default vehicle
    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
//    接口对多态
    public void passRiver(){
        //get the boat
        if(!(vehicles instanceof Boat)){
            vehicles = Vehiclefactory.getBoat();
        }
        vehicles.work();
    }
    public void common(){
        //get the horse
        if(!(vehicles instanceof Horse)){
            vehicles = Vehiclefactory.getHorse();
        }
        vehicles.work();
    }

    public void passMountain(){
        if(!(vehicles instanceof plane)){
            vehicles = Vehiclefactory.getPlane();
        }
        vehicles.work();
    }
}
