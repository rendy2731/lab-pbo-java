package TugasPraktikum.ObjectAndClass.NomorDua;

import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          Rectangle rec = new Rectangle();

          System.out.print("Masukkan Panjang : ");
          double width = in.nextDouble();
          System.out.print("Masukkan Lebar : ");
          double height = in.nextDouble();
          in.close();

          rec.setWidth(width);
          rec.setHeight(height);
          rec.show();
          
     }
}
