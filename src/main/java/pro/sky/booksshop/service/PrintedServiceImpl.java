package pro.sky.booksshop.service;

import pro.sky.booksshop.printed.AuthorName;
import pro.sky.booksshop.printed.Book;
import pro.sky.booksshop.printed.Magazin;
import pro.sky.booksshop.printed.PrintedProduct;

import java.util.Collection;

public class PrintedServiceImpl implements PrintedService {
    @Override
    public Book add(String name, int publicationYear, int pagesQuantity, AuthorName author, String id) {
        Book b = new Book(name, publicationYear, pagesQuantity, author, id);
        if (!printedList.containsKey(id)) {
            printedList.put(id, b);
            return b;
        } else {
            throw new RuntimeException("We alreay have it, thanks");
        }
    }

    @Override
    public Book find(String name, int publicationYear, int pagesQuantity, AuthorName author, String id) {
        return null;
//                printedList.entrySet().stream().filter(e -> e.getKey().startsWith("1"));

    }

    @Override
    public Magazin add(String name, int publicationYear, int pagesQuantity, String type, String producer, String id) {
        return null;
    }

    @Override
    public Magazin find(String name, int publicationYear, int pagesQuantity, String type, String producer, String id) {
        return null;
    }

    @Override
    public Collection<Book> findBooks() {
        return null;
    }

    @Override
    public Collection<Magazin> findMagazins() {
        return null;
    }

    @Override
    public Collection<PrintedProduct> findAllStuff() {
        return null;
    }
}
