package TugasPraktikum.Encapsulation.NomorDua;

public class Nilai {

     private int nilai, sks;
     private String matakuliah;

     public Nilai(int nilaimk, String matakuliah, int sks) {
          this.matakuliah = matakuliah;
          this.nilai = nilaimk;
          this.sks = sks;
     }

     private int getNilai() {
          return nilai;
     }

     public String getMatakuliah() {
          return matakuliah;
     }

     public int getSks() {
          return sks;
     }

     public String getConvertNilai() {
          return convertNilai();
     }

     private String convertNilai() {
          if (getNilai() >= 85) {
               return "A";
          }
          if (getNilai() >= 80) {
               return "A-";
          }
          if (getNilai() >= 76) {
               return "B+";
          }
          if (getNilai() >= 71) {
               return "B";
          }
          if (getNilai() >= 66) {
               return "B-";
          }
          if (getNilai() >= 61) {
               return "C+";
          }
          if (getNilai() >= 51) {
               return "C";
          }
          if (getNilai() >= 45) {
               return "D";
          }

          return "E";

     }
}