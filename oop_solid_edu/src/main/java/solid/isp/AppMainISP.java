package solid.isp;

import solid.ConstantsRobots;
import solid.srp.ServiceRobotSRP_PrepareStatus;
import solid.srp.ServiceRobotSRP_PrintDetails;
import solid.srp.ServiceRobotSRP_SaveLoadStatus;

public class AppMainISP {

    public static void main(String[] args) {
        //Create additional classes
        System.out.println("ISP - Interface Segregation Principles");
        System.out.println("Create additional classes");
        ServiceRobotSRP_PrepareStatus prepareStatus = new ServiceRobotSRP_PrepareStatus();
        ServiceRobotSRP_PrintDetails printDetails = new ServiceRobotSRP_PrintDetails();
        ServiceRobotSRP_SaveLoadStatus saveLoadStatus = new ServiceRobotSRP_SaveLoadStatus();


        //Create ServiceRobotSimple
        System.out.println("Create ServiceRobotSimple");
        ServiceRobotSimple serviceRobotSimple = new ServiceRobotSimple(
                prepareStatus,
                printDetails,
                saveLoadStatus,
                ConstantsRobots.ServiceRobotMass,
                ConstantsRobots.ServiceRobotSpeed,
                ConstantsRobots.ServiceRobotShield,
                ConstantsRobots.ServiceRobotConstruction,
                0,
                true);
        System.out.println("Call methods: run, repair, reload");
        serviceRobotSimple.run(6);
        serviceRobotSimple.repair();
        serviceRobotSimple.reload();


        //Create ServiceRobotSimple
        System.out.println("Create ServiceRobotSimple");
        ServiceRobotSimpleISP serviceRobotSimpleIsp = new ServiceRobotSimpleISP(
                prepareStatus,
                printDetails,
                saveLoadStatus,
                ConstantsRobots.ServiceRobotMass,
                ConstantsRobots.ServiceRobotSpeed,
                ConstantsRobots.ServiceRobotShield,
                ConstantsRobots.ServiceRobotConstruction,
                0,
                true);
        System.out.println("We can call only one method - run");
        serviceRobotSimpleIsp.run(6);

    }
}
