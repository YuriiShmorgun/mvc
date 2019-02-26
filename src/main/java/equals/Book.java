package equals;

import java.util.Objects;

public class Book {

    private int id;
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return this.getId() == book.getId() &&
               this.getTitle().equals(book.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }
}
