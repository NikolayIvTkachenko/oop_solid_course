package oop.inheritance;

public class FlyRobot extends BaseRobot {

    private Integer wings;

    public FlyRobot(Integer wheels, Integer wings) {
        this.wheels = wheels;
        this.wings = wings;
    }

    public Integer getWings() {
        return wings;
    }

    public void setWings(Integer wings) {
        this.wings = wings;
    }

    public void fly(){
        System.out.println("The Robot is flying");
    }

    public void land(){
        System.out.println("The Robot has landed");
    }
}


