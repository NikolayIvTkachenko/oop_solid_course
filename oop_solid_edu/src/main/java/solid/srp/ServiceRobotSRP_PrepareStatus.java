package solid.srp;

public class ServiceRobotSRP_PrepareStatus {

    public String prepareStatus(Integer shield, Integer construction){
        if (shield > 0 && construction > 0){
            return "The Robot has shield and construction!";
        } else if (shield == 0 && construction > 0) {
            return "The Robot has construction but shield have been lost!";
        } else {
            //shield == 0 and construction == 0
            return "The robot was destroyed!";
        }
    }
}
