package solid.lsp;

public class AtomicEngineV2_LSP extends AtomicEngineV1_LSP {
    private Integer additionalPower;
    public AtomicEngineV2_LSP(Integer power) {
        super(power);
        additionalPower = power * 3;
    }
    public Integer getAdditionalPower() {
        return additionalPower;
    }
    public void complexStartEngine(){
        System.out.println("Turn off the First Valve");
        System.out.println("Turn off the Second Valve");
        startEngine();
    }
}


