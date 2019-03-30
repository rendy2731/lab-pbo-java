package TugasPraktikum.AttributeBehaviourAndConstructor.NomorSatu;

import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);

          System.out.print("Masukkan Jumlah Player : ");
          int player = in.nextInt();
          String[] name = new String[player];
          int[] atk = new int[player];
          int[] def = new int[player];
          Player[] hero = new Player[player];

          for (int i = 0; i < player; i++) {
               in.nextLine();
               System.out.println("Player - " + (i + 1));
               System.out.print("Nama\t: ");
               name[i] = in.nextLine();
               System.out.print("Atk\t: ");
               atk[i] = in.nextInt();
               System.out.print("Def\t: ");
               def[i] = in.nextInt();

               hero[i] = new Player(name[i], atk[i], def[i]);
          }
          in.close();

          hero[0].takeDamage(hero[1]);
          hero[1].takeDamage(hero[0]);
          hero[0].status();
          hero[1].status();
     }
}