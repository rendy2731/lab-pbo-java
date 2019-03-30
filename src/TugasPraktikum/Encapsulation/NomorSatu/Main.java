package TugasPraktikum.Encapsulation.NomorSatu;

import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          System.out.print("Masukkan nama buku : ");
          String nameBook = in.nextLine(); 
          System.out.print("Masukkan Harga Buku : ");
          double price = in.nextDouble();
          in.nextLine();
          System.out.print("Masukkan Nama Author : ");
          String nameAuthor = in.nextLine();
          System.out.print("E-Mail : ");
          String email = in.nextLine();
          System.out.println("Jenis Kelamin : \n 1. Pria \n 2. Wanita");
          
          char gender = ' ';
          switch (in.nextInt()) {
               case 1:
                    gender = 'L';
                    break;
               default:
                    gender = 'W';
                    break;
          }
          in.close();

          Author author = new Author(nameAuthor, email, gender);
          Book book = new Book(nameBook, author, price);
          book.show();
     }
}