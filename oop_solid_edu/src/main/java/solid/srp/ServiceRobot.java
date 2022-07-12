package solid.srp;

public class ServiceRobot extends AbstractRobot {
    public ServiceRobot(Integer mass, Integer speed, Integer shield, Integer construction, Integer coordinateX, boolean mooving) {
        super(mass, speed, shield, construction, coordinateX, mooving);
    }

    @Override
    public String prepareStatus() {
        if (shield > 0 && construction > 0){
            return "The Robot has shield and construction!";
        } else if (shield == 0 && construction > 0) {
            return "The Robot has construction but shield have been lost!";
        } else {
            //shield == 0 and construction == 0
            return "The robot was destroyed!";
        }
    }

    @Override
    public void printDetails() {
        System.out.println("Description of Robot:");
        System.out.println("Mass of Robot: " + mass + " kg");
        System.out.println("Speed of Robot: " + speed +" meter per second");
        System.out.println("Shield of Robot: " + construction + " unit");
        System.out.println("Possibility of movement: " + mooving);
        System.out.println("Position X: " + coordinateX);
    }

    @Override
    public void saveStatusRobot() {
        System.out.println("The value of Service Robot has been saved!");
    }

    @Override
    public void loadStatusRobot() {
        System.out.println("The value of Service Robot has been restored!");
    }
}


