package solid.dip;

public class MilitaryRobotV2 {
    private LaserWeaponModule laserWeaponModule;
    public MilitaryRobotV2(LaserWeaponModule laserWeaponModule){
        this.laserWeaponModule = laserWeaponModule;
    }
    //It depends on the class
    public void useWeapon(Integer damagePoint){
        laserWeaponModule.fireOnTarget(damagePoint);
    }
}


