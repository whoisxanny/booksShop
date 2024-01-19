package pro.sky.booksshop.service;

import org.springframework.stereotype.Service;
import pro.sky.booksshop.printed.AuthorName;
import pro.sky.booksshop.printed.Book;
import pro.sky.booksshop.printed.Magazin;
import pro.sky.booksshop.printed.PrintedProduct;

import java.util.*;

@Service
public interface PrintedService {

    Map<String, PrintedProduct> printedList = new HashMap<>(Map.of());


    Book add(String name, int publicationYear, int pagesQuantity, AuthorName author, String id);

    Book find(String name, int publicationYear, int pagesQuantity, AuthorName author, String id);

    Magazin add(String name, int publicationYear, int pagesQuantity, String type, String producer, String id);

    Magazin find(String name, int publicationYear, int pagesQuantity, String type, String producer, String id);

    Collection<Book> findBooks();

    Collection<Magazin> findMagazins();

    Collection<PrintedProduct> findAllStuff();
}
