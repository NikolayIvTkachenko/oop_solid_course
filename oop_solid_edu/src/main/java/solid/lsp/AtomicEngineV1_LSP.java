package solid.lsp;

public class AtomicEngineV1_LSP extends EngineRobot{
    public AtomicEngineV1_LSP(Integer power) {
        this.power = power;
    }

    @Override
    public void startEngine() {
        System.out.println("Start Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");
    }

    @Override
    public void reloadFuel() {
        System.out.println("Reload Fuel. Max level of Fuel");
    }
}


