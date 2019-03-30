package TugasPraktikum.Polymophism.NomorDua;

public class Nilai extends Portal {

     private double uas, uts;

     public Nilai(double uas, double uts) {
          this.uas = uas;
          this.uts = uts;
     }

     public double getNilaiAkhir() {
          return (uas + uts) / 2;
     }

     @Override
     public void print() {
          System.out.println("Nilai UTS \t : " + this.uts);
          System.out.println("Nilai UAS \t : " + this.uas);
          System.out.println("Nilai Akhir\t : " + getNilaiAkhir());
          System.out.println("Angka Mutu\t : " + convertNilai());
     }

     private String convertNilai() {
          if (getNilaiAkhir() >= 85) {
               return "A";
          }
          if (getNilaiAkhir() >= 81) {
               return "A-";
          }
          if (getNilaiAkhir() >= 76) {
               return "B+";
          }
          if (getNilaiAkhir() >= 71) {
               return "B";
          }
          if (getNilaiAkhir() >= 66) {
               return "B-";
          }
          if (getNilaiAkhir() >= 61) {
               return "C+";
          }
          if (getNilaiAkhir() >= 55) {
               return "C";
          }
          if (getNilaiAkhir() >= 50) {
               return "D";
          }
          return "E";
     }

}