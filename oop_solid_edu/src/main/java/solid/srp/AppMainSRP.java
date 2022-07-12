package solid.srp;

import solid.ConstantsRobots;

public class AppMainSRP {

    public static void main(String[] args) {

        System.out.println("SRP - Single Responsibility Principle");
        //Create additional classes
        System.out.println("Create additional classes");
        ServiceRobotSRP_PrepareStatus prepareStatus = new ServiceRobotSRP_PrepareStatus();
        ServiceRobotSRP_PrintDetails printDetails = new ServiceRobotSRP_PrintDetails();
        ServiceRobotSRP_SaveLoadStatus saveLoadStatus = new ServiceRobotSRP_SaveLoadStatus();

        System.out.println("=== without SRP ===");
        //Create ServiceRobot
        System.out.println("Create ServiceRobot");
        ServiceRobot serviceRobot = new ServiceRobot(
                ConstantsRobots.ServiceRobotMass,
                ConstantsRobots.ServiceRobotSpeed,
                ConstantsRobots.ServiceRobotShield,
                ConstantsRobots.ServiceRobotConstruction,
                0,
                true);
        System.out.println("Create ServiceRobot");
        serviceRobot.prepareStatus();
        serviceRobot.printDetails();
        serviceRobot.saveStatusRobot();
        serviceRobot.loadStatusRobot();


        System.out.println("=== with SRP ===");
        //Create ServiceRobotSimple
        System.out.println("Create ServiceRobotSRP");
        ServiceRobotSRP serviceRobotSRP = new ServiceRobotSRP(
                prepareStatus,
                printDetails,
                saveLoadStatus,
                ConstantsRobots.ServiceRobotMass,
                ConstantsRobots.ServiceRobotSpeed,
                ConstantsRobots.ServiceRobotShield,
                ConstantsRobots.ServiceRobotConstruction,
                0,
                true);
        serviceRobotSRP.prepareStatus();
        serviceRobotSRP.printDetails();
        serviceRobotSRP.saveStatusRobot();
        serviceRobotSRP.loadStatusRobot();

    }

}
