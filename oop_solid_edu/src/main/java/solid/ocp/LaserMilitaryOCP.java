package solid.ocp;

import solid.ConstantsRobots;

public class LaserMilitaryOCP extends WeaponsOCP{
    @Override
    public Integer getDamageValue() {
        return ConstantsRobots.DamageLaserMilitary;
    }
}


