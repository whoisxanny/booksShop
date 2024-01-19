package pro.sky.booksshop.printed;

public abstract class PrintedProduct {
    private String name;
    private int publicationYear;

    private int pagesQuantity;

    private String id;

    public PrintedProduct(String name, int publicationYear, int pagesQuantity, String id) {
        this.id = id;
        this.name = name;
        this.publicationYear = publicationYear;
        this.pagesQuantity = pagesQuantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPagesQuantity() {
        return pagesQuantity;
    }

    public void setPagesQuantity(int pagesQuantity) {
        this.pagesQuantity = pagesQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        if (publicationYear > 1700) {
            this.publicationYear = publicationYear;
        } else {
            throw new RuntimeException("There is a mistake with publication year!");
        }
    }
}
