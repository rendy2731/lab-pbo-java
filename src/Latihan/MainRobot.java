public class MainRobot {

     public static void main(String[] args) {

          Robot robot1 = new Robot("1LM-Com-UH");
          robot1.powerON();
          robot1.checkBatteryLevel();
          robot1.moveBack(5);
          robot1.moveForward(10);
          robot1.checkBatteryLevel();
          robot1.moveBack(20);
          robot1.checkBatteryLevel();
          robot1.moveForward(100);
          robot1.checkBatteryLevel();

     }
}
