package hw9.task2;

import java.util.ArrayList;
import java.util.List;

class BookMain {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Digital Fortress", "Den Brown", 1998));
        bookList.add(new Book("Angels and Demons", "Den Brown", 2000));
        bookList.add(new Book("The Lost Symbol", "Den Brown", 2009));
        bookList.add(new Book("Origin", "Den Brown", 2017));
        bookList.add(new Book("Harry Potter: Goblet of Fire", "J. K. Rowling", 2000));
        bookList.add(new Book("Harry Potter: Half-Blood Prince", "J. K. Rowling", 2005));

        BookShow bookShowDB = new BookShow() {
            @Override
            public void show() {
                for (Book b : bookList) {
                    if (b.getAuthor().equalsIgnoreCase("Den Brown")) {
                        System.out.println(b.getName() + ", " + b.getYear());
                    }
                }
            }
        };
        System.out.println("-----------------------");
        System.out.println("Author: Den Brown");
        bookShowDB.show();
        System.out.println("-----------------------");
        System.out.println("Author: J. K. Rowling");
        bookList.stream().filter(book -> book.getAuthor().equalsIgnoreCase("J. K. Rowling"))
                .map(book -> {
                    var bn = book.getName();
                    var by = book.getYear();
                    var b = bn + ", " + by;
                    return b;
                })
                .forEach(System.out::println);

    }
}
