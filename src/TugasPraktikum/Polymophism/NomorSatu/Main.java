package TugasPraktikum.Polymophism.NomorSatu;

import java.util.Scanner;

public class Main {

     
     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);

          // Input Data Staf
          System.out.print("Nama Staf \t::> ");
          String n = in.nextLine();
          System.out.print("Jumlah Kehadiran::> ");
          int m = in.nextInt();
          Staf staf = new Staf(n, m);
          staf.getSalary();
          in.nextLine();

          // Input Data Dosen
          System.out.print("Nama Dosen \t::> ");
          String n1 = in.nextLine();
          System.out.print("Jumlah sks \t::> ");
          int m1 = in.nextInt();
          Dosen dosen = new Dosen(n1, m1);
          dosen.getSalary();
          in.nextLine();

          // Input Data Pegawai
          System.out.print("Nama Pegawai \t::> ");
          String n2 = in.nextLine();
          in.close();
          Pegawai pegawai = new Pegawai(n2);
          pegawai.getSalary();
          System.out.println();

          // Cetak gaji semua pegawai
          staf.print();
          dosen.print();
          pegawai.print();
     }
}