package TugasPraktikum.Polymophism.NomorDua;

abstract class Portal {

     private String name;

     public Portal() { }

     public String getName() {
          return name;
     }
     
     public abstract void print();

}