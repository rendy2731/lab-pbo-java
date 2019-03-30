package TugasPraktikum.ObjectAndClass.NomorSatu; 

public class Person {

     private String name;
     private int age;
     private boolean isMale;

     public void setAge(int age) {
          this.age = age;
     }

     public int getAge() {
          return age;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getName() {
          return name;
     }

     public void setMale(boolean isMale) {
          this.isMale = isMale;
     }

     public String getGender(){
          return isMale == true ? "Pria" : "Wanita";
     }

     public void print() {
          System.out.println("Nama\t\t : " + getName());
          System.out.println("Umur\t\t : " + getAge() + " tahun");
          System.out.println("Jenis Kelamin\t : " + getGender());
     }
}
