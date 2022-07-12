package solid.srp;

public class ServiceRobotSRP_PrintDetails {

    public void printDetails(Integer mass, Integer speed, Integer shield, Integer construction, Integer coordinateX, boolean mooving){
        System.out.println("Description of Robot:");
        System.out.println("Mass of Robot: " + mass + " kg");
        System.out.println("Speed of Robot: " + speed +" meter per second");
        System.out.println("Shield of Robot: " + construction + " unit");
        System.out.println("Possibility of movement: " + mooving);
        System.out.println("Position X: " + coordinateX);
    }
}


