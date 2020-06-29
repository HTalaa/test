package POO.PresentationLibrary;

import java.util.ArrayList;
import java.util.Arrays;

public class Main_run {
    public static void main(String[] args) throws Exception {

        System.out.println("WE TRY TO CREATE a BOOK with EMPTY TITLE");
        // Book with empty title
        try {
            Book book = new Book("", "Leo Tolstoi", 20.50f, 50);
            System.out.println(book);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


        System.out.println("WE TRY TO CREATE a BOOK with EMPTY AUTHOR");
        // Book with empty author
        try {
            Book book = new Book("Anna Karenina", "", 20.50f, 50);
            System.out.println(book);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


        System.out.println("WE TRY TO CREATE a VERY EXPENSIVE BOOK");
        try {
            Book book = new Book("Anna Karenina", "Leo Tolstoi", 3500f, 50);
            System.out.println(book);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("WE TRY TO CREATE a BOOK with NEGATIVE PAGE NUMBER");
        try {
            Book book = new Book("Anna Karenina", "Leo Tolstoi", 35f, -1);
            System.out.println(book);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("WE TRY TO CREATE a BOOK with all wrong parameters");
        try {
            Book book = new Book("", "", 500, -1);
            System.out.println(book);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


//        //VARIOUS LIBRARIES ARE CREATED

        System.out.println("WE CREATE A LIBRARY ONLY FOR BOOKS");
        Library<Book> myLibBook =  new Library<>("LibOnlyBook");
        System.out.println(myLibBook);

        System.out.println("WE CREATE A LIBRARY ONLY FOR ALBUMS");
        Library<Album> myLibAlbum =  new Library<>("LibOnlyAlbum");
        System.out.println(myLibAlbum);

        System.out.println("WE CREATE A LIBRARY ONLY FOR ALBUMS");
        Library<BD> myLibBD =  new Library<>("LibOnlyBD");
        System.out.println(myLibBD);


//        // Book with banned author
//        try {
//            Book book = new Book("Summer", "Ivanov", 100, 30);
//            //System.out.println(book);
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//



        //TRY TO ADD A NEW BOOK TO VARIOUS LIBRARIES
        System.out.println("WE ADD BOOKS to LIBRARY");
        try {
            Book book1 = new Book("War and Peace", "Leo Tolstoi", 18.5f, 500);
            myLibBook.addMediaToCatalogFile(book1); // new Book is added to Library "only for books"
            Book book2 = new Book("War and Peace", "Leo Tolstoi", 30.50f, 600);
            myLibBook.addMediaToCatalogFile(book2); // new Book is added to Library "only for books"
            Book book3 = new Book("Anna Karenina", "Leo Tolstoi", 20.50f, 200);
            myLibBook.addMediaToCatalogFile(book3); // new Book is added to Library "only for books"
            //myLibAlbum.addMediaToCatalogFile(book); //it is not possible to add a Book to "onlyAlbum" library
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("\nWE TRY to ADD a BOOK with BANNED AUTHOR to LIBRARY");
        try {
            Book book2 = new Book("Summer", "Ivanov", 100, 30);
            myLibBook.addMediaToCatalogFile(book2); // It is not possible to add book of banned author
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
//
        System.out.println("WE TRY TO CREATE a ALBUM with EMPTY Track title");
        try {
            Album album = new Album("Let There Be Cello", "Hauser", 100f, new ArrayList<>(Arrays.asList("", "Concept2","Cadenza", "Hallelujah" )));
            System.out.println(album);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        // TRY TO ADD A NEW ALBUM TO ALBUM TO LIBRARY
        System.out.println("\n WE ADD ALBUMs to LIBRARY");
        try {
            Album album1 = new Album("Let There Be Cello", "Hauser", 20f, new ArrayList<>(Arrays.asList("Eye Of The Tiger", "Concept2","Cadenza", "Hallelujah" )));
            //myLibBook.addMediaToCatalogFile(album); // it is not possible to add a Album to "onlyBook" library
            myLibAlbum.addMediaToCatalogFile(album1); //new Album is added to Library "only for albums"
            Album album2 = new Album("Let Be", "Dupont", 20f, new ArrayList<>(Arrays.asList("Eyes", "Tiger","Life" )));
            //myLibBook.addMediaToCatalogFile(album); // it is not possible to add a Album to "onlyBook" library
            myLibAlbum.addMediaToCatalogFile(album2); //new Album is added to Library "only for albums"
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        //TRY TO ADD A NEW BD TO LIBRARY
        System.out.println("\n WE ADD BDs to LIBRARY");
        try {
            BD bd1 = new BD("Tintin in the Congo", "Hergé", 12f, "Casterman");
            myLibBD.addMediaToCatalogFile(bd1); // new Book is added to Library "only for books"
            BD bd2 = new BD("Les Cigares du pharaon", "Hergé", 15.5f, "Casterman");
            myLibBD.addMediaToCatalogFile(bd2); // new Book is added to Library "only for books"
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


        // Print in console ALL medias from the catalogs of Libraries
        System.out.println("\n WE PRINT THE CATALOG OF ALL MEDIAS PER EACH LIBRARY");
        myLibAlbum.printCatalog();
        myLibBD.printCatalog();
        myLibBook.printCatalog();


        // Customer takes a media
        System.out.println("\n CUSTOMERS WANTS to TAKE A BOOK from BOOK LIBRARY");
        myLibBook.takeMedia("Anna Karenina", "Leo Tolstoi", "Hamid"); // Customer takes a book in the library. The information is stored is separate file.
        myLibBook.takeMedia("Anna", "Leo Leo", "Tanya"); // Customer cannot take a book, as there is no this book in catalog
        myLibBook.takeMedia("Anna Karenina", "Leo Tolstoi", "Joseph"); // Customer cannot take a book, as this book was taken ny other customer

        myLibBook.returnMedia("B-301");


    }
}
