package pro.sky.booksshop.printed;

import java.util.Objects;

public class Magazin extends PrintedProduct {

    private String type;

    private String producer;

    public Magazin(String name, int publicationYear, int pagesQuantity, String type, String producer,String id) {
        super(name, publicationYear, pagesQuantity, id);
        this.type = type;
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazin magazin = (Magazin) o;
        return Objects.equals(type, magazin.type) && Objects.equals(producer, magazin.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, producer);
    }
}
