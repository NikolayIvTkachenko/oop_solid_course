package oop.dry;

public class FlyRobot extends BaseRobot{
    protected Integer flightDistance;

    public FlyRobot(Integer weight, Integer flightDistance) {
        super(weight);
        this.flightDistance = flightDistance;
    }

    public Integer getFlightDistance() {
        return flightDistance;
    }
}
