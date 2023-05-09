package KitapSiralayici;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>();
        books.add(new Book("Safahat", 210, " Mehmet Âkif Ersoy", 1911));
        books.add(new Book("Sefiller", 321, "Victor Hugo", 1862));
        books.add(new Book("Cile", 354, "Necip Fazıl Kısakürek", 1962));
        books.add(new Book("Araba Sevdası", 242, "Recaizade Mahmud Ekrem", 1898));
        books.add(new Book("Transformation", 1445, "Franz Kafka", 1915));

        for (Book book : books) {
            System.out.println(book.getBookName() + " , " + book.getNumber());
        }
    }
}
