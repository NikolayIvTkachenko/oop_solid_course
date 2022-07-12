package solid.lsp;

public class AtomicEngineV2  extends AtomicEngineV1{
    private Integer additionalPower;
    public AtomicEngineV2(Integer power) {
        super(power);
        additionalPower = power * 3;
    }
    public Integer getAdditionalPower() {
        return additionalPower;
    }
    @Override
    public void startEngine() {
        System.out.println("Turn off the First Valve");
        System.out.println("Turn off the Second Valve");
        super.startEngine();
    }
}







