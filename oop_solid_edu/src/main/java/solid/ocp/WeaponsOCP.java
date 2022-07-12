package solid.ocp;

import solid.ConstantsRobots;

public class WeaponsOCP {
    private Integer damageValue;
    public WeaponsOCP() {
        this.damageValue = ConstantsRobots.BaseDamageWeapons;
    }
    public Integer getDamageValue(){
        return damageValue;
    }
}


