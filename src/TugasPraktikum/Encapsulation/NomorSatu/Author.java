package TugasPraktikum.Encapsulation.NomorSatu;

public class Author {

     private String name, email;
     private char gender;

     public Author(String nameAuthor, String email, char gender) {
          this.gender = gender;
          this.name = nameAuthor;
          this.email = email;
     }
     
     public String getName() {
          return name;
     }
     
     public char getGender() {
          return gender;
     }

     public String getEmail() {
          return email;
     }
}