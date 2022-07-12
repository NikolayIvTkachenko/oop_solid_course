package oop;

public class AtomicGenerator extends EnergyGenerator implements I_Reloadable{

    private Integer numberOfReactor;
    private Integer radioactiveDamage;

    public AtomicGenerator(Integer numberOfReactor, Integer radioactiveDamage, String nameDevice, Integer weight, Integer power, Long timeLive, Integer size) {
        super(nameDevice, weight, power, timeLive, size);
        this.numberOfReactor = numberOfReactor;
        this.radioactiveDamage = radioactiveDamage;
    }

    @Override
    public Integer generateEnergy() {
        if (timeLive <= 0){
            return 0;
        }
        timeLive -= Constants.TOTAL_ATOMIC_FUEL_CONSUMPTION;
        return power;
    }

    @Override
    public void reloadFuel() {
        timeLive = Constants.TIME_TO_LIVE_ATOMIC_FUEL_CONSUMPTION;
    }
}
