package solid.srp;

public abstract class AbstractRobot {
    protected Integer mass;
    protected Integer speed;
    protected Integer shield;
    protected Integer construction;
    protected Integer coordinateX;
    protected boolean mooving;
    public AbstractRobot(Integer mass, Integer speed, Integer shield, Integer construction, Integer coordinateX, boolean mooving) {
        this.mass = mass;
        this.speed = speed;
        this.shield = shield;
        this.construction = construction;
        this.coordinateX = coordinateX;
        this.mooving = mooving;
    }

    public Integer getMass() {
        return mass;
    }
    public void setMass(Integer mass) {
        this.mass = mass;
    }
    public Integer getSpeed() {
        return speed;
    }
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
    public Integer getShield() {
        return shield;
    }
    public void setShield(Integer shield) {
        this.shield = shield;
    }
    public Integer getConstruction() {
        return construction;
    }
    public void setConstruction(Integer construction) {
        this.construction = construction;
    }
    public boolean isMooving() {
        return mooving;
    }
    public void setMooving(boolean mooving) {
        this.mooving = mooving;
    }

    public abstract String prepareStatus();
    public abstract void printDetails();
    public abstract void saveStatusRobot();
    public abstract void loadStatusRobot();
}


