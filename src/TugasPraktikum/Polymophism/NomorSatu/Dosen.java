package TugasPraktikum.Polymophism.NomorSatu;

public class Dosen extends Pegawai{

     private int bonus;

     public Dosen(String name, int sks) {
          super(name);
          this.bonus = 120000 * sks;
     }

     @Override
     public int getSalary() {
          return super.getSalary() + bonus;
     }

     @Override
     public void print() {
          super.print();
     }
}