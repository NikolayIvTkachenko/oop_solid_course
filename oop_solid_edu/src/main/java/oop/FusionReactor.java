package oop;

public class FusionReactor extends EnergyGenerator implements I_Reloadable{

    private TypeFusionFuel typeOfFuel;

    public FusionReactor(TypeFusionFuel typeOfFuel, String nameDevice, Integer weight, Integer power, Long timeLive, Integer size) {
        super(nameDevice, weight, power, timeLive, size);
        this.typeOfFuel = typeOfFuel;
    }

    @Override
    public Integer generateEnergy() {
        if (timeLive <= 0){
            return 0;
        }
        timeLive -= Constants.TOTAL_FUSION_FUEL_CONSUMPTION;
        return power;
    }

    @Override
    public void reloadFuel() {
        timeLive = Constants.TIME_TO_LIVE_TOTAL_FUSION_FUEL_CONSUMPTION;
    }

    public void reloadFuel(Long timeLiveValue) {
        timeLive = timeLiveValue;
    }

    @Override
    public String toString() {
        return "FusionReactor{" +
                "typeOfFuel=" + typeOfFuel +
                super.toString() +
                '}';
    }
}
