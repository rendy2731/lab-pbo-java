package TugasPraktikum.Encapsulation.NomorDua;

public class Mahasiswa {

     private String name, nim, prodi;
     private Nilai nilai;

     public Mahasiswa(String name, String nim, String prodi, Nilai nilai) {
          this.name = name;
          this.nim = nim;
          this.prodi = prodi;
          this.nilai = nilai;
     }

     public Nilai getNilai() {
          return nilai;
     }

     public String getName() {
          return name;
     }

     public String getNim() {
          return nim;
     }
     
     public String getProdi() {
          return prodi;
     }

     public void show() {
          System.out.println("======================================");
          System.out.println("Nama\t\t : " + getName());
          System.out.println("NIM\t\t : " + getNim());
          System.out.println("Mata Kuliah\t : " + getNilai().getMatakuliah());
          System.out.println("SKS \t\t : " + getNilai().getSks());
          System.out.println("Nilai\t\t : " + getNilai().getConvertNilai());
          System.out.println("======================================");
     }
}