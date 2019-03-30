/**
 * Robot
 * TPLab 2 nomor 2 dan 3;
 */
public class Robot {
     private String name, power;
     private int batteryLevel;

     public Robot(String name) {
          this.name = name;
          this.power = "OFF";

          batteryLevel = 100;
     }

     public void powerON() {
          System.out.println("Robot " + this.name + " Activated");
          power = "ON";
     }

     public void moveForward(int feet) {
          if (power == "OFF") {
               System.out.println("You need turn on the robot");
               return;
          }

          System.out.println("Robot move " + feet + " steps" + " forward");
          batteryLevel = batteryLevel - 5;
     }

     public void moveBack(int feet) {
          if (power == "OFF") {
               System.out.println("You need turn on the robot");
               return;
          }

          System.out.println("Robot move " + feet + " steps" + " back");
          batteryLevel = batteryLevel - 5;
     }

     public void checkBatteryLevel() {
          if (power == "OFF") {
               System.out.println("You need turn on the robot");
               return;
          }

          System.out.println("Robot have " + batteryLevel + "%" + " Battery");
     }
}