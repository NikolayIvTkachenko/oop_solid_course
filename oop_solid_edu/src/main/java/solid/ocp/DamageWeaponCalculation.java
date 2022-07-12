package solid.ocp;

public class DamageWeaponCalculation {
    public Integer damageWeaponsFire(WeaponGeneral wg){

        if (wg instanceof LaserMining){
            return wg.getDamageValue() * 2;
        } else if (wg instanceof LaserMilitary) {
            return wg.getDamageValue() * 20;
        } else {
            return wg.getDamageValue();
        }
    }
}



