package TugasPraktikum.Polymophism.NomorDua;

import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);

          System.out.print("Nama ::> ");
          String name = in.nextLine();
          System.out.print("NIM ::> ");
          String nim = in.nextLine();
          System.out.println("Kelas ::> ");
          System.out.println("1. ilkom-A");
          System.out.println("2. ilkom-B");
          System.out.print("Masukkan Angka : ");
          String kelas = "";
          switch (in.nextInt()){
               case 1:
                    kelas = "ilkom-A";
                    break;         
               default:
                    kelas = "ilkom-B";
                    break;
          }

          System.out.println("Mata Kuliah ::> ");
          System.out.println("0. Persamaan Diferensial");
          System.out.println("1. Pemrosesan Citra Digital");
          System.out.println("2. Riset Teknologi Informasi");
          System.out.println("3. Teori Bilangan");
          System.out.println("4. Aljabar Linear");
          System.out.println("5. Pemrograman Berorientasi Objek");
          System.out.println("6. Struktur Data");
          System.out.println("7. Pemograman Mobile");
          System.out.print("Masukkan Angka : ");
          int matakuliah = in.nextInt();
          MataKuliah mataKuliah = new MataKuliah(matakuliah);

          System.out.print("Nilai UTS ::> ");
          double uts = in.nextDouble();
          System.out.print("Nilai UAS ::> ");
          double uas = in.nextDouble();
          in.close();
          Nilai nilai = new Nilai(uas, uts);

          Mahasiswa mhs = new Mahasiswa(name, nim, kelas, nilai, mataKuliah);
          mhs.print();
     }
}