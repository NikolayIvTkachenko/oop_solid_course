package oop.dry;

public class BaseRobot {

    protected Integer weight;
    protected Integer wheel;
    protected Integer speed;

    public BaseRobot(Integer weight) {
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getWheel() {
        return wheel;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void canGetAdditionWeight(Integer additionalWeight){
        if (additionalWeight > weight){
            System.out.println("I cannot take this weight");
        } else {
            Integer result = weight+additionalWeight;
            System.out.println("My weight and addition weight = " + result);
        }
    }
}
