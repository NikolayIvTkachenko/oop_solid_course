package oop.dry;

public class ConstructionRobot extends BaseRobot{

    protected Integer quantityManipulators;
    protected Boolean grader;

    public ConstructionRobot(Integer weight, Integer quantityManipulators, Boolean grader) {
        super(weight);
        this.quantityManipulators = quantityManipulators;
        this.grader = grader;
    }

    public Integer getQuantityManipulators() {
        return quantityManipulators;
    }

    public Boolean getGrader() {
        return grader;
    }
}
