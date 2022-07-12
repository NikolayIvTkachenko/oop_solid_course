package solid.isp;

import solid.srp.AbstractRobot;
import solid.srp.ServiceRobotSRP_PrepareStatus;
import solid.srp.ServiceRobotSRP_PrintDetails;
import solid.srp.ServiceRobotSRP_SaveLoadStatus;

public class ServiceRobotSimpleISP extends AbstractRobot implements I_RobotRunnable {
    protected ServiceRobotSRP_PrepareStatus prepareStatus;
    protected ServiceRobotSRP_PrintDetails printDetails;
    protected ServiceRobotSRP_SaveLoadStatus saveLoadStatus;
    public ServiceRobotSimpleISP(ServiceRobotSRP_PrepareStatus prepareStatus, ServiceRobotSRP_PrintDetails printDetails,
                              ServiceRobotSRP_SaveLoadStatus saveLoadStatus, Integer mass, Integer speed,
                              Integer shield, Integer construction, Integer coordinateX, boolean mooving) {
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
    @Override
    public void run(Integer X) {
        System.out.println("Robot moving");
    }
}



