package solid.srp;

public class ServiceRobotSRP extends AbstractRobot {

    protected ServiceRobotSRP_PrepareStatus prepareStatus;
    protected ServiceRobotSRP_PrintDetails printDetails;
    protected ServiceRobotSRP_SaveLoadStatus saveLoadStatus;

    public ServiceRobotSRP(ServiceRobotSRP_PrepareStatus prepareStatus,
                           ServiceRobotSRP_PrintDetails printDetails,
                           ServiceRobotSRP_SaveLoadStatus saveLoadStatus,
                           Integer mass,
                           Integer speed,
                           Integer shield,
                           Integer construction,
                           Integer coordinateX,
                           boolean mooving) {
        super(mass, speed, shield, construction, coordinateX, mooving);
    }

    @Override
    public String prepareStatus() {
        return prepareStatus.prepareStatus(shield, construction);
    }

    @Override
    public void printDetails() {
        printDetails.printDetails(mass, speed, shield, construction, coordinateX, mooving);
    }

    @Override
    public void saveStatusRobot() {
        saveLoadStatus.saveServiceRobot();
    }

    @Override
    public void loadStatusRobot() {
        saveLoadStatus.loadServiceRobot();
    }
}

