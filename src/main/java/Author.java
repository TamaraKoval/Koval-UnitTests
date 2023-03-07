import java.time.LocalDate;

public class Author {
    public String name;
    public String surname;
    public int numberOfBooks;
    public String abbreviatedAuthor;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.numberOfBooks = 0;
        this.abbreviatedAuthor = name.charAt(0) + "." + surname;
    }
    public String toString() {
        return abbreviatedAuthor;
    }
    public String showNumber() {
        return "Количество книг автора: " + abbreviatedAuthor + " = " + numberOfBooks;
        // return "Количество книг автора: " + name + " " + surname + " = " + numberOfBooks;
    }

    public Book newBook(String title) {
        return new Book(title, this, LocalDate.now().getYear());
    }
}