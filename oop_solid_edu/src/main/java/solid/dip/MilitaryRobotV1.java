package solid.dip;

public class MilitaryRobotV1 {
    private RocketWeaponModule rocketWeaponModule;
    public MilitaryRobotV1(RocketWeaponModule rocketWeaponModule){
        this.rocketWeaponModule = rocketWeaponModule;
    }
    //It depends on the class
    public void useWeapon(Integer damagePoint){
        rocketWeaponModule.fireOnTarget(damagePoint);
    }
}



