package oop.abstraction;

public abstract class BaseRobot {

    public Integer wheels;

    public void move(){
        System.out.println("The Robot is moving");
    }

    public void stop(){
        System.out.println("The Robot has stop");
    }

}
