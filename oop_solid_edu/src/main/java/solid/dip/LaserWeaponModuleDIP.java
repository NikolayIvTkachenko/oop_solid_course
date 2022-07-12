package solid.dip;

public class LaserWeaponModuleDIP implements I_WeaponModuleDIP{
    public void fireOnTarget(Integer damageValue){
        System.out.println("Damage value: " + damageValue);
        System.out.println("LaserWeaponModule. Use weapons. Fire On Target. Damage with double value: " + damageValue * 2);
    }
}





