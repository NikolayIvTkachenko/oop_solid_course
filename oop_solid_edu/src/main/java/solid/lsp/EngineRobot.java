package solid.lsp;

public abstract class EngineRobot {
    protected Integer power;
    public Integer getPower() {
        return power;
    }
    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void reloadFuel();
}


