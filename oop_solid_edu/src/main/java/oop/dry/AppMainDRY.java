package oop.dry;

public class AppMainDRY {

    public static void main(String[] args) {

        FlyRobot flyRobot = new FlyRobot(300, 500);
        ConstructionRobot constructionRobot = new ConstructionRobot(1000, 4, true);

        System.out.println("=== The FlyRobot ===");
        System.out.println("The FlyRobot flies a distance (km): " + flyRobot.getFlightDistance());
        System.out.println("The FlyRobot can take 200 -> ");
        flyRobot.canGetAdditionWeight(200);

        System.out.println("=== The ConstructionRobot ===");
        System.out.println("The ConstructionRobot has manipulators: " + constructionRobot.getQuantityManipulators());
        System.out.println("The ConstructionRobot has grader: " + constructionRobot.getGrader());
        System.out.println("The ConstructionRobot can take 2000 -> ");
        constructionRobot.canGetAdditionWeight(2000);

    }

}
