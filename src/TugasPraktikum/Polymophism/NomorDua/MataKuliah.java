package TugasPraktikum.Polymophism.NomorDua;

public class MataKuliah extends Portal{

     private Nilai nilai;
     private String mk, dosen, sks;

     public MataKuliah(int matakuliah) {
          setMataKuliah(matakuliah);
     }

     public String getName() {
          return mk;
     }

     public Nilai getNilai() {
          return nilai;
     }

     public String getDosen() {
          return dosen;
     }

     public int getSks() {
          return Integer.valueOf(sks);
     }

     @Override
     public void print() {

     }

     private void setMataKuliah(int matakuliah) {
          String[][]db = 
          {
               {"Persamaan Diferensial","Prof. Syamsuddin Toaha","3"},
               {"Pemrosesan Citra Digital","Diaraya","3"},
               {"Riset Tekonologi Informasi","Dosen Ilkom","3"},
               {"Teori Bilangan","Loeky","3"},
               {"Aljabar Linear","Loeky","3"},
               {"Pemograman Berorientasi Objek","Supri","3"},
               {"Struktur Data","Edi Saputra","3"},
               {"Pemograman Mobile","Supri","3"}
          };
          this.mk = db[matakuliah][0];
          this.dosen = db[matakuliah][1];
          this.sks = db[matakuliah][2];
     }
}