package solid.ocp;

import solid.ConstantsRobots;

public class LaserMiningOCP extends WeaponsOCP{
    @Override
    public Integer getDamageValue() {
        return ConstantsRobots.DamageLaserMining;
    }
}


