package TugasPraktikum.AttributeBehaviourAndConstructor.NomorDua;

public class Box {

     private double width, height, depth, mass, density;

     public void setWidth(double width) {
          this.width = width;
     }

     public void setHeight(double height) {
          this.height = height;
     }

     public void setDepth(double depth) {
          this.depth = depth;
     }

     public void setMass(double mass) {
          this.mass = mass;
     }

     public double getDensity() {
          density = mass/(width*height*depth);
          return density;
     }

     public void show() {
          System.out.println("Massa jenis : " + getDensity());
     }
}