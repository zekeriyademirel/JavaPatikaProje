package BookList;

import java.util.*;
import java.util.prefs.BackingStoreException;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();

        bookList.add(new Book("Safahat", 330, "Mehmet Âkif Ersoy", 1930));
        bookList.add(new Book("Sefiller", 321, "Victor Hugo", 1862));
        bookList.add(new Book("Cile", 354, "Necip Fazıl Kısakürek", 1962));
        bookList.add(new Book("Araba Sevdası", 242, "Recaizade Mahmud Ekrem", 1898));
        bookList.add(new Book("Transformation", 1445, "Franz Kafka", 1915));
        bookList.add(new Book("Theodora McCann", 219, "Eadie Mariot", 1936));
        bookList.add(new Book("Druise Iglesia", 87, "Cassi Clamp", 1997));
        bookList.add(new Book("Rosemonde Haysey", 249, "Glyn Cluer", 1916));
        bookList.add(new Book("Kuyucakli Yusuf", 145, "Sabahattin Ali", 1965));
        bookList.add(new Book("Metro 2023", 650, "Dmitry Glukhovsky", 2006));

        Map<String, String> bookMap = new TreeMap<>();
        bookList.forEach(book -> bookMap.put(book.getBookName(), book.getAuthorName()));

        for (String s : bookMap.keySet()) {
            System.out.println("Book Name: " + s + "\nAuthorName: " + bookMap.get(s));
        }

        System.out.println("---------------------------------------------------------");

        List<Book> listBook;
        listBook = bookList.stream().filter(book -> book.getPageNumber() > 100).collect(Collectors.toList());
        listBook.stream().forEach(b -> System.out.println("Kitap Adi : " + b.getBookName() + " | " +
                "Sayfa Sayisi : " + b.getPageNumber() + " | " +
                "Yazar : " + b.getAuthorName() + " | " +
                "Yayin Tarihi : " + b.getReleaseDate()));

    }
}
