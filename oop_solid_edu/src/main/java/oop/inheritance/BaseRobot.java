package oop.inheritance;

public abstract class BaseRobot {

    protected Integer wheels;

    public Integer getWheels() {
        return wheels;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }

    public void move(){
        System.out.println("The Robot is moving");
    }

    public void stop(){
        System.out.println("The Robot has stop");
    }

}

