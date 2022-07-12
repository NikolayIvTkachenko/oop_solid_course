package solid.dip;

public class RocketWeaponModuleDIP implements I_WeaponModuleDIP{
    public void fireOnTarget(Integer damageValue){
        System.out.println("Damage value: " + damageValue);
        System.out.println("RocketWeaponModule. Use weapons. Fire On Target. Damage with triple value: " + damageValue * 3);
    }
}


