package solid.ocp;

import solid.ConstantsRobots;

public class WeaponGeneral {
    private Integer damageValue;
    public WeaponGeneral() {
        this.damageValue = ConstantsRobots.BaseDamageWeapons;
    }
    public Integer getDamageValue(){
        return damageValue;
    }
}


