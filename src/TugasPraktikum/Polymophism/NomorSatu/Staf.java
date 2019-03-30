package TugasPraktikum.Polymophism.NomorSatu;

public class Staf extends Pegawai{

     private int bonus;

     public Staf(String name, int kehadiran) {
          super(name);
          this.bonus = 50000 * kehadiran;
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