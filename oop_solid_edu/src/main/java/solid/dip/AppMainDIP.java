package solid.dip;

public class AppMainDIP {

    public static void main(String[] args) {

        //Depend on from class
        LaserWeaponModule laserWeaponModule = new LaserWeaponModule();
        RocketWeaponModule rocketWeaponModule = new RocketWeaponModule();
        MilitaryRobotV1 militaryRobotV1 = new MilitaryRobotV1(rocketWeaponModule);
        MilitaryRobotV2 militaryRobotV2 = new MilitaryRobotV2(laserWeaponModule);

        //MilitaryRobotV1 militaryRobotV1 = new MilitaryRobotV1(laserWeaponModule); - not work
        //MilitaryRobotV2 militaryRobotV2 = new MilitaryRobotV2(rocketWeaponModule); - not work

        //Dependency Inversion Principle
        LaserWeaponModuleDIP laserWeaponModuleDIP = new LaserWeaponModuleDIP();
        RocketWeaponModuleDIP rocketWeaponModuleDIP = new RocketWeaponModuleDIP();

        MilitaryRobotV1DIP militaryRobotV1DIPlaser = new MilitaryRobotV1DIP(laserWeaponModuleDIP);
        MilitaryRobotV1DIP militaryRobotV2DIPlaser = new MilitaryRobotV1DIP(laserWeaponModuleDIP);
        MilitaryRobotV1DIP militaryRobotV1DIProcket = new MilitaryRobotV1DIP(rocketWeaponModuleDIP);
        MilitaryRobotV1DIP militaryRobotV2DIProcket = new MilitaryRobotV1DIP(rocketWeaponModuleDIP);

    }

}
