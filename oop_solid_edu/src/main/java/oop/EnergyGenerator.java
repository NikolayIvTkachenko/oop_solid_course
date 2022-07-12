package oop;

public abstract class EnergyGenerator {

    private String nameDevice;
    private Integer weight;
    protected Integer power;
    protected Long timeLive;
    private Integer size;

    public EnergyGenerator(String nameDevice, Integer weight, Integer power, Long timeLive, Integer size) {
        this.nameDevice = nameDevice;
        this.weight = weight;
        this.power = power;
        this.timeLive = timeLive;
        this.size = size;
    }

    public String getNameDevice() {
        return nameDevice;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getPower() {
        return power;
    }

    public Long getTimeLive() {
        return timeLive;
    }

    public Integer getSize() {
        return size;
    }

    public Integer generateEnergy(){
        if (timeLive<=0){
            return 0;
        }
        timeLive-=5;
        return power;
    }

    @Override
    public String toString() {
        return "EnergyGenerator{" +
                "nameDevice='" + nameDevice + '\'' +
                ", weight=" + weight +
                ", power=" + power +
                ", timeLive=" + timeLive +
                ", size=" + size +
                '}';
    }
}
