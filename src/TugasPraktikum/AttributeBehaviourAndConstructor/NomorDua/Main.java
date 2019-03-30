package TugasPraktikum.AttributeBehaviourAndConstructor.NomorDua;

import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);

          System.out.print("Masukkan Panjang : ");
          double width = in.nextDouble();
          System.out.print("Masukkan Lebar : ");
          double height = in.nextDouble();
          System.out.print("Masukkan Tinggi : ");
          double depth = in.nextDouble();
          System.out.print("Masukkan Massa : ");
          double mass = in.nextDouble();
          in.close();

          Box box = new Box();
          box.setDepth(depth);
          box.setHeight(height);
          box.setMass(mass);
          box.setWidth(width);

          System.out.println();
          box.show();
          box.setMass(mass * 2);
          box.show();
     }
}