package solid.lsp;

public class AppMainLSP {

    public static void main(String[] args) {

        System.out.println("LSP - Liskov Substitution Principle");
        System.out.println("===Incorrect===");
        //Incorrect
        AtomicEngineV2 atomicEngineV2 = new AtomicEngineV2(1000);
        atomicEngineV2.startEngine();

        System.out.println("===Correct===");
        System.out.println("===Call Base method===");
        //Correct
        AtomicEngineV2_LSP atomicEngineV2Lsp = new AtomicEngineV2_LSP(1000);
        atomicEngineV2Lsp.startEngine();
        System.out.println("===Call New Complex method===");
        atomicEngineV2Lsp.complexStartEngine();


    }

}
