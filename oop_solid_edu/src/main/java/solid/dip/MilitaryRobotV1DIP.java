package solid.dip;

public class MilitaryRobotV1DIP {
    private I_WeaponModuleDIP weaponModuleDIP;
    public MilitaryRobotV1DIP(I_WeaponModuleDIP weaponModuleDIP){
        this.weaponModuleDIP = weaponModuleDIP;
    }
    //It depends on the class
    public void useWeapon(Integer damagePoint){
        weaponModuleDIP.fireOnTarget(damagePoint);
    }
}


