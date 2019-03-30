package TugasPraktikum.Encapsulation.NomorDua;

import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);   
          System.out.print("Nama : ");
          String name = in.nextLine();
          System.out.print("NIM : ");
          String nim = in.nextLine();
          System.out.print("Program Studi : ");
          String prodi = in.nextLine();
          System.out.print("Mata Kuliah : ");
          String matakuliah = in.nextLine();
          System.out.print("SKS : ");
          int sks = in.nextInt();
          System.out.print("Nilai : ");
          int nilaimk = in.nextInt();
          in.close();    

          Nilai nilai = new Nilai(nilaimk, matakuliah, sks);
          Mahasiswa mhs = new Mahasiswa(name, nim, prodi, nilai);
          mhs.show();
     }
}