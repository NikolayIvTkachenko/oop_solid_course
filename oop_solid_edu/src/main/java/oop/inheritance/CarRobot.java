package oop.inheritance;

import oop.encapsulation.BaseRobot;

public class CarRobot extends BaseRobot {

    private Integer manipulators;

    public CarRobot(Integer wheels, Integer manipulators) {
        this.wheels = wheels;
        this.manipulators = manipulators;
    }

    public Integer getManipulators() {
        return manipulators;
    }

    public void setManipulators(Integer manipulators) {
        this.manipulators = manipulators;
    }
}

