package TugasPraktikum.Polymophism.NomorDua;

public class Mahasiswa extends Portal {

     private String name, nim, kelas;
     private Nilai nilai;
     private MataKuliah mk;

     public Mahasiswa(String name, String nim, String kelas, Nilai nilai, MataKuliah mataKuliah) {
          this.name = name;
          this.kelas = kelas;
          this.nim = nim;
          this.mk = mataKuliah;
          this.nilai = nilai;
     }

     @Override
     public String getName() {
          return name;
     }

     public String getKelas() {
          if (kelas == "ilkom-A") {
               return "A";
          }
          return "B";
     }

     public String getNim() {
          return nim;
     }

     public Nilai getNilai() {
          return nilai;
     }

     public MataKuliah getMk() {
          return mk;
     }

     @Override
     public void print() {
          System.out.println("-----------------------------------------------------");
          System.out.println("\t\t   Sistem Akademik");
          System.out.println("-----------------------------------------------------");
          System.out.println("Nama \t\t : " + getName());
          System.out.println("NIM \t\t : " + getNim());
          System.out.println("Mata Kuliah \t : " + getMk().getName() + " " + getKelas());
          System.out.println("SKS \t\t : " + getMk().getSks());
          System.out.println("Dosen \t\t : " + getMk().getDosen());
          getNilai().print();
          System.out.println("-----------------------------------------------------");
     }
}