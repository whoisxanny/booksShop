package pro.sky.booksshop.printed;

import java.util.Objects;

public class Book extends PrintedProduct {

    private final AuthorName author;

    public Book(String name, int publicationYear, int pagesQuantity, AuthorName author, String id) {
        super(name, publicationYear, pagesQuantity, id);
        this.author = author;
    }

    public AuthorName getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author);
    }

    @Override
    public void setId(String id) {
        if (id.startsWith("1")) {
            this.setId(id);
        }
    }
}
