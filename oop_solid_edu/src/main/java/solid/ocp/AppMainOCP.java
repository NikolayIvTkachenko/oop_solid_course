package solid.ocp;

public class AppMainOCP {

    public static void main(String[] args) {

        System.out.println("OCP - open Close Principle");

        System.out.println("=== Without OCP ===");
        WeaponGeneral weaponGeneral = new WeaponGeneral ();
        LaserMilitary laserMilitary = new LaserMilitary();
        LaserMining laserMining = new LaserMining();
        DamageWeaponCalculation damageWeaponCalculation = new DamageWeaponCalculation();
        System.out.println("LaserMilitary damage = " + damageWeaponCalculation.damageWeaponsFire(laserMilitary));
        System.out.println("Weapon damage = " + damageWeaponCalculation.damageWeaponsFire(weaponGeneral));
        System.out.println("LaserMining damage = " + damageWeaponCalculation.damageWeaponsFire(laserMining));


        System.out.println("=== With OCP ===");
        WeaponsOCP weaponsOCP = new WeaponsOCP();
        LaserMilitaryOCP laserMilitaryOCP = new LaserMilitaryOCP();
        LaserMiningOCP laserMiningOCP = new LaserMiningOCP();

        DamageWeaponCalculationOCP damageWeaponCalculationOCP = new DamageWeaponCalculationOCP();
        System.out.println("LaserMilitary damage = " + damageWeaponCalculationOCP.damageWeaponsFire(laserMilitaryOCP));
        System.out.println("Weapon damage = " + damageWeaponCalculationOCP.damageWeaponsFire(weaponsOCP));
        System.out.println("LaserMining damage = " + damageWeaponCalculationOCP.damageWeaponsFire(laserMiningOCP));
    }

}
