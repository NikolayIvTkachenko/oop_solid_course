package oop;

import java.util.ArrayList;

public class AppMainOOP {

    public static void main(String[] args) {

        AtomicGenerator atomicGeneratorV01 = new AtomicGenerator(
                2,
                10,
                "Atomic Device Model  001",
                5000,
                1000,
                Constants.TIME_TO_LIVE_ATOMIC_FUEL_CONSUMPTION,
                5);

        AtomicGenerator atomicGeneratorV02 = new AtomicGenerator(
                4,
                20,
                "Atomic Device Model 101",
                10000,
                8000,
                Constants.TIME_TO_LIVE_ATOMIC_FUEL_CONSUMPTION,
                20);

        AtomicGenerator atomicGeneratorV03 = new AtomicGenerator(
                1,
                5,
                "Atomic Device Model 002",
                500,
                500,
                Constants.TIME_TO_LIVE_ATOMIC_FUEL_CONSUMPTION,
                4);


        FusionReactor fusionReactorV01 = new FusionReactor(TypeFusionFuel.GENERAL_PROTON_FUEL,
                "Fusion Device Model 001",
                5000,
                50000,
                Constants.TIME_TO_LIVE_TOTAL_FUSION_FUEL_CONSUMPTION,
                10);

        FusionReactor fusionReactorV02 = new FusionReactor(TypeFusionFuel.TURBO_DI_HYDROGEN_FUEL,
                "Fusion Device Model 011",
                3000,
                100000,
                Constants.TIME_TO_LIVE_TOTAL_FUSION_FUEL_CONSUMPTION,
                8);

        FusionReactor fusionReactorV03 = new FusionReactor(TypeFusionFuel.TURBO_DI_HYDROGEN_FUEL,
                "Fusion Device Model 151",
                9000,
                100000,
                Constants.TIME_TO_LIVE_TOTAL_FUSION_FUEL_CONSUMPTION,
                20);

        EthierGenerator ethierGeneratorV01 = new EthierGenerator(
                "Ethier Device Model 001",
                2000,
                20000,
                1);

        EthierGenerator ethierGeneratorV02 = new EthierGenerator(
                "Ethier Device Model 201",
                5000,
                100000,
                5);

        EthierGenerator ethierGeneratorV03 = new EthierGenerator(
                "Ethier Device Model 901",
                10000,
                200000000,
                100);


        ArrayList<EnergyGenerator> listGenerators = new ArrayList<>();
        listGenerators.add(atomicGeneratorV01);
        listGenerators.add(atomicGeneratorV02);
        listGenerators.add(atomicGeneratorV03);
        listGenerators.add(fusionReactorV01);
        listGenerators.add(fusionReactorV02);
        listGenerators.add(fusionReactorV03);
        listGenerators.add(ethierGeneratorV01);
        listGenerators.add(ethierGeneratorV02);
        listGenerators.add(ethierGeneratorV03);

        Integer i = 0;
        System.out.println("===Show All===");
        for(EnergyGenerator item : listGenerators){
            System.out.println(i + " ------");
            i++;
            System.out.println(item.toString());
        }

        i=0;
        System.out.println("===Show only I_Reloadable===");
        for(EnergyGenerator item : listGenerators){
            if (item instanceof I_Reloadable){
                System.out.println(i + " ------");
                i++;
                System.out.println(item.toString());
                ((I_Reloadable) item).reloadFuel();
            }
        }

    }
}
