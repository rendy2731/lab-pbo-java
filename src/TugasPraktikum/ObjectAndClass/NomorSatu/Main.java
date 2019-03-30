package TugasPraktikum.ObjectAndClass.NomorSatu;

import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
          Person person = new Person();
          Scanner in = new Scanner(System.in);

          System.out.print("Nama\t\t : ");
          String name = in.nextLine();
          System.out.print("Umur\t\t : ");
          int age = in.nextInt();
          System.out.println("JenisKelamin\t : \n 1. Pria \n 2. Wanita" );
          System.out.print("Masukkan angka : ");
          int no = in.nextInt();
          switch (no) {
               case 1:
                    person.setMale(true);
                    break;
               default:
                    person.setMale(false);
                    break;
          }
          in.close();

          person.setName(name);
          person.setAge(age);
          person.print();
     }
}