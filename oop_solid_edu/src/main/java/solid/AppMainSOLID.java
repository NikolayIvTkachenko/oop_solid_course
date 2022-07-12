package solid;

import solid.dip.*;
import solid.isp.ServiceRobotSimple;
import solid.isp.ServiceRobotSimpleISP;
import solid.lsp.AtomicEngineV2;
import solid.lsp.AtomicEngineV2_LSP;
import solid.ocp.*;
import solid.srp.*;

public class AppMainSOLID {

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


        System.out.println("OCP - open Close Principle");

        System.out.println("=== Without OCP ===");
        WeaponGeneral weaponGeneral = new WeaponGeneral ();
        LaserMilitary laserMilitary = new LaserMilitary();
        LaserMining laserMining = new LaserMining();
        DamageWeaponCalculation damageWeaponCalculation = new DamageWeaponCalculation();
        System.out.println("LaserMilitary damage = " + damageWeaponCalculation.damageWeaponsFire(laserMilitary));
        System.out.println("Weapon damage = " + damageWeaponCalculation.damageWeaponsFire(weaponGeneral));
        System.out.println("LaserMining damage = " + damageWeaponCalculation.damageWeaponsFire(laserMining));


        System.out.println("=== With OCP ===");
        WeaponsOCP weaponsOCP = new WeaponsOCP();
        LaserMilitaryOCP laserMilitaryOCP = new LaserMilitaryOCP();
        LaserMiningOCP laserMiningOCP = new LaserMiningOCP();

        DamageWeaponCalculationOCP damageWeaponCalculationOCP = new DamageWeaponCalculationOCP();
        System.out.println("LaserMilitary damage = " + damageWeaponCalculationOCP.damageWeaponsFire(laserMilitaryOCP));
        System.out.println("Weapon damage = " + damageWeaponCalculationOCP.damageWeaponsFire(weaponsOCP));
        System.out.println("LaserMining damage = " + damageWeaponCalculationOCP.damageWeaponsFire(laserMiningOCP));


        System.out.println("LSP - Liskov Substitution Principle");
        System.out.println("===Incorrect===");
        //Incorrect
        AtomicEngineV2 atomicEngineV2 = new AtomicEngineV2(1000);
        atomicEngineV2.startEngine();

        System.out.println("===Correct===");
        System.out.println("===Call Base method===");
        //Correct
        AtomicEngineV2_LSP atomicEngineV2Lsp = new AtomicEngineV2_LSP(1000);
        atomicEngineV2Lsp.startEngine();
        System.out.println("===Call New Complex method===");
        atomicEngineV2Lsp.complexStartEngine();


        System.out.println("ISP - Interface Segregation Principles");
        System.out.println("Create additional classes");
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


        System.out.println("DIP - Dependency Inversion Principle");
        System.out.println("=== Without DIP ===");
        //Depend on from class
        LaserWeaponModule laserWeaponModule = new LaserWeaponModule();
        RocketWeaponModule rocketWeaponModule = new RocketWeaponModule();
        MilitaryRobotV1 militaryRobotV1 = new MilitaryRobotV1(rocketWeaponModule);
        MilitaryRobotV2 militaryRobotV2 = new MilitaryRobotV2(laserWeaponModule);

        //MilitaryRobotV1 militaryRobotV1 = new MilitaryRobotV1(laserWeaponModule); - not work
        //MilitaryRobotV2 militaryRobotV2 = new MilitaryRobotV2(rocketWeaponModule); - not work

        System.out.println("=== With DIP ===");
        //Dependency Inversion Principle
        LaserWeaponModuleDIP laserWeaponModuleDIP = new LaserWeaponModuleDIP();
        RocketWeaponModuleDIP rocketWeaponModuleDIP = new RocketWeaponModuleDIP();

        MilitaryRobotV1DIP militaryRobotV1DIPlaser = new MilitaryRobotV1DIP(laserWeaponModuleDIP);
        MilitaryRobotV1DIP militaryRobotV2DIPlaser = new MilitaryRobotV1DIP(laserWeaponModuleDIP);
        MilitaryRobotV1DIP militaryRobotV1DIProcket = new MilitaryRobotV1DIP(rocketWeaponModuleDIP);
        MilitaryRobotV1DIP militaryRobotV2DIProcket = new MilitaryRobotV1DIP(rocketWeaponModuleDIP);
    }

}
