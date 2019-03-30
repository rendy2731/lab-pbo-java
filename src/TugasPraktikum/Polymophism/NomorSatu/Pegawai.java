package TugasPraktikum.Polymophism.NomorSatu;

public class Pegawai {

     private String name;

     public Pegawai(String name) {
          this.name = name;
     }

     public int getSalary() {
          return 2500000;
     }

     public String getName() {
          return name;
     }         

     public void print() {
          System.out.println(name + " mendapatkan gaji Rp." + getSalary());
     }
}