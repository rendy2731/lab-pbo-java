package TugasPraktikum.ObjectAndClass.NomorDua;

public class Rectangle {

     private double width, height;

     public double getArea() {
          return this.width * this.height;
     }

     public void setHeight(double height) {
          this.height = height;
     }

     public void setWidth(double width) {
          this.width = width;
     }

     public void show() {
          System.out.println("Luas = " + getArea() + " cm");
     }
}