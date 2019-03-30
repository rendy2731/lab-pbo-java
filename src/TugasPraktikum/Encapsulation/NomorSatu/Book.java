package TugasPraktikum.Encapsulation.NomorSatu;

public class Book {

     private String name;
     private Author author;
     private double price;

     public Book(String nameBook, Author author, double price) {
          this.name = nameBook;
          this.author = author;
          setPrice(price);
     }

     public String getName() {
          return name;
     }

     public Author getAuthor() {
          return author;
     }

     public double getPrice() {
          return price;
     }

     private void setPrice(double price) {
          this.price = price;
     }

     public void show() {
          System.out.println("=============== Book ================");
          System.out.println("Buku\t : " + getName());
          System.out.println("Author\t : " + getAuthor().getName());
          System.out.println("Price\t : " + getPrice());
          System.out.println("============== Author =================");
          System.out.println("Nama\t : " + getAuthor().getName());
          System.out.println("Email\t : " + getAuthor().getEmail());
          System.out.println("Jk\t : " + getAuthor().getGender());
     }
}