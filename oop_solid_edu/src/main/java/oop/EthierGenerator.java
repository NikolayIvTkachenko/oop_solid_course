package oop;

public class EthierGenerator extends EnergyGenerator{

    public EthierGenerator(String nameDevice, Integer weight, Integer power, Integer size) {
        super(nameDevice, weight, power, Constants.TIME_TO_LIVE_TOTAL_ETHIER_FUEL_CONSUMPTION, size);
    }

    @Override
    public Integer generateEnergy() {
        return power;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
