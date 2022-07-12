package oop.polymorhism;

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

    //Overriding Polymorphism
    @Override
    public void move() {
        System.out.println("The Fly Robot is moving");
    }

    @Override
    public void stop() {
        System.out.println("The Fly Robot has stop");
    }

    //Overloading Polymorphism
    public void move(Integer distance) {
        System.out.println("The Fly Robot is moving to distance - " + distance + " km");
    }

    public Integer move(Integer distance, Integer powerReserve) {
        System.out.println("The Fly Robot is moving to distance - " + distance + " km");
        return powerReserve - distance;
    }

}




